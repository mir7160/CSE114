// Mir Farid
// 112861191
import java.util.Scanner;
public class Homework1q2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = stdin.nextLine();
        String upperletter = letter.toUpperCase();


        if ( Character.isUpperCase( (char)(upperletter.charAt(0)) ) ) {


            switch (upperletter.charAt(0)) {
                case 'A':
                    System.out.print(letter + " is a vowel");
                    break;
                case 'E':
                    System.out.print(letter + " is a vowel");
                    break;
                case 'I':
                    System.out.print(letter + " is a vowel");
                    break;
                case 'O':
                    System.out.print(letter + " is a vowel");
                    break;
                case 'U':
                    System.out.print(letter + " is a vowel");
                    break;
                default:
                    System.out.print(letter + " is a consonant");
            }

        }

        else{
            System.out.print(letter + " is an invalid character");
        }


    }
}
