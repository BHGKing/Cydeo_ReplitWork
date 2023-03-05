package Statements_02Replits;

import java.util.Scanner;

public class FindMiddleNumber {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt(); // .next() or .nextLine() - string

        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println("Enter third number:");
        int c = input.nextInt();

        if ((a > b  && b > c) || ( c > b && b > a)){
            System.out.println("middle number is: " + b);
        }else if ((a > c && c > b) || (b > c && c > a)){
            System.out.println("middle number is: " + c);
        }else if ((b > c && a > c) || (c > a && a > b)){
            System.out.println("middle number is: " + a);
        }else{
            System.out.println("invalid");
        }
    }
}
/*
Using if statements and Scanner write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
Main topics: if statements, primitive variables, operators, Scanner

Example Flows:

Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25

Enter first number:
140
Enter second number:
34
Enter third number:
1
middle number is: 34
 */