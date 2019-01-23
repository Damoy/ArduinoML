// Pushing a button will trigger a buzzer if and only if two buttons are pushed at
// the very same time. Releasing at least one of the button stop the sound.

//off {
//	red_led <= LOW
//	button is HIGH => one
//}
//one {
//	red_led <= LOW
//	button is LOW => off
//	button2 is HIGH => two
//}
//two {
//	red_led <= HIGH
//	button is LOW => off
//	button2 is LOW => one
//}

sensor "button1" onPin 8
sensor "button2" onPin 9
actuator "buzzer" onPin 11

state "off" means "buzzer" becomes "low"
state "one" means "buzzer" becomes "low"
state "two" means "buzzer" becomes "high"

initial "off"

from "off" to "one" when "button1" becomes "high"
from "one" to "off" when "button1" becomes "low"
from "one" to "off" when "button2" becomes "high"
from "two" to "off" when "button1" becomes "low"
from "two" to "one" when "button2" becomes "low"

// No button on all states
//from "one" to "off" when "button1" becomes "high" and "button2" becomes "high"
//from "two" to "off" when "button1" becomes "high" and "button2" becomes "high"
//
//// from "two" to "one" when "button1" becomes "high" and "button2" becomes "low"
//// from "two" to "one" when "button2" becomes "high" and "button1" becomes "low"
//
//// Only one
//// from "one" to "off" when "button1" becomes "high" and "button2" becomes "low"
//// from "one" to "off" when "button1" becomes "low" and "button2" becomes "high"
//
//// One button pushed
//from "off" to "one" when "button1" becomes "low" and "button2" becomes "high"
//from "off" to "one" when "button2" becomes "low" and "button1" becomes "high"
//
//// Both buttons pushed
//from "one" to "two" when "button1" becomes "low" and "button2" becomes "low"

export "DualCheckAlarm"