/*
 * Press one time on button1 activates green led.
 * Press another time on it deactivates it and activates red led.
 * Pressing button2 activates buzzer.
 * Press (and keep) both buttons activated mean both leds are enlightened.
 * Release one of the buttons keep the same state.
 * Release the two buttons start a buzzer noise for two seconds (temporal transition feature).
 */

sensor "button1" onPin 8
sensor "button2" onPin 9
actuator "greenLed" onPin 10
actuator "redLed" onPin 11
actuator "buzzer" onPin 12

state "off" means "buzzer" becomes "low" and "redLed" becomes "low" and "greenLed" becomes "low"
state "redGlow" means "redLed" becomes "high"
state "greenGlow" means "redLed" becomes "low" and "greenLed" becomes "high"
state "dualGlow" means "redLed" becomes "high" and "greenLed" becomes "high"
state "bip" means "buzzer" becomes "high" and "redLed" becomes "low" and "greenLed" becomes "low"
state "snooze" means "buzzer" becomes "high"

initial "off"

from "off" to "dualGlow" when "button1" becomes "high" and "button2" becomes "high"
from "off" to "redGlow" when "button1" becomes "high"
from "off" to "snooze" when "button2" becomes "high"
from "redGlow" to "dualGlow" when "button1" becomes "high" and "button2" becomes "high"
from "redGlow" to "greenGlow" when "button1" becomes "high"
from "greenGlow" to "off" when "button1" becomes "high"
from "dualGlow" to "bip" when "button1" becomes "low" and "button2" becomes "low"
delay 2000 from "bip" to "off"

from "snooze" to "dualGlow" when "button1" becomes "high" and "button2" becomes "high"
from "snooze" to "off" when "button2" becomes "low" 

export "ComplexScenario"