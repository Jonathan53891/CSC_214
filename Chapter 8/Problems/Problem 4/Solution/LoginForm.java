public class LoginForm 
{
  public String input;
  public String Button;
  public String userName;
  public String pw;
  public LoginForm()
  {
    userName = "";
    pw = "";
  }
  
  public void input(String text)
  {
    input = text;
  }
  
  public void click(String button)
  {
    Button = button;
    if(Button.equals("Submit"))
    {
      //Statement to change loggedIn from false to true
    }
    else
    {
      userName = "";
      pw = "";
    }
  }
  
  public boolean loggedIn()
  {
    return false;
  }
}
