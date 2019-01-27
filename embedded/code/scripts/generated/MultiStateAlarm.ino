// Wiring code generated from an ArduinoML model
// Application name: MultiStateAlarm

void setup(){
  pinMode(8, INPUT);  // button [Sensor]
  pinMode(11, OUTPUT); // buzzer [Actuator]
  pinMode(12, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_buzzerOn() {
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_ledOn();
  }
  else {
    state_buzzerOn();
  }
}

void state_ledOn() {
  digitalWrite(11,LOW);
  digitalWrite(12,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_none();
  }
  else {
    state_ledOn();
  }
}

void state_none() {
  digitalWrite(11,LOW);
  digitalWrite(12,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_buzzerOn();
  }
  else {
    state_none();
  }
}

void loop() {
  state_none();
}
