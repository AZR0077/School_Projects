import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Song
{
  private String[] lyricsArray;
  private ArrayList<String> lyricsList;
  private ArrayList<Integer> quantities;
  private ArrayList<Text> textList;

  /**
  * Constructor for objects of class Song
  */
  public Song() throws IOException {
    // Code below adds all the words from your txt file one by one
    // into the lyricsArray.
    File theData = new File("lyrics.txt");
    Scanner dataReader = new Scanner(theData);
    String song = "";
    while (dataReader.hasNext()) {
      song += dataReader.next() + " ";
    }
    lyricsArray = song.split(" ");
        
    // Step 1: Initialize a String arraylist, an Integer arraylist, and a Text arraylist:
    lyricsList = new ArrayList<String>();
    quantities = new ArrayList<Integer>();
    textList = new ArrayList<Text>();
        
    // Step 2: Add all words from the array to the lyricsList arraylist:
    for (int i = 0; i < lyricsArray.length; i++) {
      lyricsList.add(lyricsArray[i]);
    }
        
    /* Step 3: Check for words that are the same and remove them from lyricsList.
    * As you remove the repeated words from the lyricsList, update the
    * quantities arraylist to reflect how many of that word are in the song.
    */
    for (int i = 0; i < lyricsList.size(); i++) {
      lyricsList.set(i, lyricsList.get(i).toLowerCase());
    }
    for (int i = 0; i < lyricsList.size(); i++) {
      int count = 1;
      for (int j = lyricsList.size() - 1; j > 0; j--) {
        if (lyricsList.get(j).equals(lyricsList.get(i)) && j != i) {
          lyricsList.remove(j);
          count++;
        }
      }
      quantities.add(count);
    }
    System.out.println(lyricsList);
    System.out.println(quantities);

    // Note: The textList arraylist will be filled and used in the drawSong() method below.
  }

    /**
     * drawSong adds new text objects at a random location to the textList arraylist. The font of each text object should be scaled based on how frequently they appear in the song. Words that appear more often should be larger.  As the new objects are created within the list, they will be drawn on the canvas. 
     */
    public void drawSong() 
    {
      for (int i = 0; i < lyricsList.size(); i++) {
        int font = 10;
        int x = 0;
        int y = (int)(Math.random() * 400);
        if (quantities.get(i) > 1) {
          font = font + 2 * quantities.get(i);
        }
        if (quantities.get(i) > 20) {
          x = (int)(Math.random() * 300 + 250);
        }
        else {
          x = (int)(Math.random() * 700);
          if (x >= 250 && x <= 550) {
            x += 250;
          }
        }
        Text t = new Text(x, y, font, lyricsList.get(i));
        textList.add(t);
      }
    }

/**
 The brighten method runs through the list of Text objects and makes the largest words bright and the smaller words darker. This should be done gradually so that the largest words have a brightness level of 255, the smallest words are close to 0 and the medium words are somewhere in between. The color you decide to use is YOUR CHOICE! It can be  red, green, blue, cyan, magenta or yellow.
*/
    public void brighten()
    {
      for (int i = 0; i < textList.size(); i++) {
        int frequency = quantities.get(i);
        int green = 51 + frequency * 10;
        if (green > 255) {
          green = 255;
        }
        int[] rgb = {0, green, 0};
        textList.get(i).changeColor(rgb);
      }
    }
    
    /**
     * The eraseEntireSong method will run through the entire textList and erase the song from the canvas but NOT the list. Make sure to use the methods that are available to you in the Text class.
     */

    public void eraseEntireSong() 
    {
      for (int i = 0; i < textList.size(); i++) {
        textList.get(i).erase();
      }
    }

    /**
     * This method first erases the entire song. Then it runs through the entire textList and removes the smaller words (only keeping the most frequently used words). Anything you do not remove from the textList should be drawn again using the draw method from the Text class.
     */
    public void removeSmallWords() 
    {
      eraseEntireSong();
      for (int i = textList.size() - 1; i >= 0; i--) {
        if (quantities.get(i) < 5) {
          textList.remove(i);
        }
      }
      for (int i = 0; i < textList.size(); i++) {
        textList.get(i).draw();
      }
    }
    
    
    /**
     * The singSong method does the following:
      Turns all the words on the canvas black
      Prints all the lyrics of the song in the console one at a time with a 1 second wait time in between (use Canvas.wait(1000)). 
      While each word is printed, the canvas should also turn each word bright red as they are “spoken”, then back to black after 1 second. (1 points)
     */
    public void singSong() 
    {
      int[] color = {0, 0, 0};
      int[] color2 = {255, 0, 0};
      System.out.println();
      for (int i = 0; i < textList.size(); i++) {
        textList.get(i).changeColor(color);
      }
      for (int i = 0; i < lyricsArray.length; i++) {
        System.out.print(lyricsArray[i] + " ");  textList.get(lyricsList.indexOf(lyricsArray[i].toLowerCase())).changeColor(color2);
        Canvas.wait(100);
textList.get(lyricsList.indexOf(lyricsArray[i].toLowerCase())).changeColor(color);
      }
    }

  // METHOD BELOW IS OPTIONAL!!!
    /**
     * The spaceRandom() method places every text object on the canvas so that
     * it does not overlap any of the other text objects.
     */
    public void spaceRandom() 
    {
      
    }
    
}
