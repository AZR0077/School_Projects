public class Picture
{
    private Circle[] circles;
    private int numCircles;
    private int radius;

    /**
     * Constructor for objects of class Picture
     * @param numCircles the number of circles in the circles array
     * @param radius the radius of each circle in pixels
     */
    public Picture(int numCircles, int radius)
    {
      this.numCircles = numCircles;
      this.radius = radius;
      circles = new Circle[numCircles];
      for (int i = 0; i < numCircles; i++) {
        circles[i] = new Circle(0, 0, radius);
      }
    }

//REQUIRED-------------------------------------------------------

  /* 
  Will change the location of the circles so they are placed in a random location on the canvas. The Canvas is 500 x 300. (2 pts) */
    public void placeRandom() 
    {
      for (int i = 0; i < numCircles; i++) {
        circles[i].setCenter((int)(Math.random() * 601), (int)(Math.random() * 351));
      }
    }

  /* 
  Will erase the circles from the canvas one by one and then remake new black circles placed a (0, 0). (1 pts) */
    public void reset() //put all in same spot
    {
      for (int i = 0; i < numCircles; i++) {
        circles[i].setCenter(0, 0);
        circles[i].setRadius(radius);
      }
    }

    //------------------------------------------------------------

    //CHOOSE ANY COMBINATION OF METHODS WHICH ADD UP TO 10 POINTS. RUN THESE METHODS IN YOUR MAIN
  /* 
  circlesLine(int distanceApart) takes one parameter and makes a line of circles that are each a fixed distance apart. (2 points) */
    public void circlesLine(int distanceApart)
    {
      for (int i = 0; i < numCircles; i++) {
        circles[i].setCenter(distanceApart * i, 150);
      }
    }

  /* randomColor() sets each color in the array to a random RGB value between 0 and 255. (2 points) */
    public void randomColor()
    {
      for (int i = 0; i < numCircles; i++) {
        int[] rgb = {(int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)};
        circles[i].changeColor(rgb);
      }
    }

  /* redColorGradient() sets each circle in the array to a shade of red starting from very dark to super bright. No circle should have the same brightness value, but they should vary in brightness at a constant rate. (2 points) */
    public void redColorGradient()
    {
      for (int i = 0; i < numCircles; i++) {
        int[] rgb = {i * 5, 0, 0};
        circles[i].changeColor(rgb);
      }
    }

  /* redGradientOverTime() increases the red value of every circle starting from 0 and going up by 3 until it reaches the brightest value possible. (2 points) */
    public void redGradientOverTime()
    { 
      for (int i = 0; i < 85; i++) {
        for (int j = 0; j < numCircles; j++) {
          int[] rgb = {i * 3, 0, 0};
          circles[j].changeColor(rgb);
        }
      }
    }

  /**
  * allFallDown(int speed) method uses the moveVertical method in the circle class to make all the circles fall down on the canvas until they reach the bottom. 
  * @param speed the number of pixels you want the circles to move at each iteration of your loop. (2 points) */
    public void allFallDown(int speed)
    {
      int largest = 0;
      for (int i = 0; i < numCircles; i++) {
        if (circles[i].getCenterX() > largest) {
          largest = circles[i].getCenterX();
        }
      }
      for (int i = 0; i < (int)(largest / speed); i++) {
        for (int j = 0; j < numCircles; j++) {
          circles[j].moveVertical(speed);
        }
      }
    }

  /* 
  * increaseRadius(int minRadius) starts the first circle in the array at the minRadius and then increases the radius of every subsequent circle by 2. The circles can be in any x, y location, but the example shows them in a line. (2 points) */
    public void increaseRadius(int minRadius)
    {
      for (int i = 0; i < numCircles; i++) {
          circles[i].setRadius(minRadius + i * 2);
      }
    }

  /*
  This method makes rows of circles and should work for any number of circles in the array. 
  * @param rows the number of rows of circles
  (2 points) 
  */
    public void circleRows(int rows)
    {
      int count = 0;
      int vertical = (int)(300 / rows);
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < (int)(numCircles / rows); j++) {
          circles[count].setCenter(j * radius * 2 + radius, vertical);
          count += 1;
        }
        vertical += (int)(300 / rows);
      }
    }

   /* makeX() takes the array of circles and makes an X across the canvas. This should work for any size array. (3 points) */
    public void makeX()
    {
      int x = 0;
      int y = 0;
      int distanceApart = 25;
      for (int i = 0; i < numCircles/2; i++) {
        circles[i].setCenter(x, y);
        x += distanceApart;
        y += distanceApart;
      }
      x = 0;
      y = 350;
      for (int j = numCircles/2; j < numCircles; j++) {
        circles[j].setCenter(x, y);
        x += distanceApart;
        y -= distanceApart;
      }
    }
    
  /**
  spaceRandom() checks to see if any circles are overlapping and if so, it puts each circle one by one in a random location that doesn’t overlap any of the other circles. You may want to write a helper method called overlapping(Circle c1, Circle c2) that returns true if the circles are overlapping and false otherwise. Then call the overlapping method inside your spaceRandom() method. (4 points) */
   public void spaceRandom()
    {
      for (int i = 0; i < numCircles; i++) {
        for (int j = 0; j < numCircles; j++) {
          while (circleOverlap(circles[i], circles[j])) {
            circles[i].setCenter((int)(Math.random() * 601), (int)(Math.random() * 351));
            j = 0;
          }
        }
      }
    }

  /* ChangeRadius() runs through each circle object in the array and checks to see if the circle is overlapping any of the other circles. If it is, it decreases the size of both circles that are overlapping until they don’t intersect. Then it moves on to the next circle and checks and resizes until all circles are not overlapping. (3 points) */
    public void changeRadius()
    {
      for (int i = 0; i < numCircles; i++) {
        for (int j = 0; j < numCircles; j++) {
          while (circleOverlap(circles[i], circles[j])) {
            circles[i].setRadius(circles[i].getRadius() - 1);
            circles[j].setRadius(circles[j].getRadius() - 1);
            i = 0;
          }
        }
      }
    }

  /** fitInLine(int distanceApart) is a variation of circlesLine() above, but after all circles are placed in a line, they are resized incrementally pixel by pixel until they are tangent circles. (3 points OR 1 point if you already did circlesLine()) 
  * @param distanceApart the fixed distance between the centers of each circle
  */
    public void fitInLine(int distanceApart)
    {
      circlesLine(radius);
      for (int i = 0; i < numCircles; i++) {
        for (int j = 0; j < numCircles; j++) {
          while (circleOverlap(circles[i], circles[j])) {
            circles[i].setRadius(circles[i].getRadius() - 1);
            circles[j].setRadius(circles[j].getRadius() - 1);
            i = 0;
          }
        }
      }
    }

  /** moves each circle in a projectile pattern to simulate a bouncing action (kind of like the end of a solitaire game). (4 points) */
    public void bouncing() 
    {
      randomColor();
      int horizontal = radius;
      for (int i = 0; i < numCircles; i++) {
        circles[i].setCenter(horizontal, 100);
        horizontal += radius / 3;
      }
    }
  
  /** circleAttack() moves the first circle in the array back and forth and “eats” the other circles when it runs into them. Every time the circle intersects another circle, the other circle becomes invisible and gets moved off the screen to give the illusion that it’s eaten. Then the radius of the original circle should be increased. (3 points) */
    public void circleAttack()
    {
      int check = 0;
      int count = 1;
      while (true) {
        if (circles[0].getCenterX() == 0) {
          count += 1;
          circles[0].setCenter(circles[0].getCenterX() + 1, circles[0].getCenterY());
        }
        if (circles[0].getCenterX() == 600) {
          count -= 1;
          circles[0].setCenter(circles[0].getCenterX() - 1, circles[0].getCenterY());
        }
        if (count == 1) {
          circles[0].setCenter(circles[0].getCenterX() + 1, circles[0].getCenterY());
        }
        if (count == 0) {
          circles[0].setCenter(circles[0].getCenterX() - 1, circles[0].getCenterY());
        }
        for (int i = 0; i < numCircles; i++) {
          if (circleOverlap(circles[0], circles[i])) {
            circles[i].setCenter(-1000, 0);
            circles[0].setRadius(circles[0].getRadius() + 5);
            check += 1;
          }
        }
        if (check == numCircles - 1) {
          return;
        }
      }
    }

    //helper method which may be used for some of the other more challenging methods.
    public boolean circleOverlap(Circle c1, Circle c2) 
    {  
      if (c1 == c2) {
        return false;
      }
      int dx = c2.getCenterX() - c1.getCenterX();
      int dy = c2.getCenterY() - c1.getCenterY();
      int radiusSum = c2.getRadius() + c1.getRadius();
      return dx * dx + dy * dy <= radiusSum * radiusSum;
    }

    //test method for circleOverlap()
    public void test() 
    {
      circles[0].setCenter(100, 100);
      circles[1].setCenter(110, 110);
      while (circleOverlap(circles[0], circles[1])) {
        circles[0].setRadius(circles[0].getRadius() - 1);
        circles[1].setRadius(circles[0].getRadius() - 1);
      }
    }
}