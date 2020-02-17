import java.util.Scanner;
public class Lab2 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter v0: ");
        double v0 = stdin.nextDouble();

        System.out.print("Enter v1: ");
        double v1= stdin.nextDouble();

        System.out.print("Enter t: ");
        double t= stdin.nextDouble();

        double a = (v1- v0)/t;
        System.out.print(" The acceleration is:  " + a);

        stdin.close();


    }

}
