import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException  {
    // Comment this out:
    //Text t = new Text(100, 200, 100, "HELLO");

    Song song1 = new Song();
    song1.drawSong();
    song1.brighten();
    Canvas.wait(2000);
    song1.eraseEntireSong();
    song1.singSong();
    song1.removeSmallWords();
  }
}