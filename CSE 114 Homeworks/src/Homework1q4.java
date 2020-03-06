// Mir Farid
// 112861191
import java.util.Scanner;
public class Homework1q4 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String x = stdin.nextLine();

        int upper = 0;

        for ( int i = 0; i < x.length(); i++){
            if (Character.isUpperCase(x.charAt(i))){
                upper++;
            }
        }

        System.out.println("The number of uppercase letters is "+ upper);


    }

}
