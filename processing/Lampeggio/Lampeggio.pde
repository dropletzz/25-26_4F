CerchioLampeggiante1 c1;
CerchioLampeggiante2 c2;

void setup() {
  size(800, 600);
  c1 = new CerchioLampeggiante1(width/4, height/2, 60);
  c2 = new CerchioLampeggiante2(width*3/4, height/2, 60);
}

void draw() {
  
      background(#000000);
      c1.disegna();
      c2.disegna();
}
