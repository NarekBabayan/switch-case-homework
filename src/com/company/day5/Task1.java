package com.company.day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int myValue=(number+44)/44;



        switch (myValue){
            case 1:{
                System.out.println("0-44");
                break;
            }
            case 2:{
                System.out.println("45-89");
                break;
            }
            case 3:{
                System.out.println("90-134");
                break;
            }
            default:{
                System.out.println("number or >135 or <0");
            }
        }






    }
}
