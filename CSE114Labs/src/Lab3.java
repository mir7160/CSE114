import java.util.Scanner;
public class Lab3 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius ");
        double c = stdin.nextDouble();

        double f = (9.0/5) * c + 32;

        System.out.print(c + " degrees Celsius is " + f + " degrees fahrenheit");

        stdin.close();




    }
}

