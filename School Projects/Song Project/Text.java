import java.awt.*;
import java.awt.geom.*;

/**
 * A text object that draws itself on a canvas.
 * 
 * @author  Galesi / Tan
 * @version 2019.12.27 
 */
public class Text
{
    private int x;
    private int y;
    private String txt;
    private int font;
    private Canvas canvas;

    /**
     * Constructor for Text object which draws the text on the screen.
     * 
     * @param bottomLeftx is the x coordinate of the buttom left hand corner of the screen.
     * @param bottomLefty is the y coordinate of the bottom left hand corner of the screen.
     * @param fontIn is the font size for your text.
     * @param text is a string of words you want to display.
     * 
     */
    public Text(int bottomLeftx, int bottomLefty, int fontIn, String text)
    {
        x = bottomLeftx;
        y = bottomLefty;
        font = fontIn;
        txt = text;
        draw();
    }

    /**
     * Draw the text with current specifications on canvas.
     */
    public void draw()
    {
        canvas = Canvas.getCanvas();
        canvas.drawText(txt, font, x, y);
        canvas.wait(5);
    }

    /**
     * Erase the text object from the canvas (makes the text white).
     * 
     * If you have other colors in the background, you will need to
     * draw them again after you use this method.
     */
    public void erase()
    {
        canvas.eraseText(txt, x, y, font);
    }

    /**
     * Change the color of the text object on the canvas.
     */
    public void changeColor(int[] color)
    {
      int r = color[0];
      int g = color[1];
      int b = color[2];
        canvas.changeTextColor(txt, x, y, 
            font, new Color(r, g, b));
    }

    /**
     * Get the string value of text from the Text object.
     */
    public String getText()
    {
        return txt;
    }

    /**
     * Get the current font (in pixels) of text from the Text object.
     */
    public int getFont()
    {
        return font;
    }

    /**
     * Get the bottom left x position of the text from the Text object.
     */
    public int getBottomLeftX()
    {
        return x;
    }

    /**
     * Get the bottom left y position of the text from the Text object.
     */
    public int getBottomLeftY()
    {
        return y;
    }

    /**
     * Get the approximate width (in pixels) from the Text object.
     */
    public int getWidth()
    {
        int p = font * 6 * txt.length() / 10;
        return p;
    }

    /**
     * Get the approximate height (in pixels) from the Text object.
     */
    public int getHeight()
    {
        return 9 * font / 10;
    }

}
