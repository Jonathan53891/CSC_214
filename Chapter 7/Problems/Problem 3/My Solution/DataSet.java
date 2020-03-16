public class DataSet 
{
  double[] data;
  int pos;
  
  public DataSet(int maximumNumberOfValues) 
  {
    data = new double[maximumNumberOfValues];
    pos = 0;
  }
  
  public void add(double value) 
  {
    if (pos < data.length) 
    {
      data[pos] = value;
      pos++;
    }
  }
  
  public double getSum() 
  {
    double sum = 0;
    
    for (int i = 0; i < pos; i++) 
    {
      sum += data[i];
    }
    return sum;
  }
  
  public double getAverage() 
  {
    return getSum() / pos;
  }
  
  public double getMaximum() 
  {
    if (data.length == 0)
      return Double.MAX_VALUE;
    else 
    {
      double max = data[0];
      
      for (int i = 1; i < pos; i++) 
      {
        if (max < data[i])
          max = data[i];
      }
      return max;
    }
  }
  
  public double getMinimum() 
  {
    if (data.length == 0)
      return Double.MAX_VALUE;
    else 
    {
      double min = data[0];
      
      for (int i = 1; i < pos; i++) 
      {
        if (min > data[i])
          min = data[i];
      }
      return min;
    }
  }
}//end of public class DataSet
