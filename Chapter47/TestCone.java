import java.util.Scanner ;

public class TestCone
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    double radius, height;

    System.out.print("Enter radius: " ); 
    radius = scan.nextDouble();

    System.out.print("Enter height: " ); 
    height = scan.nextDouble();
 
    Cone cone = new Cone(radius, height);

    System.out.println("Area " + cone.area() + " Volume: " + cone.volume() + " Slant Height: " + cone.slantHeight());
  }
}