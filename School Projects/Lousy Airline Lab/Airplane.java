import java.util.ArrayList;

public class Airplane {
  //instance variables
  private Seat[][] seats;

  //constructor
  public Airplane(int rows) {
    seats = new Seat[rows][6];
    String firstSixLetters = "ABCDEF";
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < 6; c++) {
        seats[r][c] = new Seat((r + 1) + "" + firstSixLetters.substring(c, c + 1));
      }
    }
  }

  //methods
  public Seat getSeat(int row, int column) {
    return seats[row][column];
  }

  private ArrayList<Passenger> sortByCash(ArrayList<Passenger> passengers) {
    for (int p = 0; p < passengers.size(); p++) {
      int maxCash = 0;
      int index = p;
      for (int i = p; i < passengers.size(); i++) {
        if (passengers.get(i).getCash() > maxCash) {
          maxCash = passengers.get(i).getCash();
          index = i;
        }
      }
      if (p != index) {
        Passenger temp = passengers.get(p);
        passengers.set(p, passengers.get(index));
        passengers.set(index, temp);
      }
    }
    return passengers;
  }

  public void assignSeats(ArrayList<Passenger> passengers) {
        ArrayList<Passenger> sortedPassengers = sortByCash(passengers);
        int assignedCount = 0;
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (seats[r][c].isEmpty() && assignedCount < passengers.size()) {
                    seats[r][c].setPassenger(sortedPassengers.get(assignedCount));
                    assignedCount++;
                }
            }
        }
    }
  
  public String toString() {
    String info = "";
    for (int r = 0; r < seats.length; r++) {
      for (int c = 0; c < seats[r].length; c++) {
        info += seats[r][c];
      }
    }
    return info;
  }
  
}