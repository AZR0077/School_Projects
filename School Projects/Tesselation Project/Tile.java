import java.awt.Color;
import paintingcanvas.Canvas;
import paintingcanvas.drawable.*;

public class Tile {
  private Color color;
  private int x;
  private int y;
  private Polygon outline;
  private Circle eye;
  private Circle eye2;
  private Polygon stripe1;
  private Polygon stripe2;

  public Tile(int x, int y) {
    color = new Color(255, 165, 0);
    this.x = x;
    this.y = y;
    draw();
  }

  public void draw() {
    int[][] points1 = {{x, y}, {x + 25, y}, {x + 25, y - 21}, {x + 60, y}, {x + 32, y + 18}, {x + 60, y + 60}, {x + 25, y + 39}, {x + 25, y + 60}, {x, y + 60}, {x - 28, y + 18}};
    outline = new Polygon(points1, color);
    int[][] points2 = {{x - 10, y + 45}, {x - 10, y + 6}, {x - 18, y + 11}, {x - 18, y + 34}};
    stripe1 = new Polygon(points2, Color.red);
    int[][] points3 = {{x + 15, y + 60}, {x + 15, y}, {x + 5, y}, {x + 5, y + 60}};
    stripe2 = new Polygon(points3, Color.red);
    eye = new Circle(x + 35, y, 5, Color.white);
    eye2 = new Circle(x + 35, y, 3, Color.black);
  }
  
  public void erase() {
    eye.erase();
    eye2.erase();
    outline.erase();
    stripe1.erase();
    stripe2.erase();
  }

  public void changeColor(Color color) {
    outline.erase();
    this.color = color;
    draw();
  }

  public void look() {
    eye.hide();
    eye2.hide();
    Main.getCanvas().sleep(0.7);
    eye.show();
    eye2.show();
  }
}
