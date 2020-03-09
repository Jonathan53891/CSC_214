/*

Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. 
Each switch can be up or down, and the light can be on or off. 
Toggling either switch turns the lamp on or off. 

Provide  the following method on your circuit class.

public int getFirstSwitchState() // 0 for down, 1 for up
public int getSecondSwitchState()
public int getLampState() // 0 for off, 1 for on
public void toggleFirstSwitch()
public void toggleSecondSwitch()

Using the circuit tester provided your results should look like:


Switch 1: 0
Expected: 0
Switch 2: 1
Expected: 1
Lamp: 1
Expected: 1
Switch 1: 0
Expected: 0
Switch 2: 0
Expected: 0
Lamp: 0
Expected: 0

*/
