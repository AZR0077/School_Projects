import java.util.ArrayList;

public class Patient {
  //instance variables
  private String name;
  private int age;
  private ArrayList<String> symptoms;
  private ArrayList<String> medications;
  private String status;

  //default constructor
  public Patient() {
    name = "";
    age = 0;
    symptoms = new ArrayList<String>();
    medications = new ArrayList<String>();
    status = "unchecked";
  }

  //overloaded constructor
  public Patient(String name, int age) {
    this.name = name;
    this.age = age;
    symptoms = new ArrayList<String>();
    medications = new ArrayList<String>();
    status = "unchecked";
  }

  //original constructor (before learning what default and overloaded constructor is)
  public Patient(String name, int age, String status) {
    this.name = name;
    this.age = age;
    symptoms = new ArrayList<String>();
    medications = new ArrayList<String>();
    this.status = status;
  }

  //methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  public ArrayList<String> getSymptoms() {
    return symptoms;
  }

  //overloaded method
  public String getSymptoms(int i) {
    return symptoms.get(i);
  }

  public void addSymptoms(String symptom) {
    symptoms.add(symptom);
  }

  //overloaded method
  public void addSymptoms(ArrayList<String> symptoms) {
    this.symptoms.addAll(symptoms);
  }

  public ArrayList<String> getMedications() {
    return medications;
  }

  public void addMedications(String medication) {
    symptoms.add(medication);
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void proclaimDeath() {
    status = "Dead";
    System.out.println("\n" + getName() + " is dead!");
  }

  public String toString() {
    String list = "Symptoms: ";
    for (String i : symptoms) {
      list += i + ", ";
    }
    list = list.substring(0, list.length() - 2);
    return "\nName: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Status: " + getStatus() + "\n" + list;
  }
}