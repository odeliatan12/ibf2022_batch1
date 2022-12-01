package myapp.ver2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Enter a number\n> ");
        number = keyboard.nextInt();
        total += number;

        while (number != 0) {
            System.out.print("Enter another number\n> ");
            number = keyboard.nextInt();
            total += number;
        }
        System.out.println("The total is " + total + ".");

    }
}
