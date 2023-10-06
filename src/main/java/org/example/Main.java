package org.example;


public class Main {
    public static void main(String[] args) {

        TokenGenerator tokenGenerator = new TokenGenerator();

        try {
            tokenGenerator.generateToken();
        } catch (Exception e) {
            tokenGenerator.printAlert();
        }
    }
}
