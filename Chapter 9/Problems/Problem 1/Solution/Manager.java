class Manager extends Employee 
{
  private double bonus;

  public Manager() 
  {
  
  }

  public Manager(double bonus) 
  {
    this.bonus = bonus;
  }

  public double getBonus() 
  {
    return bonus;
  }

  public void setBonus(double bonus) 
  {
    this.bonus = bonus;
  }
  
}
