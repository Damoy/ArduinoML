// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(1, INPUT);
	pinMode(12, OUTPUT);
}

//Behavioral concepts
long time=0; long debounce = 200;

void mode_AnalogTest() {
	//initial state
	state_off();
}

void state_off() {
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	if( analogRead(1) >= 500 && guard ) {
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
	if( analogRead(1) < 500 && guard ) {
		time = millis();
		state_off();
	}
	else {
		state_on(); 
	}
}

void loop() {mode_AnalogTest();} // Entering init mode