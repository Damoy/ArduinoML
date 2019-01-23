// Pushing a button will trigger a buzzer if and only if two buttons are pushed at
// the very same time. Releasing at least one of the button stop the sound.

//sensor "button1" onPin 8
//sensor "button2" onPin 9
//actuator "buzzer" onPin 11
//
//state "off" means "buzzer" becomes "low"
//state "button1on" and "button2on" means "buzzer" becomes "high"
//state "button1off" and "button2on" means "buzzer" becomes "low"
//state "button1on" and "button2off" means "buzzer" becomes "low"
//state "button1off" and "button2off" means "buzzer" becomes "low"
//
//initial "off"
//
//from "off" to "button1on" when "button1" becomes "high"
//from "off" to "button2on" when "button2" becomes "high"
//from "button1on" to "button1off" when "button1" becomes "low"
//from "button2on" to "button2off" when "button2" becomes "low"
//from "button1off" to "button1on" when "button1" becomes "high"
//from "button2off" to "button2on" when "button2" becomes "high"
//
//export "DualCheckAlarm"