
class CerchioLampeggiante2 {
  float x, y, raggio;
  float ogniQuantoLampeggia = 2;
  
  public CerchioLampeggiante2(float px, float py, float r) {
    x = px;
    y = py;
    raggio = r;
  }
  
  public void disegna() {
      float tempoAttuale = millis() / 1000;
      if (sin(PI*tempoAttuale/ogniQuantoLampeggia) > 0) circle(x, y, 60);
  }
}
