class Main {
  public static void main(String[] args) {

    
    Picture pic = new Picture(50, 22);

    //Here is an example of the methods you could run in order to show all the methods you created in this lab.

    //pic.test();

    pic.placeRandom();
    Canvas.wait(2000);
    pic.reset();
    Canvas.wait(2000);
    
    pic.circlesLine(20);
    Canvas.wait(2000);
    
    pic.placeRandom();
    pic.randomColor();
    Canvas.wait(2000);
    
    pic.redColorGradient();
    Canvas.wait(2000);
    
    pic.redGradientOverTime();
    Canvas.wait(2000);
    
    pic.allFallDown(15);
    pic.reset();
    pic.placeRandom();
    Canvas.wait(2000);
    
    pic.increaseRadius(4);
    Canvas.wait(2000);
    pic.reset();
    Canvas.wait(2000);
    
    pic.circleRows(5);
    Canvas.wait(2000);

    pic.makeX();
    Canvas.wait(2000);
    
    pic.placeRandom();
    pic.spaceRandom();
    Canvas.wait(2000);

    pic.placeRandom();
    pic.changeRadius();
    Canvas.wait(2000);

    pic.reset();
    pic.placeRandom();
    pic.fitInLine(10);
    Canvas.wait(2000);

    //pic.bouncing();
    //Canvas.wait(2000);
    //pic.reset();

    pic.reset();
    pic.placeRandom();
    pic.circleAttack();
    Canvas.wait(2000);
  }
}