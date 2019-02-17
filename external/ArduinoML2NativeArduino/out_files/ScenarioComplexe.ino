// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(12, OUTPUT);
	pinMode(11, OUTPUT);
	pinMode(10, OUTPUT);
	pinMode(8, INPUT);
	pinMode(9, INPUT);
	Serial.begin(38400);
	Serial.println("name=ScenarioComplexe");
	Serial.println("modes=ScenarioComplexe");
	Serial.println("states=off,red_glow,green_glow,dual_glow,bip,snooze");
}

//Monitoring values
String state_value = "";
String mode_value = "";

//Behavioral concepts
long time=0;
long debounce = 200;
long analog=0;

void mode_ScenarioComplexe() {
	//initial state
	mode_value = "0";
	state_value = "0";
	Serial.println("mode=" + mode_value + " " + "state=" + state_value);
	state_off();
}

void state_off() {
	digitalWrite(12, LOW);
	digitalWrite(11, LOW);
	digitalWrite(10, LOW);
	boolean guard = millis() - time > debounce;
	out_ScenarioComplexe();

	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		state_value = "3";
		out();
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "1";
		out();
		time = millis();
		state_red_glow();
	}
	if( digitalRead(9) == HIGH && guard ) {
		state_value = "5";
		out();
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
	out_ScenarioComplexe();

	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		state_value = "3";
		out();
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "2";
		out();
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
	out_ScenarioComplexe();

	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		state_value = "3";
		out();
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "0";
		out();
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
	out_ScenarioComplexe();

	if( digitalRead(8) == LOW && digitalRead(9) == LOW && guard ) {
		state_value = "4";
		out();
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
	out_ScenarioComplexe();

	delay(2000);
	state_value = "0";
	out();
	state_off();
}

void state_snooze() {
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	out_ScenarioComplexe();

	if( digitalRead(8) == HIGH && digitalRead(9) == HIGH && guard ) {
		state_value = "3";
		out();
		time = millis();
		state_dual_glow();
	}
	if( digitalRead(9) == LOW && guard ) {
		state_value = "0";
		out();
		time = millis();
		state_off();
	}
	else {
		state_snooze(); 
	}
}

void out() {Serial.println("state=" + state_value);}

void out_ScenarioComplexe() {
	boolean time_analog = millis() - analog > debounce;
	if (time_analog) {
		Serial.println();
		analog = millis();
	}
}

void loop() {mode_ScenarioComplexe();} // Entering init mode