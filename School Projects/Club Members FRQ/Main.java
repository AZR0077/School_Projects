import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    System.out.println("Part A");
    ClubMembers club1 = new ClubMembers();
    String[] names = {"Tan, Lauren", "Galesi, Mark", "Boop, Travis"};
    club1.addMembers(names, 2002);
    System.out.println(club1);

    System.out.println("\nPart B");
    ArrayList<MemberInfo> members = new ArrayList<MemberInfo>();
    members.add(new MemberInfo("SMITH, JANE", 2019, false));
    members.add(new MemberInfo("FOX, STEVE", 2018, true));
    members.add(new MemberInfo("XIN, MICHAEL", 2017, false));
    members.add(new MemberInfo("GARCIA, MARIA", 2020, true));
    System.out.println("Original Member List");
    System.out.println(members);

    ClubMembers club2 = new ClubMembers(members);

    System.out.println("Returned after method call:\n" + club2.removeMembers(2018));

    System.out.println("Remaining list:\n" + club2);
    
  }
}