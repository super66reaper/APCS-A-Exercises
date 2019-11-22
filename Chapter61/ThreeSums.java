import java.io.* ;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

    int sumOfAll = 0;
    int sumOfEven = 0;
    int sumOfOdd = 0;

    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
        sumOfAll += data[index]; 

        if(data[index] % 2 == 0) {
            sumOfEven += data[index];
        }else {
            sumOfOdd += data[index];
        }
    }
      
    // write out the three sums
    System.out.println("Sum of all: " + sumOfAll + " \nSum of Evens: " + sumOfEven + " \nSum of Odds: " + sumOfOdd);

  }
}   