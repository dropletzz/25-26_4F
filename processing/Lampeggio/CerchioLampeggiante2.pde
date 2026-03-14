
class CerchioLampeggiante2 {
  float x, y, raggio;
  
  public CerchioLampeggiante2(float px, float py, float r) {
    x = px;
    y = py;
    raggio = r;
  }
  
  public void disegna() {
      int tempoAttuale = millis();
      if (sin(tempoAttuale) > 0) circle(x, y, 60);
  }
}
