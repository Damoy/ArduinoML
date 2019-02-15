from serial import Serial
import numpy
import matplotlib.pyplot as plt
from drawnow import *
import datetime

plt.ion()
cnt=0
compt = []
y = []
times = []
modes = []
states = []
state = 0
titre = ""
analogs = ""
temps = ""
name = ""
actual_mode = 0
new_state = False

def setTimes(start, times):
    global temps
    now = datetime.datetime.now()
    time = now - start
    s = time.seconds
    minutes = s // 60
    seconds = s - (minutes * 60)
    tmp = '{:02}:{:02}'.format(int(minutes), int(seconds))
    if tmp != temps:
        temps = tmp
    else :
        tmp = ""
    times.append(tmp)

def getArduinoLogs(port_serie) :
    arduinoString = str(port_serie.readline())[2:-5]
    dataArray = arduinoString.split(' ')
    #print(arduinoString)

    return dataArray

def custom_plot():
    plt.plot(compt, y, label="States")
    plt.title("Name: " + name + " | Mode: " + titre + analogs)
    plt.xlabel('Time [mm:ss]')
    plt.ylabel('States')
    x_size = max(50, len(y))
    if (len(states) > 0):
        plt.axis((max(0, x_size - 50), max(50, x_size), 0, len(states[actual_mode])))
        plt.yticks(numpy.arange(len(states[actual_mode])),  states[actual_mode])
        plt.xticks(compt[-50:], times[-50:], rotation=45)

with Serial(port="COM5", baudrate=38400, timeout=1, writeTimeout=1) as port_serie:
    while (port_serie.inWaiting()==0):
        pass
    if port_serie.isOpen():
        start = datetime.datetime.now()
        while True:
            dataArray = getArduinoLogs(port_serie)
            try:
                if (len(dataArray) != 0) :
                    for data in dataArray :
                        subData = data.split("=")
                        
                        if  (subData[0] == "name") :
                            name = subData[1]

                        elif  (subData[0] == "modes") :
                            for mode in subData[1].split(",") :
                                #print(mode)
                                modes.append(mode)
                        
                        elif  (subData[0] == "states") :
                            list_s = []
                            for s in subData[1].split(",") :
                                #print(s)
                                list_s.append(s)
                            states.append(list_s)

                        elif  (subData[0] == "mode") :
                            titre = modes[int(subData[1])]
                            actual_mode = int(subData[1])
                            compt = []
                            y = []
                            times = []
                            #print(titre)

                        elif (subData[0] == "state") :
                            new_state = True
                            compt.append(str(cnt))
                            state = subData[1]
                            y.append(state)
                            cnt=cnt+1
                            setTimes(start, times)

                        elif (subData[0] == "analog") :
                            analogs = "\n"
                            for i in range(1, len(subData)):
                                if ((i - 1) % 3 == 0):
                                    analogs += "\n"
                                if (i != 1):
                                    analogs += " | "
                                analogs += subData[i]
                                #print(subData[i])

                
            except IndexError:
                print("Mauvais lecture")
            
            if (not new_state):
                compt.append(str(cnt))
                y.append(state)
                cnt=cnt+1
                setTimes(start, times)

            drawnow(custom_plot)
            new_state = False