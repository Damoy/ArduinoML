//Pushing a button activates a LED and a buzzer. Releasing the button switches
//the actuators off.

sensor "button" onPin 8
actuator "led" onPin 11
actuator "buzzer" onPin 12

state "on" means "led" becomes "low" and "buzzer" becomes "low"
state "off" means "led" becomes "high" and "buzzer" becomes "high"

initial "off"

from "on" to "off" when "button" becomes "high"
from "off" to "on" when "button" becomes "low"

export "SimpleAlarm"