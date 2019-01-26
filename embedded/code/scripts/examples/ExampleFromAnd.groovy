sensor "button1" onPin 8
sensor "button2" onPin 8
actuator "led2" onPin 12

state "on" means "led1" becomes "high"
state "off" means "led1" becomes "low"

initial "off"

from "on" to "off" when "button1" becomes "low"
from "on" to "off" when "button2" becomes "low"
from "off" to "on" when "button1" becomes "high"
from "off" to "on" when "button2" becomes "high"

export "ExampleStateMultipleTransitions"