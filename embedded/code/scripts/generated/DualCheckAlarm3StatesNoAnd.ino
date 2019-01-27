// Wiring code generated from an ArduinoML model
// Application name: DualCheckAlarm3StatesNoAnd

void setup(){
  pinMode(8, INPUT);  // button1 [Sensor]
  pinMode(9, INPUT);  // button2 [Sensor]
  pinMode(11, OUTPUT); // buzzer [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(11,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_one();
  }
  else {
    state_off();
  }
}

void state_one() {
  digitalWrite(11,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    state_off();
  }
  if( digitalRead(9) == HIGH && guard ) {
    time = millis();
    state_on();
  }
  else {
    state_one();
  }
}

void state_on() {
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    state_off();
  }
  if( digitalRead(9) == LOW && guard ) {
    time = millis();
    state_one();
  }
  else {
    state_on();
  }
}

void loop() {
  state_off();
}
