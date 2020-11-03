package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        assert number > 0;
        
        int reversedNumber = 0;
        int manipulatedNumber = number;
        while(manipulatedNumber > 0){
          reversedNumber = (reversedNumber * 10) + (manipulatedNumber % 10);
          manipulatedNumber /= 10;
        }
        boolean palindrome = number == reversedNumber;
        System.out.print("Palindrome: " + palindrome);
    }
}
