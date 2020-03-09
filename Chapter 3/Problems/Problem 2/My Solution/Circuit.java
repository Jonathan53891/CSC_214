public class Circuit
{
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;
    
    public Circuit()
    {
      firstSwitchState = 0;
      secondSwitchState = 0;
      lampState = 0;
    }
    
    public int getFirstSwitchState()
    {
      return firstSwitchState;
    }
    
    public int getSecondSwitchState()
    {
      return secondSwitchState;
    }
    
    public int getLampState()
    {
      return lampState;
    }
    
    public void toggleFirstSwitch()
    {
      if(firstSwitchState==0)
      {
        firstSwitchState = -1;
        toggleLamp();
      }
      else
      {
        firstSwitchState = 0;
        toggleLamp();
      }
    }
    
    public void toggleSecondSwitch()
    {
      if(secondSwitchState == 0)
      {
        secondSwitchState = 1;
        toggleLamp();
      }
      else
      {
        secondSwitchState = 0;
        toggleLamp();
      }
    }
    
    private void toggleLamp()
    {
      if(lampState == 0)
        lampState = 1;
      else
        lampState = 0;
    }
}
