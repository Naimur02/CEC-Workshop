package uri;

import java.util.Scanner;

public class Problem1001 {
    public static void main(String[] args){
       Scanner canon303Lide=new Scanner(System.in);

        int A,B,X;

        A = canon303Lide.nextInt();
        B = canon303Lide.nextInt();

        X = A + B;

        System.out.println("X = "+X);

        canon303Lide.close();
    }
}
