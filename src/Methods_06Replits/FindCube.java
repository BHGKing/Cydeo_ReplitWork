package Methods_06Replits;

import java.util.Scanner;

public class FindCube {
    public static void cube(){

        int n = new Scanner(System.in).nextInt();

        //TYPE YOUR CODE BELOW:
        int output = n * n * n;

        System.out.println(output);


    }


    public static void main(String[] args) {

        cube();

    }
}
/*
Finish the given method cube() to print the cubed value of the given n number. Print the result. Also call the cube() method in the main method to display result.
This is a void method with no parameters
Hint: cube of a number is n^3 = n * n * n
Main topics: methods, Scanner, primitive datatypes, operators

Example:

input:
  5

output:
  125

-> our method would have done 5 * 5 * 5 to print the final value of 125
 */