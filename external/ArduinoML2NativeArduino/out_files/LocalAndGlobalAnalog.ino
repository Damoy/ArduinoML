// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(1, INPUT);
	pinMode(11, OUTPUT);
	pinMode(8, INPUT);
	Serial.begin(38400);
	Serial.println("name=LocalAndGlobalAnalog");
	Serial.println("modes=unicorn,drake,phoenix");
	Serial.println("states=unicorn_sleeping,unicorn_awake");
	Serial.println("states=drake_idle,drake_fireup_idle,drake_fireup");
	Serial.println("states=phoenix_idle,phoenix_shining");
}

//Monitoring values
String state_value = "";
String mode_value = "";

//Behavioral concepts
long time=0;
long debounce = 200;
long analog=0;

void mode_unicorn() {
	//initial state
	mode_value = "0";
	state_value = "0";
	Serial.println("mode=" + mode_value + " " + "state=" + state_value);
	state_unicorn_sleeping();
}

void unicorn_to_drake(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) >= 333 && analogRead(1) < 666 && guard ) {
		time = millis();
		mode_drake();
	}
}
void unicorn_to_phoenix(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) >= 666 && analogRead(1) < 999 && guard ) {
		time = millis();
		mode_phoenix();
	}
}
void state_unicorn_sleeping() {
	digitalWrite(11, LOW);
	boolean guard = millis() - time > debounce;
	out_unicorn();

	unicorn_to_drake();
	unicorn_to_phoenix();
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "1";
		out();
		time = millis();
		state_unicorn_awake();
	}
	else {
		state_unicorn_sleeping(); 
	}
}

void state_unicorn_awake() {
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	out_unicorn();

	unicorn_to_drake();
	unicorn_to_phoenix();
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "0";
		out();
		time = millis();
		state_unicorn_sleeping();
	}
	else {
		state_unicorn_awake(); 
	}
}

void mode_drake() {
	//initial state
	mode_value = "1";
	state_value = "0";
	Serial.println("mode=" + mode_value + " " + "state=" + state_value);
	state_drake_idle();
}

void drake_to_unicorn(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) < 333 && guard ) {
		time = millis();
		mode_unicorn();
	}
}
void drake_to_phoenix(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) >= 666 && analogRead(1) < 999 && guard ) {
		time = millis();
		mode_phoenix();
	}
}
void state_drake_idle() {
	digitalWrite(11, LOW);
	boolean guard = millis() - time > debounce;
	out_drake();

	drake_to_unicorn();
	drake_to_phoenix();
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "2";
		out();
		time = millis();
		state_drake_fireup();
	}
	else {
		state_drake_idle(); 
	}
}

void state_drake_fireup_idle() {
	digitalWrite(11, LOW);
	boolean guard = millis() - time > debounce;
	out_drake();

	drake_to_unicorn();
	drake_to_phoenix();
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "0";
		out();
		time = millis();
		state_drake_idle();
	}
	if (true) {
		delay(1000);
		state_value = "2";
		out();
		state_drake_fireup();
	}
	else {
		state_drake_fireup_idle(); 
	}
}

void state_drake_fireup() {
	digitalWrite(11, HIGH);
	boolean guard = millis() - time > debounce;
	out_drake();

	drake_to_unicorn();
	drake_to_phoenix();
	if( digitalRead(8) == HIGH && guard ) {
		state_value = "0";
		out();
		time = millis();
		state_drake_idle();
	}
	if (true) {
		delay(1000);
		state_value = "1";
		out();
		state_drake_fireup_idle();
	}
	else {
		state_drake_fireup(); 
	}
}

void mode_phoenix() {
	//setup bricks
	pinMode(12, OUTPUT);
	pinMode(0, INPUT);
	//initial state
	mode_value = "2";
	state_value = "0";
	Serial.println("mode=" + mode_value + " " + "state=" + state_value);
	state_phoenix_idle();
}

void reset_phoenix() {
	digitalWrite(12, LOW);
}

void phoenix_to_unicorn(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) < 333 && guard ) {
		reset_phoenix();
		time = millis();
		mode_unicorn();
	}
}
void phoenix_to_drake(){
	boolean guard = millis() - time > debounce;
	if( analogRead(1) >= 333 && analogRead(1) < 666 && guard ) {
		reset_phoenix();
		time = millis();
		mode_drake();
	}
}
void state_phoenix_idle() {
	digitalWrite(11, LOW);
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	out_phoenix();

	phoenix_to_unicorn();
	phoenix_to_drake();
	if( analogRead(0) > 500 && guard ) {
		state_value = "1";
		out();
		time = millis();
		state_phoenix_shining();
	}
	else {
		state_phoenix_idle(); 
	}
}

void state_phoenix_shining() {
	digitalWrite(11, HIGH);
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	out_phoenix();

	phoenix_to_unicorn();
	phoenix_to_drake();
	if( analogRead(0) < 500 && guard ) {
		state_value = "0";
		out();
		time = millis();
		state_phoenix_idle();
	}
	else {
		state_phoenix_shining(); 
	}
}

void out() {Serial.println("state=" + state_value);}

void out_unicorn() {
	boolean time_analog = millis() - analog > debounce;
	if (time_analog) {
		Serial.println("analog=potentiometre->" + String(analogRead(1)));
		analog = millis();
	}
}

void out_drake() {
	boolean time_analog = millis() - analog > debounce;
	if (time_analog) {
		Serial.println("analog=potentiometre->" + String(analogRead(1)));
		analog = millis();
	}
}

void out_phoenix() {
	boolean time_analog = millis() - analog > debounce;
	if (time_analog) {
		Serial.println("analog=potentiometre->" + String(analogRead(1)) + "=light->" + String(analogRead(0)));
		analog = millis();
	}
}

void loop() {mode_unicorn();} // Entering init mode