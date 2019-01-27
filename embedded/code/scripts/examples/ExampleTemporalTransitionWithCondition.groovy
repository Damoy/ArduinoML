sensor "button" onPin 8
sensor "button2" onPin 9
actuator "led1" onPin 10
actuator "led2" onPin 11

state "off" means "led1" becomes "low" and "led2" becomes "low"
state "on" means "led1" becomes "high" and "led2" becomes "high"

initial "off"

from "off" to "on" when "button" becomes "high"
delay 2000 from "on" to "off" when "button2" becomes "high"

export "ExampleTemporalTransitionWithCondition"