class Main
{
   public static void main(String[] args)
   {
      //LoginForm login = new LoginForm("admin", "admin123");
      LoginForm login = new LoginForm();

      login.input("test");
      login.input("test123");
      login.click("Submit");

      System.out.println("User is " + (login.loggedIn() ? " " : " not")
            + " logged in.");
      System.out.println("Expected: User is not logged in.");

      login.click("Reset");

      login.input("admin");
      login.input("admin123");
      login.click("Submit");

      System.out.println("User is" + (login.loggedIn() ? " " : " not")
            + " logged in.");
      System.out.println("Expected: User is logged in.");
   }
}
