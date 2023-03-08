package String_03Replits;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:

        if (order.equalsIgnoreCase("chicken")){

            double total = 9.75;

            System.out.println("Your total is $"+total);

        }
        if (order.equalsIgnoreCase("burger")){

            double total = 12.50;

            System.out.println("Your total is $12.50"); // replit is case-sensitive so using variable total removes the 0 in 12.50

        }
    }
}
/*
Use String methods and if statements for the fast food company's menu. There is two main orders: A Burger meal or a Chicken meal. The cashier will have an input order that will be used to determine the price. Use the following information to determine the price of the order:
burger: $12.50
chicken: $9.75
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    chicken

  Output:
    Your total is $9.75
Ex:
  Input:
    burger

  Output:
    Your total is $12.50
 */