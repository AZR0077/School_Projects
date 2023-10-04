import java.awt.Color;
import paintingcanvas.Canvas;
import paintingcanvas.drawable.*;

public class TileSad extends Tile {
  
  public TileSad(int x, int y) {
    super(x, y);
  }

  public void blink() {
    super.blink();
    super.changeColor(Color.blue);
  }

  public void spit() {
    int x = super.getX();
    int y = super.getY();
    Circle spit1 = new Circle(x + 50, y + 20, 5, Color.blue);
    Circle spit2 = new Circle(x + 50, y + 20, 5, Color.blue);
    Circle spit3 = new Circle(x + 50, y + 20, 5, Color.blue);
    spit1.moveTo(x + 130, y + 20, 2);
    spit2.moveTo(x + 100, y + 20, 2);
    spit3.moveTo(x + 80, y + 20, 2);
  }

  public void look() {
    super.look();
  }
  public void speak() {
    Text talk = new Text(getX() + 10, getY() + 80, "I'M SAD", Color.black);
    talk.setFontSize(20);
  }
}