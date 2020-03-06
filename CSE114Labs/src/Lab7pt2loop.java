import java.lang.Math;
public class Lab7pt2loop {
    public static void main(String [] args){
        // generates 3 random letters
        for (char a = 0; a < 3; a++ ) {
            char b = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
            System.out.print(b);
                                      }
        // generates 4 random number
        for (int x = 0; x<4; x++){
            int y = (int)(Math.random()*10);
            System.out.print(y);
                                       }




    }
}
