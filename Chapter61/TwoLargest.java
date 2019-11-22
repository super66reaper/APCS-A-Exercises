import java.io.* ;

class TwoLargest
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    int largestNum = 0;
    int secondLargest = 0;
    
    
    // compute the two largest
    for ( int index = 0 ; index < data.length; index++)
    {
        if(data[index] > largestNum) {
            secondLargest = largestNum;
            largestNum = data[index];
        }else if(data[index] > secondLargest) {
            secondLargest = data[index];
        }
    }
      
    // write out the two largest
    System.out.println("Largest Num: " + largestNum + "\nSecond Largest Num: " + secondLargest);

  }
}      