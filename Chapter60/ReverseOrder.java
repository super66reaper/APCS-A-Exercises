class ReverseOrder
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3, 4}; 
    int temp;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        for(int i = 0; i < val.length / 2; i++) {
            temp = val[(val.length - i) - 1];
            val[(val.length - i) - 1] = val[i];
            val[i] = temp;   
        }
 
 
    
 
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}