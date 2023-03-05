package String_03Replits;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        char firstLetter = word.charAt(0);

        char lastLetter = word.charAt(word.length() - 1);

        System.out.println("First letter: " + firstLetter);
        System.out.println("Last letter: " + lastLetter);


    }
}
/*
Use String methods to find the first and last character of the given word. The value of the word will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:
first letter: $first character of the word

last letter: $last character of the word

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    adobe

  Output:
    first letter: a
    last letter: e
Ex:
  Input:
    Java

  Output:
    first letter: J
    last letter: a
 */