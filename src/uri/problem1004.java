package uri;
import java.util.Scanner;

public class problem1004 {
    public static void main (String [] args){
        Scanner canon303Lide = new Scanner(System.in);

        int A, B, PROD;

        A = canon303Lide.nextInt();
        B = canon303Lide.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        canon303Lide.close();

    }
}
