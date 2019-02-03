// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(0, INPUT);
	pinMode(8, INPUT);
	pinMode(12, OUTPUT);
}

//Behavioral concepts
long time=0; long debounce = 200;

void mode_jour() {
	//setup bricks
	//initial state
	state_off();
}

void state_off() {
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	if( analogRead(0) < 500 && guard ) {
		delay(0);
		time = millis();
		mode_nuit();
	}
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
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	if( analogRead(0) < 500 && guard ) {
		delay(0);
		time = millis();
		mode_nuit();
	}
	if( digitalRead(8) == LOW && guard ) {
		delay(0);
		time = millis();
		state_off();
	}
	else {
		state_on(); 
	}
}

void mode_nuit() {
	//setup bricks
	//initial state
	state_off2();
}

void state_off2() {
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	if( analogRead(0) >= 500 && guard ) {
		delay(0);
		time = millis();
		mode_jour();
	}
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_on2();
	}
	else {
		state_off2(); 
	}
}

void state_on2() {
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	if( analogRead(0) >= 500 && guard ) {
		delay(0);
		time = millis();
		mode_jour();
	}
	if( digitalRead(8) == HIGH && guard ) {
		delay(0);
		time = millis();
		state_off2();
	}
	else {
		state_on2(); 
	}
}

void loop() {mode_jour();} // Entering init mode