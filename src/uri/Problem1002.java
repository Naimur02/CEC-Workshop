package uri;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Problem1002 {
    public static void main (String [] args){
        Scanner canon303Lide = new Scanner(System.in);


        double r = 3.14159,R, A;

        R = canon303Lide.nextDouble();

        A = r*pow(R,2);

        System.out.printf("A=%.4f\n",A);

        canon303Lide.close();
    }

}
