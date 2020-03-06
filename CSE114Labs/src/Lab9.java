import java.util.Scanner;
public class Lab9 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the phone number: ");
        String number = stdin.nextLine();

        System.out.println("(" + number.substring(0,3) + ")" + number.substring(3,6) + "-" + number.substring(6));




    }
}
