//Acceptance scenario: Alan wants to define a state machine where LED1 is switched on after
//a push on button B1 and switched off 2000ms after, waiting again for a new push on B1.

sensor "button1" onPin 8
actuator "led1" onPin 11

state "off" means "led1" becomes "low" 
state "on" means "led1" becomes "high"

initial "off"

from "off" to "on" when "button1" becomes "high"
delay 2000 from "on" to "off" when "button1" becomes "low"

export "SimpleTemporalTransition"