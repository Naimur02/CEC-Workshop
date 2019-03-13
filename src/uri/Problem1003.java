package uri;
import java.util.Scanner;

public class Problem1003 {
    public static void main (String [] args){
        Scanner canon303Lide=new Scanner(System.in);

        int A,B,SOMA;

        A = canon303Lide.nextInt();
        B = canon303Lide.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = "+SOMA);

        canon303Lide.close();

    }
}
