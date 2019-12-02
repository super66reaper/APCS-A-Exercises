class Weight
{
  private int[] data;
  
  public Weight(int[] init)
  {
    int []data = new int[init.length];
    
    for (int j = 0; j < init.length; j++)
    {
      data[j] = init[j];
    }

    System.out.println(toString(data, init));
    System.out.println("Average: " + Average(data, init));
    System.out.println("Average between days 5 and 25: " + subAverage(5,25, data, init));
  }
  
  public String toString(int[] data, int[] init){
    String dataString = "";
    for(int i = 0; i < init.length; i++) {
      dataString += (data[i] + ", ");
    }
    return dataString;
  }

  public int Average(int[] data, int[] init) {
    int average = 0;
    int t = 0;
    for(int i = 0; i < init.length; i++) {
      average += data[i];
      t++;
    }
    return average / t;
  }

  public int subAverage(int start, int end, int[] data, int[] init) {
    int average = 0;
    int t = 0;
    for(int i = start; i < (end - (start - 1)); i++) {
      average += data[i];
      t++;
    }
    return average / t;
  }
}

public class WeightTester
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    System.out.println( june );
  }
}  