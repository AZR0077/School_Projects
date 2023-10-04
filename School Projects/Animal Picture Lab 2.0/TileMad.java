import java.awt.Color;
import paintingcanvas.Canvas;
import paintingcanvas.drawable.*;

public class TileMad extends Tile {
  
  public TileMad(int x, int y) {
    super(x, y);
  }

  public void blink() {
    super.blink();
    super.changeColor(Color.red);
  }

  public void spit() {
    int x = super.getX();
    int y = super.getY();
    Circle spit1 = new Circle(x + 50, y + 20, 5, Color.black);
    Circle spit2 = new Circle(x + 50, y + 20, 5, Color.black);
    Circle spit3 = new Circle(x + 50, y + 20, 5, Color.black);
    spit1.moveTo(x + 150, y + 20, 2);
    spit2.moveTo(x + 120, y + 20, 2);
    spit3.moveTo(x + 90, y + 20, 2);
  }

  public void look() {
    super.look();
  }
  public void eat() {
    int x = super.getX();
    int y = super.getY();
    Circle spit1 = new Circle(x + 150, y + 20, 5, Color.black);
    Circle spit2 = new Circle(x + 120, y + 20, 5, Color.black);
    Circle spit3 = new Circle(x + 90, y + 20, 5, Color.black);
    spit1.moveTo(x + 50, y + 20, 2);
    spit2.moveTo(x + 50, y + 20, 2);
    spit3.moveTo(x + 50, y + 20, 2);
  }
}