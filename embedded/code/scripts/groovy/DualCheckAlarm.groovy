// Pushing a button will trigger a buzzer if and only if two buttons are pushed at
// the very same time. Releasing at least one of the button stop the sound.

sensor "button1" onPin 8
sensor "button2" onPin 9
actuator "buzzer" onPin 11

state "on" means "buzzer" becomes "high"
state "off" means "buzzer" becomes "low"

initial "off"

from "on" to "off" when "button1" becomes "low" and "button2" becomes "high"
from "on" to "off" when "button2" becomes "low" and "button1" becomes "high"
from "on" to "off" when "button1" becomes "high" and "button2" becomes "high"

from "off" to "on" when "button1" becomes "low" and "button2" becomes "low"

export "DualCheckAlarm"