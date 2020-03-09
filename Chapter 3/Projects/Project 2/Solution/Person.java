public class Person 
{
  private String name;
  private String friendList;

  public Person(String name)
  {
    this.name = name;
    friendList = new String("");
  }

  public String getFriendNames()
  {
    return friendList;
  }

  public void befriend(Person p)
  {
    this.friendList = this.friendList + p.getName() + " ";
  }

  public void unfriend(Person p)
  {
    String rgx = "\\s*\\b" + p.getName() + "\\b\\s*";
    friendList = friendList.replaceAll(rgx, " ");
  }

  public String getName()
  {
    return this.name;
  }

}
