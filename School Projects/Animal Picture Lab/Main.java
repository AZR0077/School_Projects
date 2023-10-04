class Main {
  public static void main(String[] args) {
    
    // Creates all shapes for my enviorment
  Rect sky = new Rect(0, 0, 800, 300, "blue");
  Rect grass = new Rect(0, 300, 800, 200, "green");
  Circle sun = new Circle(80, 80, 40, "yellow");
  Ellipse clouds = new Ellipse(400, 50, 400, 25, "white");
  Rect body_1 = new Rect(100, 350, 40, 10, "#964B00");
  Rect body_2 = new Rect(140, 350, 40, 10, "#964B00");
  Rect body_3 = new Rect(180, 350, 40, 10, "#964B00");
  Rect body_4 = new Rect(220, 350, 40, 10, "#964B00");
  Rect body_5 = new Rect(260, 350, 40, 10, "#964B00");
  Rect body_6 = new Rect(300, 350, 40, 10, "#964B00");
  Rect body_7 = new Rect(340, 350, 40, 10, "#964B00");
  Rect body_8 = new Rect(440, 350, 40, 10, "#964B00");
  Rect body_9 = new Rect(480, 350, 40, 10, "#964B00");
  Circle tail_2 = new Circle(520, 355, 5, "#964B00");
  Circle tail_1 = new Circle(100, 355, 5, "#964B00");
  Rect main_body = new Rect(380, 345, 60, 20, "#D2B48C");

  Canvas.wait(1000);
    
    //Changes colors to rainbow
    
    body_1.changeColor("red");
    body_2.changeColor("#FFA500");
    body_3.changeColor("yellow");
    body_4.changeColor("#95bb72");
    body_5.changeColor("blue");
    body_6.changeColor("magenta");
    body_7.changeColor("red");
    body_8.changeColor("#FFA500");
    body_9.changeColor("yellow");
    tail_1.changeColor("red");
    tail_2.changeColor("yellow");
    main_body.changeColor("#cc8899");

    
    //Changes back


  Canvas.wait(3000);
    
    body_1.changeColor("#964B00");
    body_2.changeColor("#964B00");
    body_3.changeColor("#964B00");
    body_4.changeColor("#964B00");
    body_5.changeColor("#964B00");
    body_6.changeColor("#964B00");
    body_7.changeColor("#964B00");
    body_8.changeColor("#964B00");
    body_9.changeColor("#964B00");
    tail_1.changeColor("#964B00");
    tail_2.changeColor("#964B00");
    main_body.changeColor("#D2B48C");


    //Action 1: Moves up and down

    Canvas.wait(1000);

    body_2.moveVertical(-5);
    body_3.moveVertical(-10);
    body_4.moveVertical(-15);
    body_5.moveVertical(-20);
    body_6.moveVertical(-25);
    body_7.moveVertical(-30);
    main_body.moveVertical(-35);
    body_8.moveVertical(-40);
    body_9.moveVertical(-45);
    tail_2.moveVertical(-45);

    Canvas.wait(1000);
    
    body_2.moveVertical(5);
    body_3.moveVertical(10);
    body_4.moveVertical(15);
    body_5.moveVertical(20);
    body_6.moveVertical(25);
    body_7.moveVertical(30);
    main_body.moveVertical(35);
    body_8.moveVertical(40);
    body_9.moveVertical(45);
    tail_2.moveVertical(45);

    Canvas.wait(2000);    

    //Action 2: Moves in an arch position

    body_2.moveVertical(-5);
    body_3.moveVertical(-10);
    body_4.moveVertical(-15);
    body_5.moveVertical(-20);
    body_6.moveVertical(-25);
    body_7.moveVertical(-20);
    main_body.moveVertical(-15);
    body_8.moveVertical(-10);
    body_9.moveVertical(-5);
    tail_2.moveVertical(-5);

    Canvas.wait(1000);

    body_2.moveVertical(5);
    body_3.moveVertical(10);
    body_4.moveVertical(15);
    body_5.moveVertical(20);
    body_6.moveVertical(25);
    body_7.moveVertical(20);
    main_body.moveVertical(15);
    body_8.moveVertical(10);
    body_9.moveVertical(5);
    tail_2.moveVertical(5);

    tail_1.moveHorizontal(50);
    body_1.moveHorizontal(50);
    body_2.moveHorizontal(50);
    body_3.moveHorizontal(50);
    body_4.moveHorizontal(50);
    body_5.moveHorizontal(50);
    body_6.moveHorizontal(50);
    body_7.moveHorizontal(50);
    main_body.moveHorizontal(50);
    body_8.moveHorizontal(50);
    body_9.moveHorizontal(50);
    tail_2.moveHorizontal(50);

    Canvas.wait(1000);
    
    //Action 3: Splits in half and comes back together

    tail_1.moveHorizontal(-50);
    body_1.moveHorizontal(-50);
    body_2.moveHorizontal(-50);
    body_3.moveHorizontal(-50);
    body_4.moveHorizontal(-50);

    Canvas.wait(1000);
    
    body_7.moveVertical(-5);
    body_6.moveVertical(-10);
    body_5.moveVertical(-15);

    Canvas.wait(1000);

    body_7.moveVertical(5);
    body_6.moveVertical(10);
    body_5.moveVertical(15);

    body_5.moveHorizontal(-50);
    body_6.moveHorizontal(-50);
    body_7.moveHorizontal(-50);
    main_body.moveHorizontal(-50);
    body_8.moveHorizontal(-50);
    body_9.moveHorizontal(-50);
    tail_2.moveHorizontal(-50);

  }
}