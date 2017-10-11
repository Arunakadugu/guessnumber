package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int x = 1 + r.nextInt(10);
        System.out.println(x);
        Scanner rdm = new Scanner(System.in);
        int rNumber;
        do {
            System.out.println("enter your number:");
            rNumber = rdm.nextInt();
            System.out.println(rNumber);
            if(rNumber == x )
            {
                System.out.println(" You guessed it.");

            }
            else if(rNumber > x)
            {
                System.out.println(" your guess is too high try again");
            }
            else if(rNumber < x)
            {
                System.out.println("your guess is too low try again");
            }
        }while(x != rNumber);
    }
}
