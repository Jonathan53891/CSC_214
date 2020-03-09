public class Main
{
  private String name;
  private String friendList;
   
  public String getFriendNames()
  {
    return friendList;
  }
   
  public static void main(String[] args)
  {
    Person pr = new Person("Jon");
    Person pr1 = new Person("Carl");
    Person pr2 = new Person("Jason");
    Person pr3 = new Person("Gary");
    pr.befriend(pr1);
    pr.befriend(pr2);
    pr.befriend(pr3);
    System.out.println("Friend list of " + pr.getName() + ": " + pr.getFriendNames());
    pr.unfriend(pr3);
    System.out.println("Friend list of " + pr.getName() + " after unfriending Gary: " + pr.getFriendNames());
  }
}
