sensor "button1" onPin 8
sensor "button2" onPin 9
actuator "buzzer" onPin 11

state "off" means "buzzer" becomes "low"
state "on" means "buzzer" becomes "high"

initial "off"

from "off" to "on" when "button1" becomes "high" and "button2" becomes "high"
from "on" to "off" when "button1" becomes "low" and "button2" becomes "high"
from "on" to "off" when "button1" becomes "high" and "button2" becomes "low"
from "on" to "off" when "button1" becomes "low" and "button2" becomes "low"

export "DualCheckAlarm2States"