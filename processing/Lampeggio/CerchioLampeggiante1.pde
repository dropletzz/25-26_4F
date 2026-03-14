

class CerchioLampeggiante1 {
  float x, y, raggio;
  int ogniQuantoLampeggia = 1000; // in millisecondi
  int tempoUltimoLampeggio;
  boolean acceso;
  
  public CerchioLampeggiante1(float px, float py, float r) {
    acceso = true;
    x = px;
    y = py;
    raggio = r;
    tempoUltimoLampeggio = millis();  // restituisce il tempo "attuale" in millisecondi
  }
  
  public void disegna() {
      int tempoDaUltimoLampeggio = millis() - tempoUltimoLampeggio;
      if (tempoDaUltimoLampeggio >= ogniQuantoLampeggia) {
        acceso = !acceso;
        tempoUltimoLampeggio = millis();
      }
      if (acceso) circle(x, y, 60);
  }
}
