public class MemberInfo {
  private String name;
  private int gradYear;
  private boolean hasGoodStanding;
  /** Consructs a MemberInfo object for the club member with name name, gradulation year gradYear, and standing hasGoodStanding
  */
  public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
  {
    this.name = name;
    this.gradYear = gradYear;
    this.hasGoodStanding = hasGoodStanding;
  }

  /** Returns the graduation year of the club member */
  public int getGradYear()
  {
    return gradYear;
  }

  /** Returns true if the member is in good standing and false otherwise. */
  public boolean inGoodStanding()
  {
    return hasGoodStanding;
  }

  /** Returns a string that represents the MemberInfo object information
  */
  public String toString()
  {
    return "(" + name + ", " + gradYear + ", " + hasGoodStanding + ")";
  }
}