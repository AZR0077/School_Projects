import java.awt.Color;
import paintingcanvas.Canvas;
import paintingcanvas.drawable.*;

public class Tessellation {
  Tile[][] tiles;

  public Tessellation(int rows, int columns) {
    tiles = new Tile[rows][columns];
    for (int i = 0; i < tiles.length; i++) {
      for (int j = 0; j < tiles[i].length; j++) {
        tiles[i][j] = new Tile(61 * i, 61 * j);
      }
    }
  }

  public void changeColorInRow(Color color) {
    for (int i = 0; i < tiles.length; i++) {
      for (int j = 0; j < tiles[i].length; j++) {
        tiles[i][j].changeColor(color);
        Main.getCanvas().sleep(0.3);
      }
    }
  }

  public void setRandomColor() {
    for (int i = 0; i < tiles.length; i++) {
      for (int j = 0; j < tiles[i].length; j++) {
        Color temp = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
        tiles[i][j].changeColor(temp);
      }
    }
  }

  public void magentaGradient() {
    for (int i = 0; i < tiles[i].length; i++) {
      int change = 0;
      for (int j = 0; j < tiles.length; j++) {
        Color temp = new Color (change, 0, change);
        tiles[j][i].changeColor(temp);
        change += 255 / tiles.length;
      }
    }
  }

  public void diagonalColors(Color color1, Color color2) {
    int count = 0;
    int smallCount = 0;
    for (int i = 0; i < tiles.length; i++) {
      for (int j = 0; j < tiles[i].length; j++) {
        if (count % 2 == 0) {
          if (smallCount % 2 == 0) {
            tiles[i][j].changeColor(color1);
            smallCount++;
          }
          else {
            tiles[i][j].changeColor(color2);
            smallCount++;
          }
        }
        else {
          if (smallCount % 2 == 0) {
            tiles[i][j].changeColor(color2);
            smallCount++;
          }
          else {
            tiles[i][j].changeColor(color1);
            smallCount++;
          }
        }
      }
      count++;
    }
  }

  public void eraseRightToLeft() {
    for (int i = 0; i < tiles.length; i++) {
      for (int j = 0; j < tiles[i].length; j++) {
        tiles[tiles.length - i - 1][tiles[i].length - j - 1].erase();
        Main.getCanvas().sleep(0.3);
      }
    }
  }

  public void eraseRandom() {
    int count = 0;
    int i = 0;
    while (count != tiles.length * tiles[0].length) {
      int int1 = (int)(Math.random() * tiles.length);
      int int2 = (int)(Math.random() * tiles[0].length);
      if (tiles[int1][int2] != null) {
        tiles[int1][int2].erase();
        tiles[int1][int2] = null;
        count++;
        Main.getCanvas().sleep(0.3);
      }
      i++;
    }
  }

  public void animateRow(int row) {
    for (int i = 0; i < tiles.length; i++) {
      tiles[i][row].look();
    }
  }
}