package code.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variables first
        int hours = 0;
        float hourly_rate = 0.0f; //float hourly_rate = 0.0; <== Error. Correct ==> float hourly_rate = 0.0f;
        String name = "";
        float wage = 0.0f;
        int ot = 8;

        //accept name of employee
        name = JOptionPane.showInputDialog(null, "What is the name of the employee?");

        //accepts the hours and hourly rate
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        hours = input.nextInt();
        System.out.print("Enter the hourly rate: ");
        hourly_rate = input.nextFloat();

        //detect if there is overtime and compute the wage
        if(hours > 40){
            ot = hours - 40;
            wage = (40 * hourly_rate) + (float)((hourly_rate + (hourly_rate * .3)) * ot);

        } else {

            wage = 40 * hourly_rate;

        }

        System.out.println("The wage of " + name + " is " + String.format("%.2f", wage));

    }
}
