from serial import Serial
import numpy
import matplotlib.pyplot as plt
from drawnow import *

plt.ion()
cnt=0
compt = []
y = []
modes = []
states = []
plt.ylabel('State')
plt.title('Histogram of IQ')
state = 0
titre = ""
actual_mode = 0
new_state = False

def getArduinoLogs(port_serie) :
    arduinoString = str(port_serie.readline())[2:-5]
    dataArray = arduinoString.split(' ')
    print(arduinoString)
    return dataArray

def custom_plot():
    plt.plot(compt, y, label="States")
    plt.title("Mode: " + titre)
    x_size = max(20, len(y))
    if (len(states) > 0):
        plt.axis((max(0, x_size - 20), max(20, x_size), 0, len(states[actual_mode])))
        plt.yticks(numpy.arange(len(states[actual_mode])),  states[actual_mode])

with Serial(port="COM5", baudrate=9600, timeout=1, writeTimeout=1) as port_serie:
    while (port_serie.inWaiting()==0):
        pass
    if port_serie.isOpen():
        while True:
            dataArray = getArduinoLogs(port_serie)
            try:
                if (len(dataArray) != 0) :
                    for data in dataArray :
                        subData = data.split("=")
                        if  (subData[0] == "modes") :
                            for mode in subData[1].split(",") :
                                print(mode)
                                modes.append(mode)
                        
                        elif  (subData[0] == "states") :
                            list_s = []
                            for s in subData[1].split(",") :
                                print(s)
                                list_s.append(s)
                            states.append(list_s)

                        elif  (subData[0] == "mode") :
                            titre = modes[int(subData[1])]
                            actual_mode = int(subData[1])
                            print(titre)

                        elif (subData[0] == "state") :
                            new_state = True
                            compt.append(str(cnt))
                            state = subData[1]
                            y.append(state)
                            cnt=cnt+1
                
            except IndexError:
                print("Mauvais lecture")
            
            if (not new_state):
                compt.append(str(cnt))
                y.append(state)
                cnt=cnt+1

            drawnow(custom_plot)
            new_state = False