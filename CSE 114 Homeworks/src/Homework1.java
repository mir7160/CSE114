// Name: Mir Farid
// SBU ID: 112861191
import java.util.Scanner;
public class Homework1 {
    public static void main(String [] args ){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the length of the first edge: ");
        double l1 = stdin.nextDouble();

        System.out.print("Enter the length of the second edge: ");
        double l2 = stdin.nextDouble();

        System.out.print("Enter the length of the third edge: ");
        double l3 = stdin.nextDouble();

        if (l1< l2+l3){
            if (l2<l1+l3){
                if (l3 < l1+ l2){
                    double x = l1 + l2 + l3;
                    System.out.print("The perimeter is " + x);

                }
            }
        }
        else{
            System.out.println("The input is invalid ");
        }



    }
}
