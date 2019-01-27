// Wiring code generated from an ArduinoML model
// Application name: ExampleTemporalTransitionWithCondition

void setup(){
  pinMode(8, INPUT);  // button [Sensor]
  pinMode(9, INPUT);  // button2 [Sensor]
  pinMode(10, OUTPUT); // led1 [Actuator]
  pinMode(11, OUTPUT); // led2 [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(10,LOW);
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
  digitalWrite(10,HIGH);
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(9) == HIGH && guard ) {
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
