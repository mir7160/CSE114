// Mir Farid
// 112861191

import java.util.Scanner;
public class Homework1q3 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a string");
        String x = stdin.nextLine();

        int v = 0;
        int c = 0;

        for (int i = 0 ; i<x.length() ; i++){
            if ( Character.isLetter((x.charAt(i)))){
                switch (Character.toUpperCase((x.charAt(i)))) {
                    case 'A':
                        v++;
                        break;
                    case 'E':
                        v++;
                        break;
                    case 'I':
                        v++;
                        break;
                    case 'O':
                        v++;
                        break;
                    case 'U':
                        v++;
                        break;
                    default:
                        c++;
                }




            }

        }
        System.out.println("The number of vowels is: " + v);
        System.out.println("The number of constants is: " + c);
    }
}
