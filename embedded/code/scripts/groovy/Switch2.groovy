sensor "button" onPin 16
actuator "led1" onPin 17
actuator "led2" onPin 18

state "on" means "led1" becomes "high" and "led2" becomes "high"
state "off" means "led1" becomes "low" and "led2" becomes "low"

initial "off"

from "on" to "off" when "button" becomes "high"
from "off" to "on" when "button" becomes "high"

export "Switch2"