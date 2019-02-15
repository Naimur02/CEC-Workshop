package day3;
import java.util.Scanner;
public class ExtremAddition {
    //main method
    public static void main(String[] args){
        Scanner canon303Lide = new Scanner (System.in);

        int number[]=new int[21];

        //scanner to take input

        for(int i=0;i<number.length-1;i++){
            number[i]=canon303Lide.nextInt();
        }
        number[number.length-1]=0;
       for(int i=0;i<number.length-1;i++){
           number[number.length-1]+=number[i];
       }
        //presentation
        System.out.println("Summation : "+number[number.length-1]);


    }
}
