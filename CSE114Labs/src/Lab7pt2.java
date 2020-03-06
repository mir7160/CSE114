import java.lang.Math;
public class Lab7pt2 {
    public static void main(String [] args){
        char a = (char)( 'A' + Math.random() * ('Z'-'A'+1) );
        char b = (char)( 'A' + Math.random() * ('Z'-'A'+1) );
        char c = (char)( 'A' + Math.random() * ('Z'-'A'+1) );
        int x1 = (int)(Math.random() * 10);
        int x2 = (int)(Math.random() * 10);
        int x3 = (int)(Math.random() * 10);
        int x4 = (int)(Math.random() * 10);
        System.out.print(a+""+b+""+c+""+x1+""+x2+""+x3+""+x4);



    }
}
