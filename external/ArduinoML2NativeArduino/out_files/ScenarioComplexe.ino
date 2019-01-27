// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(12, OUTPUT);
	pinMode(11, OUTPUT);
	pinMode(10, OUTPUT);
	pinMode(8, INPUT);
	pinMode(9, INPUT);
}

//Behavioral concepts
long time=0; long debounce = 200;

void state_off() {
	digitalWrite(12, LOW);
	digitalWrite(11, LOW);
	digitalWrite(10, LOW);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_red_glow();
	}
	if( digitalRead(9) == HIGH && guard ) {
		time = millis();
		state_snooze();
	}
	else {
		state_off(); 
	}
}

void state_red_glow() {
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_green_glow();
	}
	else {
		state_red_glow(); 
	}
}

void state_green_glow() {
	digitalWrite(11, LOW);
	digitalWrite(10, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_off();
	}
	else {
		state_green_glow(); 
	}
}

void state_dual_glow() {
	digitalWrite(11, HIGH);
	digitalWrite(10, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == LOW && digitalRead(9) == LOW && guard ) {
		time = millis();
		state_bip();
	}
	else {
		state_dual_glow(); 
	}
}

void state_bip() {
	digitalWrite(12, HIGH);
	digitalWrite(11, LOW);
	digitalWrite(10, LOW);
	boolean guard = millis() - time > debounce;
	delay(2000);
	state_off();
}

void state_snooze() {
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(9) == LOW && guard ) {
		time = millis();
		state_off();
	}
	else {
		state_snooze(); 
	}
}

void loop() {state_off();} // Entering init state