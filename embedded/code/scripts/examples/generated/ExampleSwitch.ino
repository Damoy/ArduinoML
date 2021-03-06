// Wiring code generated from an ArduinoML model
// Application name: ExampleSwitch

void setup(){
  pinMode(16, INPUT);  // button [Sensor]
  pinMode(17, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_on() {
  digitalWrite(17,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(16) == HIGH && guard ) {
    time = millis();
    state_off();
  }
  else {
    state_on();
  }
}

void state_off() {
  digitalWrite(17,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(16) == HIGH && guard ) {
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
