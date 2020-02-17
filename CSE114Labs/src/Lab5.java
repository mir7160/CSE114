import java.util.Scanner;
public class Lab5 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = stdin.nextInt();

        int x = number / 100;

        int y = number % 10;

        if (x == y){
            System.out.println(number + " is a palindrome");
        } else
            System.out.println(number + " is not a palindrome");
        }
    }

