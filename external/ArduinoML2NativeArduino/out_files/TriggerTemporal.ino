// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(8, INPUT);
	pinMode(9, INPUT);
	pinMode(10, OUTPUT);
	pinMode(11, OUTPUT);
}

//Behavioral concepts
long time=0; long debounce = 200;

void state_off() {
	digitalWrite(10, LOW);
	digitalWrite(11, LOW);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_on();
	}
	else {
		state_off(); 
	}
}

void state_on() {
	digitalWrite(10, HIGH);
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_off();
	}
	if( digitalRead(9) == HIGH && guard ) {
		delay(3000);
		time = millis();
		state_off();
	}
	else {
		state_on(); 
	}
}

void loop() {state_off();} // Entering init state