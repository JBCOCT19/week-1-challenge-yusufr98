package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random r = new Random();
        boolean repeat = false;
        do {
            //prime until proven otherwise with for loop
            boolean isPrime = true;
            System.out.println("Would you like to input a number or generate a random number(I/R)?");
            String input = k.next();
            int num;
            //Generate Random or read user input
            if(input.equalsIgnoreCase("i")) {
                System.out.println("Enter a number: ");
                num = k.nextInt();
            }
            else{
                num = 1 +  r.nextInt(250);
            }
            //for loop to check if (2, n-1) numbers can evenly divide into n
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            //special cases
            if(num==1 || num==0){
                isPrime = false;
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
            //Check if user wants to enter another number
            System.out.println("Do you want to check another number(Y/N)?");
            String answer = k.next();
            if(answer.equalsIgnoreCase("y")){
                repeat = true;
            }
            else{
                repeat = false;
            }
        }while(repeat);
    }
}
