import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Patient p1 = new Patient("Bob", 7, "Very sick");
    p1.addSymptoms("Diarrhea");
    p1.addSymptoms("Headaches");
    System.out.println(p1);
    p1.proclaimDeath();
    System.out.println(p1);

    Patient p2 = new Patient("George", 43, "Sick");
    Patient p3 = new Patient("Stephen", 72, "Mildly sick");

    Patient[] patients = {p1, p2, p3};
    Hospital hospital = new Hospital(patients, "Basking Ridge Hospital");
    System.out.println(hospital);

    hospital.admitPatients();
    System.out.println(hospital);
    hospital.releaseWellPatients();
    System.out.println(hospital);

    System.out.println(p1.getSymptoms(1));

    ArrayList<String> newSymptoms = new ArrayList<String>();
    newSymptoms.add("Fever");
    newSymptoms.add("Nausea");
    p1.addSymptoms(newSymptoms);
    System.out.println(p1);
  }
}