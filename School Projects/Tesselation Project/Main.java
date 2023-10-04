import java.awt.Color;
import paintingcanvas.Canvas;
import paintingcanvas.drawable.*;

class Main {
  private static Canvas canvas;
  
  public static void main(String[] args)   
  {  
    canvas = new Canvas(900, 600, "Tessellation Project");
    
    // Draw a single tile for testing
    // Tile t = new Tile(100, 100);
    
    // Draw the tessellation:
    
    // Tessellation tess = new Tessellation(15, 10);
    
    // canvas.sleep(2);
    // tess.changeColorInRow(Color.blue);
    
    // canvas.sleep(2);
    // tess.setRandomColor();
    
    // canvas.sleep(2);
    // tess.diagonalColors(Color.cyan, Color.gray);
    
    // canvas.sleep(2);
    // tess.magentaGradient();
    
    // canvas.sleep(2);
    // tess.animateRow(1);
    
    // tess.eraseRightToLeft();
    // canvas.sleep(2);
    
    // tess = new Tessellation(15, 10);
    // tess.eraseRandom();
    
    // tess = new Tessellation(15, 10);
    // tess.eraseSpiral();
    Tessellation tess = new Tessellation(5, 4);
    tess.magentaGradient();
    tess.eraseRightToLeft();
    tess = new Tessellation(5, 4);
    tess.eraseRandom();


  }

  public static Canvas getCanvas() 
  {
    return canvas;
  }
}