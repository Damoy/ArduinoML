//Pushing the button starts the buzz noise. Pushing it again stop the buzzer and
//switch the LED on. Pushing it again switch the LED off, and makes the system ready to make noise
//again after one push, and so on.

sensor "button" onPin 8
actuator "buzzer" onPin 11
actuator "led" onPin 12

state "buzzerOn" means "buzzer" becomes "high"
state "ledOn" means "buzzer" becomes "low" and "led" becomes "high"
state "none" means "buzzer" becomes "low" and "led" becomes "low"

initial "none"

from "buzzerOn" to "ledOn" when "button" becomes "high"
from "ledOn" to "none" when "button" becomes "high"
from "none" to "buzzerOn" when "button" becomes "high"

export "MultiStateAlarm"