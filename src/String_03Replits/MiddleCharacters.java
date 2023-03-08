package String_03Replits;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int length = word.length();
        String middleChars = "";

        if (length % 2 == 0) { // even length
            int middle = length / 2;
            middleChars = word.substring(middle - 1, middle + 1);
        } else { // odd length
            int middle = length / 2;
            middleChars = word.substring(middle, middle + 1);
        }

        System.out.println(middleChars);
    }
}
/*
Use String methods and if statements to find the middle character/s of the given word variable. The value of the word will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:
Note: Odd length words will have one middle character, but even length words will have two middle character, so use the length of the Strings to determine what the output should be.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements, operators

Ex:
  Input:
    oak

  Output:
    a
Ex:
  Input:
    java

  Output:
    av
Ex:
  Input:
    apples

  Output:
    pl
 */