package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String answer = "";
        System.out.print("Hi I'm Eliza, how can I help you today? ");

        while (!(answer.equalsIgnoreCase("q"))){

            System.out.print("Enter your response here or q to quit: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            System.out.println(answer);
        }

    }
}
