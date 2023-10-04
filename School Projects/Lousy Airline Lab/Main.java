import java.util.ArrayList;
// Note: Make sure you copy the import statement from above in any other class where you use arraylists!
class Main {
  public static void main(String[] args) {
    // Test your methods below:
    Passenger p1 = new Passenger();
    System.out.println(p1);
    Passenger p2 = new Passenger("Bob", "Smith", 560);
    System.out.println(p2);
    
    Seat a1 = new Seat("1A");
    a1.setPassenger(p1);
    a1.setPassenger(p2);

    System.out.println();
    
    Seat a2 = new Seat("2A");
    System.out.println(a1);
    System.out.println(a2);
    
    // FINAL CHECK (uncomment this out once you are TOTALLY FINISHED)
    Airplane plane = new Airplane(4);
    ArrayList<Passenger> list = new ArrayList<Passenger>();
    for(int i = 0; i < 10; i++) 
    {
      list.add(new Passenger());
    }
    list.add(new Passenger("Mark", "Galesi", 100));
    list.add(new Passenger("Lauren", "Tan", 100000));
    plane.assignSeats(list);
    System.out.println(plane);
  }
}