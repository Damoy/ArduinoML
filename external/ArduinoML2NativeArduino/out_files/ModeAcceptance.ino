// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(1, INPUT);
	pinMode(11, OUTPUT);
	pinMode(8, INPUT);
}

//Behavioral concepts
long time=0;
long debounce = 200;
long analog=0;

void mode_m1() {
	//initial state
	state_m1_off();
}

void m1_to_m2(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) >= 500 && guard ) {
		time = millis();
		mode_m2();
	}
}
void state_m1_off() {
	digitalWrite(11, LOW);
	boolean guard = millis() - time > debounce;
	m1_to_m2();
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_m1_on();
	}
	else {
		state_m1_off(); 
	}
}

void state_m1_on() {
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	m1_to_m2();
	if( digitalRead(8) == LOW && guard ) {
		time = millis();
		state_m1_off();
	}
	else {
		state_m1_on(); 
	}
}

void mode_m2() {
	//initial state
	state_m2_off();
}

void m2_to_m1(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) < 500 && guard ) {
		time = millis();
		mode_m1();
	}
}
void state_m2_off() {
	digitalWrite(11, LOW);
	boolean guard = millis() - time > debounce;
	m2_to_m1();
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_m2_on();
	}
	else {
		state_m2_off(); 
	}
}

void state_m2_on() {
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	m2_to_m1();
	if( digitalRead(8) == HIGH && guard ) {
		time = millis();
		state_m2_off();
	}
	else {
		state_m2_on(); 
	}
}

void loop() {mode_m1();} // Entering init mode