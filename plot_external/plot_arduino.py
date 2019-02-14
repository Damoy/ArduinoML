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
actual_mode = 0
new_state = False

def setTimes(start, times):
    now = datetime.datetime.now()
    time = now - start
    s = time.seconds
    minutes = s // 60
    seconds = s - (minutes * 60)
    times.append('{:02}:{:02}'.format(int(minutes), int(seconds)))

def getArduinoLogs(port_serie) :
    arduinoString = str(port_serie.readline())[2:-5]
    dataArray = arduinoString.split(' ')
    #print(arduinoString)
    return dataArray

def custom_plot():
    plt.plot(compt, y, label="States")
    plt.title("Mode: " + titre + analogs)
    plt.xlabel('Time [mm:ss]')
    plt.ylabel('States')
    x_size = max(20, len(y))
    if (len(states) > 0):
        plt.axis((max(0, x_size - 20), max(20, x_size), 0, len(states[actual_mode])))
        plt.yticks(numpy.arange(len(states[actual_mode])),  states[actual_mode])
        plt.xticks(compt[-20:], times[-20:], rotation=45)

with Serial(port="COM5", baudrate=9600, timeout=1, writeTimeout=1) as port_serie:
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
                            plt.figure(subData[1], figsize=(12,7))

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