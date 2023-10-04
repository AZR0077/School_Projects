import java.util.ArrayList;

public class Hospital {
  //instance variables
  private Patient[] patients;
  private String name;

  //constructor
  public Hospital(Patient[] patients, String name) {
    this.patients = patients;
    this.name = name;
  }

  //methods
  public void admitPatients() {
    for (int i = 0; i < patients.length; i++) {
      patients[i].setStatus("Admitted");
    }
  }

  public void releaseWellPatients() {
    for (int i = 0; i < patients.length; i++) {
      if (patients[i].getSymptoms().size() == 0) {
        patients[i].setStatus("Released");
      }
    }
  }

  public String toString() {
    String str = "\n" + name;
    str += "\nThere are " + patients.length + " patients\n";
    for (int i = 0; i < patients.length; i++) {
      str += "\nPatient " + (i + 1);
      str += patients[i].toString() + "\n";
    }
    return str;
  }
  
}