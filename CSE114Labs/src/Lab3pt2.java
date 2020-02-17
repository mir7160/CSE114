import java.util.Scanner;
public class Lab3pt2 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the weight of the water in kilograms: ");
        double m = stdin.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double itemp = stdin.nextDouble();

        System.out.print("Enter the final temperature: ");
        double ftemp = stdin.nextDouble();

        double q = m * (ftemp - itemp) * 4184;
        System.out.print(" The energy needed is: " +q);

        stdin.close();



    }
}
