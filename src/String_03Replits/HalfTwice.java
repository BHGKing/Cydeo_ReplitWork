package String_03Replits;

import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        int length = word.length();
        int middleIndex = length / 2;
        String firstHalf = word.substring(0, middleIndex);
        String result = firstHalf + firstHalf;

        System.out.println(result);



    }
}
/*
Use String methods to print the first half of the given word, twice. Find the beginning half of the String and concatenation it twice.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    java

  Output:
    jaja
Ex:
  Input:
    unity

  Output:
    unun
 */