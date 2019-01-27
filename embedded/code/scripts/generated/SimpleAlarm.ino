// Wiring code generated from an ArduinoML model
// Application name: SimpleAlarm

void setup(){
  pinMode(8, INPUT);  // button [Sensor]
  pinMode(11, OUTPUT); // led [Actuator]
  pinMode(12, OUTPUT); // buzzer [Actuator]
}

long time = 0; long debounce = 200;

void state_on() {
  digitalWrite(11,HIGH);
  digitalWrite(12,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    state_off();
  }
  else {
    state_on();
  }
}

void state_off() {
  digitalWrite(11,LOW);
  digitalWrite(12,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_on();
  }
  else {
    state_off();
  }
}

void loop() {
  state_off();
}
