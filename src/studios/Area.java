package studios;
import java.util.Scanner;

public class Area {

    public static void main(String[] args)    {

        double a = 0;
        double radius = 2.5;
        double pi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        radius = scan.nextDouble();
        a = pi * radius * radius;
        System.out.println("Area of the circle is: " + a );


    }

}
