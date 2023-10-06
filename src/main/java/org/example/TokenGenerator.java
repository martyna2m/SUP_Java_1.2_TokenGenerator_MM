package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public void generateToken() throws InputMismatchException {

        printInstruction();
        int charNumber = scan.nextInt();

        String token = rand.ints(33, 123)

                .filter(num -> (num != 34) && (num != 39) && (num < 43 || num > 47) && (num < 58 || num > 63) && (num < 91 || num > 93) && (num < 95 || num > 96))

                .limit(charNumber)

                .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)

                .toString();

        if (charNumber != 5 && charNumber != 10 && charNumber != 15) {
            printAlert();
        } else System.out.println("Your token: " + token);
    }


    private void printInstruction() {
        System.out.println("Choose the number of characters in your token: 5, 10, or 15");
    }

    public void printAlert() {
        System.out.println("You can only choose number 5, 10, or 15 as an option. Please start again.");
    }

}

