package com.pluralsight;
import java.util.*;
public class SandwichShop {
    static void main() {
        double sandwich1 = 5.45;
        double sandwich2 = 8.95;
        double kidsDiscount = 0.1;
        double seniorDiscount = 0.2;
        double calculatedDiscount;
        boolean validInput = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose the size: \n1: Regular: base price $5.45 \n2: Large: base price $8.95");
        int sandwichSize = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Do want it loaded? y/n");
        String isLoaded = myScanner.nextLine();
        System.out.println("What is your age: ");
        int customerAge = myScanner.nextInt();

        if (sandwichSize == 1 && isLoaded.equals("y")){
            sandwich1 += 1.00;
            if (customerAge < 18) {
                calculatedDiscount = sandwich1 - (sandwich1 * kidsDiscount);
            }
            else if (customerAge >= 65) {
                calculatedDiscount = sandwich1 - (sandwich1 * seniorDiscount);
            }
            else {
                calculatedDiscount = sandwich1;
            }
            validInput = true;
        }
        else if (sandwichSize == 1 && isLoaded.equals("n")){
            if (customerAge < 18) {
                calculatedDiscount = sandwich1 - (sandwich1 * kidsDiscount);
            }
            else if (customerAge >= 65) {
                calculatedDiscount = sandwich1 - (sandwich1 * seniorDiscount);
            }
            else {
                calculatedDiscount = sandwich1;
            }
            validInput = true;
        }
        else if (sandwichSize == 2 && isLoaded.equals("y")){
            sandwich2 += 1.75;
            if (customerAge < 18) {
                calculatedDiscount = sandwich2 - (sandwich2 * kidsDiscount);
            }
            else if (customerAge >= 65) {
                calculatedDiscount = sandwich2 - (sandwich2 * seniorDiscount);
            }
            else {
                calculatedDiscount = sandwich2;
            }
            validInput = true;
        }
        else if (sandwichSize == 2  && isLoaded.equals("n")){
            if (customerAge < 18) {
                calculatedDiscount = sandwich2 - (sandwich2 * kidsDiscount);
            }
            else if (customerAge >= 65) {
                calculatedDiscount = sandwich2 - (sandwich2 * seniorDiscount);
            }
            else {
                calculatedDiscount = sandwich2;
            }
            validInput = true;
        }
        else {
            calculatedDiscount = 0.0;
        }
        if (validInput) {
            System.out.println("Your sandwich will cost: " + calculatedDiscount);
        }
        else{
            System.out.println("Invalid Input try again!");
        }

    }
}
