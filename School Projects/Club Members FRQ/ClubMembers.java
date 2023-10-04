import java.util.ArrayList;
public class ClubMembers
{
  private ArrayList<MemberInfo> memberList;

  /**
  Constructor for ClubMembers object 
  */
  public ClubMembers()
  {
    memberList = new ArrayList<MemberInfo>();
  }

  /**
  Constructor for ClubMembers object 
  */
  public ClubMembers(ArrayList<MemberInfo> memberList)
  {
    this.memberList = memberList;
  }

  /** Adds new club members to the memberList, as described in part (a).
  * Precondition: names is a non-empty array */
  public void addMembers(String[] names, int gradYear)
  {
    // To be implemented in part (a):
    
    
  }

  /** Removes members who have graduated and returns a list of members who have graduated and are in good standing, as described in part (b) */
  public ArrayList<MemberInfo> removeMembers(int year)
  {
    // To be implemented in part (b):

    
    return new ArrayList<MemberInfo>(); // DELETE THIS LINE - JUST A GENERIC RETURN STATEMENT
  }

  public String toString()
  {
    return "" + memberList;
  }

}