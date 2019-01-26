sensor "button1" onPin 8
sensor "button2" onPin 9
actuator "buzzer" onPin 11

state "off" means "buzzer" becomes "low"
state "one" means "buzzer" becomes "low"
state "on" means "buzzer" becomes "high"

initial "off"

from "off" to "one" when "button1" becomes "high"
from "one" to "off" when "button1" becomes "low"
from "one" to "on" when "button2" becomes "high"
from "on" to "off" when "button1" becomes "low"
from "on" to "one" when "button2" becomes "low"

export "DualCheckAlarm3StatesNoAnd"