import java.util.Scanner;
import java.lang.Math;
public class Lab6pt2 {
    public static void main (String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = stdin.nextInt();

        System.out.print("Enter the length of each side: ");
        double s = stdin.nextDouble();

        double area = (n * (Math.pow(s,2) )) / (4 * Math.tan(Math.PI/n));

        System.out.print("The area of the polygon is " + area);







    }
}
