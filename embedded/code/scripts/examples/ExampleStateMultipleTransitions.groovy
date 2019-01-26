sensor "button1" onPin 8
sensor "button2" onPin 9
actuator "led1" onPin 11
actuator "led2" onPin 12

state "on" means "led1" becomes "high" and "led2" becomes "high"
state "off" means "led1" becomes "low" and "led2" becomes "low"

initial "off"

from "on" to "off" when "button1" becomes "low" and "button2" becomes "low"
from "off" to "on" when "button1" becomes "high" and "button2" becomes "high"

export "ExampleFromAnd"