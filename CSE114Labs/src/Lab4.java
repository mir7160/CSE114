import java.util.Scanner;
import java.lang.Math;
public class Lab4 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a ");
        float a = stdin.nextFloat();

        System.out.print("Enter b ");
        float b = stdin.nextFloat();

        System.out.print("Enter c ");
        float c = stdin.nextFloat();

        float r1 = (float)( (-b + Math.sqrt( (Math.pow(b,2)) - 4*a*c) )/ (2*a) );
        float r2 = (float)( (-b - Math.sqrt( (Math.pow(b,2)) - 4*a*c) )/ (2*a) );

        float disc = (float) ((Math.pow(b,2))- (4*a*c));

        if (disc > 0)
            System.out.println("The equation has two roots " + r1 + " and " + r2);

        else if (disc == 0)
            System.out.println("The equation has one root " + r1);

        else
            System.out.println("The equation has no real roots");

        stdin.close();






    }
}
