
/** This class models the circuit for a hallway light.
 */
class Circuit 
{
    
      private int firstSwitch;    // 0 = down, 1 = up
    private int secondSwitch;
    private int lampState;      // 0 = on, 1 = off
    
    /** Gets the current state of the first switch
     * @return the state of the first switch (0 = down, 1 = up)
     */
    public int getFirstSwitchState()
    {
        return firstSwitch;
    }
    
    /** Gets the current state of the second switch
     * @return the state of the second switch (0 = down, 1 = up)
     */
    public int getSecondSwitchState()
    {
        return secondSwitch;
    }
    
    /** Gets the current state of the hallway lamp.
     * @return the state of the lamp (0 = off, 1 = on)
     */
    public int getLampState()
    {
        return lampState;
    }
    
    /** Changes the first switch from up to down, or vice versa.
     *  Toggling the switch also changes the state of the lamp.
     */
    public void toggleFirstSwitch()
    {
        firstSwitch = (firstSwitch + 1) % 2;
        lampState = (lampState + 1) % 2;
    }
    
    /** Changes the second switch from up to down, or vice versa.
     *  Toggling the switch also changes the state of the lamp.
     */
    public void toggleSecondSwitch()
    {
        secondSwitch = (secondSwitch + 1) % 2;
        lampState = (lampState + 1) % 2;
    }
}



class Main 
{
  public static void main(String[] args) {
    // your circuit tester should be built here
      Circuit wiring = new Circuit();
        
    wiring.toggleFirstSwitch();
	wiring.toggleFirstSwitch();
	wiring.toggleSecondSwitch();

    System.out.println("Switch 1: " + wiring.getFirstSwitchState());
    System.out.println("Expected: 0");
    System.out.println("Switch 2: " + wiring.getSecondSwitchState());
    System.out.println("Expected: 1");
    System.out.println("Lamp: " + wiring.getLampState());
    System.out.println("Expected: 1");
    
    wiring.toggleSecondSwitch();
    System.out.println("Switch 1: " + wiring.getFirstSwitchState());
    System.out.println("Expected: 0");
    System.out.println("Switch 2: " + wiring.getSecondSwitchState());
    System.out.println("Expected: 0");
    System.out.println("Lamp: " + wiring.getLampState());
    System.out.println("Expected: 0");
  }
}
