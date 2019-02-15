package day3;
import java.util.Scanner;
public class ConditionalLove {
    //main method
    public static void main(String[] args){
       // scanner to take input
        Scanner canon303Lide=new Scanner(System.in);
        String name,feeling;
        int sex,age;
        //take input from user
        System.out.println("What is your name:");
        name = canon303Lide.nextLine();
        System.out.println("Hi,"+name+"How are you?");

        feeling=canon303Lide.nextLine();
        if(feeling.equalsIgnoreCase("Fine")){
            System.out.println("That's great.are you male or female?");
            sex=canon303Lide.nextInt();
            if(sex==1){
                System.out.println("Hey my boy.");
            }else if(sex==2){
                System.out.println("Hey babe.");
            }else{
                System.out.println("Hey rainbow.");
            }
        }
        System.out.println("Okay!.How oid are you?");
        age=canon303Lide.nextInt();
        switch (age) {
            case 1:
                System.out.println("h");
                break;
            case 2:
                System.out.println("i");
                break;
            case 3:
                System.out.println("j");
                break;
            case 4:
                System.out.println("k");
                break;
            case 5:
                System.out.println("l");
                break;
            case 6:
                System.out.println("m");
                break;
            case 7:
                System.out.println("n");
                break;
            case 8:
                System.out.println("o");
                break;
            case 9:
                System.out.println("P");
                break;
            case 10:
                System.out.println("q");
                break;
            case 11:
                System.out.println("r");
                break;
            case 12:
                System.out.println("s");
                break;
            case 13:
                System.out.println("t");
                break;
            case 14:
                System.out.println("u");
                break;
            case 15:
                System.out.println("v");
                break;
            default:
                System.out.println("Okay!");
                break;
        }


        //presentatiion

        canon303Lide.close();

    }
}
