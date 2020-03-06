import java.lang.Math;
public class Lab8 {
    public static void main(String [] args){
        double sumx = 0;

        // generates 10 random numbers
        for (int i=0; i < 10; i++) {
            int x = (int) (Math.random() * 100);
            System.out.println(x);

            sumx += x;

        }
        System.out.println(sumx);
        double average = sumx/10;
        System.out.println("The average is: " + average);



    }
}
