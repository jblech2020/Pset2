/*
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

         // System.out.print("Enter your first name: ");
         // String firstName = in.next();
         //
         // System.out.print("Enter your last name: ");
         // String lastName = in.next();
         //
         // System.out.print("Enter your grade: ");
         // int grade = in.nextInt();
         //
         // System.out.print("Enter your age: ");
         // int age = in.nextInt();
         // in.nextLine();
         //
         // System.out.print("Enter your hometown: ");
         // String hometown = in.nextLine();
         //
         // System.out.println("\nNAME \t : " + firstName + " " + lastName);
         // System.out.println("GRADE \t : " + grade);
         // System.out.println("AGE \t : " + age);
         // System.out.println("HOMETOWN : " + hometown + "\n");

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         // System.out.print("\nEnter a dollar amount: ");
         // double dollarAmt = in.nextDouble();
         //
         // final double DOLLAR = 1;
         // final double QUARTER = .25;
         // final double DIME = .1;
         // final double NICKEL = .05;
         // final double PENNY = .01;
         //
         // double dollars = Math.floor(dollarAmt / DOLLAR);
         // double leftOver = dollarAmt % DOLLAR;
         //
         // double quarters = Math.floor(leftOver / QUARTER);
         // leftOver %= QUARTER;
         //
         // double dimes = Math.floor(leftOver / DIME);
         // leftOver %= DIME;
         //
         // double nickels = Math.floor(leftOver / NICKEL);
         // leftOver %= NICKEL;
         //
         // double pennies = Math.floor(leftOver / PENNY);

         // System.out.printf("\n%s %.0f\n", "DOLLARS  :", dollars);
         // System.out.printf("%s %.0f\n", "QUARTERS :", quarters);
         // System.out.printf("%s %.0f\n", "DIMES \t :", dimes);
         // System.out.printf("%s %.0f\n", "NICKELS  :", nickels);
         // System.out.printf("%s %.0f\n", "PENNIES  :", pennies);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         // System.out.print("\nEnter a dollar amount: ");
         // dollarAmt = in.nextDouble();
         //
         // final double TEN_DOLLAR = 10;
         // final double FIVE_DOLLAR = 5;
         //
         // double tenDollars = Math.floor(dollarAmt / TEN_DOLLAR);
         // leftOver = dollarAmt % TEN_DOLLAR;
         //
         // double fiveDollars = Math.floor(leftOver / FIVE_DOLLAR);
         // leftOver %= FIVE_DOLLAR;
         //
         // dollars = Math.floor(leftOver / DOLLAR);
         // leftOver %= DOLLAR;
         //
         // quarters = Math.floor(leftOver / QUARTER);
         // leftOver %= QUARTER;
         //
         // dimes = Math.floor(leftOver / DIME);
         // leftOver %= DIME;
         //
         // nickels = Math.floor(leftOver / NICKEL);
         // leftOver %= NICKEL;
         //
         // pennies = Math.floor(leftOver / PENNY);
         //
         // double bills = tenDollars + fiveDollars + dollars;
         // double coins = quarters + dimes + nickels + pennies;
         //
         // System.out.printf("\n%s %.0f\n", "BILLS :", bills);
         // System.out.printf("%s %.0f\n", "COINS :", coins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         // System.out.print("\nEnter a number of inches: ");
         // double inches = in.nextDouble();
         //
         // final double MILE = 63360;
         // final double YARD = 36;
         // final double FOOT = 12;
         //
         // double miles = Math.floor(inches / MILE);
         // inches %= MILE;
         //
         // double yards = Math.floor(inches / YARD);
         // inches %= YARD;
         //
         // double feet = Math.floor(inches / FOOT);
         // inches %= FOOT;
         //
         // inches = Math.floor(inches);
         //
         // System.out.printf("\n%s %.0f\n", "MILES  :", miles);
         // System.out.printf("%s %.0f\n", "YARDS  :", yards);
         // System.out.printf("%s %.0f\n", "FEET   :", feet);
         // System.out.printf("%s %.0f\n", "INCHES :", inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         // System.out.print("\nEnter a number of centimeters: ");
         // double centimeters = in.nextDouble();
         //
         // final double KILOMETER = 100000;
         // final double METER = 100;
         //
         // double kilometers = Math.floor(centimeters / KILOMETER);
         // centimeters %= KILOMETER;
         //
         // double meters = Math.floor(centimeters / METER);
         // centimeters %= METER;
         //
         // centimeters = Math.floor(centimeters);
         //
         // System.out.printf("\n%s %.0f\n", "KILOMETERS  :", kilometers);
         // System.out.printf("%s %.0f\n", "METERS \t    :", meters);
         // System.out.printf("%s %.0f\n", "CENTIMETERS :", centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         double radius = diameter / 2;

         double area = Math.PI * (Math.pow(radius, 2));
         double circumference = 2 * Math.PI * radius;

         System.out.printf("\n%s %.2f\n", "AREA\t      :", area);
         System.out.printf("%s %.2f\n", "CIRCUMFERENCE :", circumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
