// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(11, OUTPUT);
	pinMode(12, OUTPUT);
	pinMode(8, INPUT);
}

//Behavioral concepts
long time=0; long debounce = 200;

void mode_MultiStateAlarm() {
	//initial state
	state_off();
}

void state_off() {
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_buzz();
	}
	else {
		state_off(); 
	}
}

void state_buzz() {
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_glow();
	}
	else {
		state_buzz(); 
	}
}

void state_glow() {
	digitalWrite(11, LOW);
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_off();
	}
	else {
		state_glow(); 
	}
}

void loop() {mode_MultiStateAlarm();} // Entering init mode