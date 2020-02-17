import java.util.Scanner;
public class Lab4pt2 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the weight ");
        float weight = stdin.nextFloat();

        if( (weight <= 1) & (0 < weight) )
            System.out.print("The cost is $3.5");
        else if( (1 < weight) & (weight <= 3))
            System.out.println("The cost is $5.5");
        else if( (3 < weight) & (weight <= 10))
            System.out.println("The cost is $8.5");
        else if( (10 < weight) & (weight <= 20))
            System.out.println("The cost is $10.5");
        else if( weight > 20 )
            System.out.println("The package cannot be shipped");
        else
            System.out.println("Invalid input");

    }
}
