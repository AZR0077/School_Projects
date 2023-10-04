import java.awt.Color;
import paintingcanvas.Canvas;
import paintingcanvas.drawable.*;

class Main {
  private static Canvas canvas;
  
  public static void main(String[] args)   
  {  
    canvas = new Canvas(800, 500, "Animal Picture Lab 2.0");
    Tile t1 = new Tile(200, 100);
    t1.blink();
    t1.spit();
    t1.look();
    TileMad m2 = new TileMad(200, 200);
    m2.blink();
    m2.spit();
    m2.look();
    m2.eat();
    TileSad s2 = new TileSad(200, 300);
    s2.blink();
    s2.spit();
    s2.look();
    s2.speak();
  }

  public static Canvas getCanvas() 
  {
    return canvas;
  }
}