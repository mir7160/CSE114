import java.util.Scanner;
import java.lang.Math;
public class Lab6 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = stdin.nextDouble();
        double y = stdin.nextDouble();

        double f = Math.sqrt( (Math.pow(x-0, 2)) + (Math.pow(y-0, 2)) );    //calculates the distance between the origin and the point

        if (f <= 10){
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");


        stdin.close();

        }

    }
}
