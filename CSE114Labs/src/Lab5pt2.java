import java.util.Scanner;
public class Lab5pt2 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = stdin.nextInt();

        System.out.print("Is " + x + " divisble by 5 and 6? ");
        if ((x % 5 == 0) & (x%6==0) ){
            System.out.println(true);
        } else
            System.out.println(false);

        ///////////////////////////////////////////////////////////////////

        System.out.print("Is " + x + " divisible by 5 or 6? ");
        if( (x % 5 ==0) || ( x % 6 == 0) ){

            System.out.println(true);
        } else
            System.out.println(false);

        /////////////////////////////////////////////////////////////////////

        System.out.print("Is " + x + " divisible by 5 or 6, but not both? ");
        if( (x % 5 ==0) & ( x % 6 == 0) ){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }






    }
}
