package PersonalFinance;

import java.util.Scanner;

public class WhileLoops {




    public static void main(String[] args) {

        // The while loop:
        //The "while" loop executes a block of code repeatedly as long as the specified condition is true.
        //Syntax: while (condition) { }
        // Example:
        // Let's create a while loop that prints numbers from 1 to 5.

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        //The do-while loop:
        //The "do-while" loop is similar to the "while" loop, but it guarantees the code block is executed at least once, even if the condition is false.
        //Syntax: do { Code to be executed repeatedly. } while (condition);
        // Example:
        // Let's create a do-while loop that prints numbers from 1 to 5.

        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


        // very simple examples of loops that let the user choose when to stop:
        //
        //Example 1: Counting numbers entered by the user
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to add. Enter 0 to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of entered numbers: " + sum);
        scanner.close();
    }

    }


