public class MagicSquare 
{
  int[][] magic;
  int size = 0;
  
  public MagicSquare(int s) 
  {
    size = s;
    magic = new int[s][s];
    
    int cur_row = s - 1;
    int cur_col = s / 2;
    magic[cur_row][cur_col] = 1;
    
    for (int i = 2; i <= s * s; i++) 
    {
      if (magic[(cur_row + 1) % s][(cur_col + 1) % s] == 0) 
      {
        cur_row = (cur_row + 1) % s;
        cur_col = (cur_col + 1) % s;
      } 
      else 
      {
        cur_row = (cur_row - 1 + s) % s;
      }
      magic[cur_row][cur_col] = i;
    }
  }
  
  public String toString() 
  {
    String str = "";
    str += "The magic square of size "+size+" is : \n";
    
    for(int i=0;i<size;i++) 
    {
      for(int j=0;j<size;j++) 
      {
        str += ""+magic[i][j]+" ";
      }
      str += "\n";
    }
    return str;
  }
}
