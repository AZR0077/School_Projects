import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Canvas is a class to allow for simple graphical drawing on a canvas.
 * This is a modification of the general purpose Canvas, specially made for
 * the BlueJ "shapes" example. 
 *
 * @author: Bruce Quig
 * @author: Michael Klling (mik)
 *
 * @version 2019.12.27 - Updated by Galesi / Tan
 */
public class Canvas
{
    // Note: The implementation of this class (specifically the handling of
    // shape identity and colors) is slightly more complex than necessary. This
    // is done on purpose to keep the interface and instance fields of the
    // shape objects in this project clean and simple for educational purposes.

    private static Canvas canvasSingleton;

    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas()
    {
        if(canvasSingleton == null) {
            canvasSingleton = new Canvas("BlueJ Picture Demo", 1000, 600, 
                Color.white);

        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    //  ----- instance part -----

    private JFrame frame;
    public CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColor;
    private Image canvasImage;
    private List<Object> objects;
    private HashMap<Object, ShapeDescription> shapes;

    /**
     * Create a Canvas.
     * @param title    title to appear in Canvas Frame
     * @param width    the desired width for the canvas
     * @param height   the desired height for the canvas
     * @param bgColor the desired background color of the canvas
     */
    private Canvas(String title, int width, int height, Color bgColor)
    {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        frame.setLocation(30, 30);
        canvas.setPreferredSize(new Dimension(width, height));
        backgroundColor = bgColor;
        frame.pack();
        objects = new ArrayList<Object>();
        shapes = new HashMap<Object, ShapeDescription>();
        

    }

    /**
     * Set the canvas visibility and brings canvas to the front of screen
     * when made visible. This method can also be used to bring an already
     * visible canvas to the front of other windows.
     * @param visible  boolean value representing the desired visibility of
     * the canvas (true or false) 
     */
    public void setVisible(boolean visible)
    {
        if(graphic == null) {
            // first time: instantiate the offscreen image and fill it with
            // the background color 
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
            graphic = (Graphics2D)canvasImage.getGraphics();
            graphic.setColor(backgroundColor);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);

        }
        frame.setVisible(true);
    }

    public void drawText(String text, int fontSize, int topLeftX, int topLeftY)
    {
        graphic = (Graphics2D)canvasImage.getGraphics();
        graphic.setFont(new Font("SanSerif", Font.PLAIN, fontSize));
        graphic.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
        graphic.drawString(text, topLeftX, topLeftY);
        canvas.repaint();
    }
    
    public void eraseText(String text, int x, int y, int fontSize)
    {
        graphic.setColor(Color.WHITE);
        graphic.setFont(new Font("SanSerif", Font.PLAIN, fontSize));
        graphic.drawString(text, x, y);
        canvas.repaint();
    }
    
    public void changeTextColor(String text, int x, int y, int fontSize, Color c)
    {
        graphic.setColor(c);
        graphic.setFont(new Font("SanSerif", Font.PLAIN, fontSize));
        graphic.drawString(text, x, y);
        canvas.repaint();
    }
    
    /**
     * Draw a given shape onto the canvas.
     * @param  referenceObject  an object to define identity for this shape
     * @param  color            the color of the shape
     * @param  shape            the shape object to be drawn on the canvas
     */
    // Note: this is a slightly backwards way of maintaining the shape
    // objects. It is carefully designed to keep the visible shape interfaces
    // in this project clean and simple for educational purposes.
    public void draw(Object referenceObject, int[] rgb, Shape shape)
    {
        objects.remove(referenceObject);   // just in case it was already there
        objects.add(referenceObject);      // add at the end
        shapes.put(referenceObject, new ShapeDescription(shape, rgb));
        redraw();
        
    }

    /**
     * Erase a given shape's from the screen.
     * @param  referenceObject  the shape object to be erased 
     */
    public void erase(Object referenceObject)
    {
        objects.remove(referenceObject);   // just in case it was already there
        shapes.remove(referenceObject);
        redraw();
    }

    /**
     * Set the foreground color of the Canvas.
     * @param  newColor   the new color for the foreground of the Canvas 
     */
    public void setForegroundColor(int[] rgb)
    {
        graphic.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        canvas.repaint();
        canvas.revalidate();
    }

    /**
     * Wait for a specified number of milliseconds before finishing.
     * This provides an easy way to specify a small delay which can be
     * used when producing animations.
     * @param  milliseconds  the number 
     */
    public static void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (Exception e)
        {
            // ignoring exception at the moment
        }
    }

    /**
     * Redraw all shapes currently on the Canvas.
     */
    private void redraw()
    {
        erase();
        for(Object shape : objects) {
            shapes.get(shape).draw(graphic);
        }
        canvas.repaint();
    }

    /**
     * Erase the whole canvas. (Does not repaint.)
     */
    public void erase()
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
    }

    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class CanvasPane extends JPanel
    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }

    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class ShapeDescription
    {
        private Shape shape;
        private int[] rgb;

        public ShapeDescription(Shape shape, int[] rgb)
        {
            this.shape = shape;
            this.rgb = rgb;
        }

        public void draw(Graphics2D graphic)
        {
            setForegroundColor(rgb);
            graphic.fill(shape);
        }
    }
}
