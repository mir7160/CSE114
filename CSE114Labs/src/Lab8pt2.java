import java.util.Scanner;
public class Lab8pt2 {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String first = stdin.nextLine();

        System.out.print("Enter the second city: ");
        String second = stdin.nextLine();

        System.out.print("Enter the third city: ");
        String third = stdin.nextLine();



        String temp;


        if (first.compareTo(second) > 0){
            temp = second;
            second = first;
            first = temp;
        }
        if(second.compareTo(third)>0){
            temp = third;
            third = second;
            second = temp;
        }

        if (first.compareTo(second)>0){
            temp = second;
            second = first;
           first = temp;
        }


        System.out.println("Cities in order are : " + first + " " + " " + second+ " " + third);












    }
}

