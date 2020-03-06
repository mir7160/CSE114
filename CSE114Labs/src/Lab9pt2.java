import java.util.Scanner;
public class Lab9pt2 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = stdin.nextLine();

        for (int i = 0; i < 10; i++){
            if (i%2==0){
                System.out.print(message.charAt(i));

            }
        }



    }
}
