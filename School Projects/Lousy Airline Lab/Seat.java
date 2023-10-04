public class Seat {
  //instance variables
  private String seatNum;
  private Passenger passenger;

  //constructor
  public Seat(String seatNum) {
    this.seatNum = seatNum;
    passenger = null;
  }

  //methods
  public boolean isEmpty() {
    if (passenger == null) {
      return true;
    }
    return false;
  }

  public void setPassenger(Passenger passenger) {
    if (isEmpty()) {
      this.passenger = passenger;
    }
    else {
      System.out.println("This seat is not available.");
    }
  }

  //accessor methods
  public String getSeatNum() {
    return seatNum;
  }

  public Passenger getPassenger() {
    return passenger;
  }

  //mutator method
  public void setSeatNum(String seatNum) {
    this.seatNum = seatNum;
  }

  //toString() method
  public String toString() {
    if (isEmpty()) {
      return "Seat: " + seatNum + " Unoccupied" + "\n";
    }
    return "Seat: " + seatNum + " " + passenger.toString() + "\n";
  }
  
}