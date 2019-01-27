// Wiring code generated from an ArduinoML model
// Application name: SimpleTemporalTransition

void setup(){
  pinMode(8, INPUT);  // button1 [Sensor]
  pinMode(11, OUTPUT); // led1 [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(11,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_on();
  }
  else {
    state_off();
  }
}

void state_on() {
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    delay(2000);
    state_off();
  }
  else {
    state_on();
  }
}

void loop() {
  state_off();
}
