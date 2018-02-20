package com.hertel.exercise06;

import java.util.Scanner;

class Input{
    Scanner scanner = new Scanner(System.in);

    public String promptString(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();

        return input;
    }

    public int promptInt(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();

        boolean isInt = false;
        int userInt = 0;

        while(!isInt) {
            try {
                userInt = Integer.parseInt(input);
                isInt = true;
            }
            catch (Exception e) {
                System.out.println(input + " is not a valid integer. " + prompt);
                input = scanner.nextLine();
            }
        }

        return userInt;
    }

    public double promptDouble(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();

        boolean isDouble = false;
        double userDouble = 0.0;

        while(!isDouble) {
            try {
                userDouble = Double.parseDouble(input);
                isDouble = true;
            }
            catch (Exception e) {
                System.out.println(input + " is not a valid double. " + prompt);
                input = scanner.nextLine();
            }
        }

        return userDouble;
    }
}

public class Main {

    public static void main(String[] args) {
	    Input userInput = new Input();

	    String userString = userInput.promptString("Enter a String: ");
        int userInt = userInput.promptInt("Enter an Integer: ");
        double userDouble = userInput.promptDouble("Enter a Double: ");

        System.out.println("String: " +userString+ "; Integer: " +userInt+ "; Double: " +userDouble);
    }
}
