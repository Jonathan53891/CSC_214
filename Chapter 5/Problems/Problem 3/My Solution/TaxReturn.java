class TaxReturn
{
  private double income;
  
  public TaxReturn(double i)
  {
    income=i;
  }
  public double getTax()
  {
    double tax=0;
    if(income<=50000)
      return income*.01;
    if(income<=75000)
      return 50000*.01+(income-50000)*.02;
    if(income<=100000)
      return 50000*.01+25000*.02+(income-75000)*.03;
    if(income<=250000)
      return 50000*.01+25000*.02+25000*.03+(income-100000)*.04;   
    if(income<=500000)
      return 50000*.01+25000*.02+25000*.03+150000*.04+(income-250000)*.05;
    return 50000*.01+25000*.02+25000*.03+150000*.04+250000*.05+(income-500000)*.06;   
  }
} 
