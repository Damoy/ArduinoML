// Wiring code generated from an ArduinoML model
// Application name: ComplexScenario

void setup(){
  pinMode(8, INPUT);  // button1 [Sensor]
  pinMode(9, INPUT);  // button2 [Sensor]
  pinMode(10, OUTPUT); // greenLed [Actuator]
  pinMode(11, OUTPUT); // redLed [Actuator]
  pinMode(12, OUTPUT); // buzzer [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(12,LOW);
  digitalWrite(11,LOW);
  digitalWrite(10,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(9) == HIGH && digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_dualGlow();
  }
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_redGlow();
  }
  if( digitalRead(9) == HIGH && guard ) {
    time = millis();
    state_snooze();
  }
  else {
    state_off();
  }
}

void state_redGlow() {
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(9) == HIGH && digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_dualGlow();
  }
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_greenGlow();
  }
  else {
    state_redGlow();
  }
}

void state_greenGlow() {
  digitalWrite(11,LOW);
  digitalWrite(10,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_off();
  }
  else {
    state_greenGlow();
  }
}

void state_dualGlow() {
  digitalWrite(11,HIGH);
  digitalWrite(10,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(9) == LOW && digitalRead(8) == LOW && guard ) {
    time = millis();
    state_bip();
  }
  else {
    state_dualGlow();
  }
}

void state_bip() {
  digitalWrite(12,HIGH);
  digitalWrite(11,LOW);
  digitalWrite(10,LOW);
  boolean guard = millis() - time > debounce;
  time = millis();
  delay(2000);
  state_off();
}

void state_snooze() {
  digitalWrite(12,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(9) == HIGH && digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_dualGlow();
  }
  if( digitalRead(9) == LOW && guard ) {
    time = millis();
    state_off();
  }
  else {
    state_snooze();
  }
}

void loop() {
  state_off();
}
