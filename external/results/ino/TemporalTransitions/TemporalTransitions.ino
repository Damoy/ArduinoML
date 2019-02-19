// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(12, OUTPUT);
	pinMode(8, INPUT);
}

//Behavioral concepts
long time=0;
long debounce = 200;
long analog=0;

void mode_TemporalTransitions() {
	//initial state
	state_off();
}

void state_off() {
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_on();
	}
	else {
		state_off(); 
	}
}

void state_on() {
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	delay(800);
	state_off();
}

void loop() {mode_TemporalTransitions();} // Entering init mode