package com.company.day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int myValue=(number+100)/100;



        switch (myValue){
            case 1:{
                System.out.println("0-100");
                break;
            }
            case 2:{
                System.out.println("100-200");
                break;
            }
            case 3:{
                System.out.println("200-300");
                break;
            }
            default:{
                System.out.println("number or >300 or <0");
            }
        }






    }
}
