package PersonalFinance;

import java.util.Scanner;

public class personalFinance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Welcome Marcus, Lets get your finances together.");
        System.out.println("Type DONE to exit program:");


        while (true) {

            double result = estimatePay();
            System.out.println("Estimated pay: " + result);

            System.out.println("Do you plan on saving this pay period: y/n");
            String saveOptionAnswer = keyboard.nextLine();
            if (saveOptionAnswer.equalsIgnoreCase("y")){
                double totalToSave = .35 * result;
                System.out.println("You need to save: " + totalToSave);

            }




            String userOption = keyboard.nextLine();
             if (userOption.equalsIgnoreCase("done")) {
                System.out.println("Exiting the program...");
                break;
            }



        }

    }

    public static double estimatePay(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter work hours to estimate upcoming pay: ");
        double estimatedHours = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter pay rate: ");
        double payRate = Double.parseDouble(keyboard.nextLine());

        double federalWithholdingRate = 0.15;
        double stateWithholdingRate = 0.0425;

        double grossPay = estimatedHours * payRate;
        double federalWithholdingAmount = grossPay * federalWithholdingRate;
        double stateWithholdingAmount = grossPay * stateWithholdingRate;
        double netPay = grossPay - (federalWithholdingAmount + stateWithholdingAmount);

        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Federal Withholding: " + federalWithholdingAmount);
        System.out.println("State Withholding: " + stateWithholdingAmount);
        System.out.println("Net Pay: " + netPay);

        return netPay;
    }


}
