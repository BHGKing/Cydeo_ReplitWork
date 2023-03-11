package Methods_06Replits;

import java.util.Scanner;

public class CoverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here
        String result = "";
        boolean found = false;
        for (int i = 0; i < main.length(); i++) {
            if (i <= main.length() - coverMe.length()) {
                if (main.substring(i, i + coverMe.length()).equals(coverMe)) {
                    result += "[" + coverMe + "]";
                    i += coverMe.length() - 1;
                    found = true;
                } else {
                    result += main.charAt(i);
                }
            } else {
                result += main.charAt(i);
            }
        }
        if (!found) {
            result = "[" + main + "]";
        }
        return result;
    }
}
/*
Finish the method called coverString() that will take two String arguments main and coverMe and returns a String. Find each occurrence of the String coverMe in main. Wrap each occurrence of coverMe in square brackets. In the case that main does not have any occurrence of coverMe return a String with the whole main String wrapped in square brackets
The coverString() method is already called in the main method with an argument.

This is a return method with two String parameter
Main topics: methods, Scanner, String, loops

Example:

	coverString("java methods", "me"))

output:
	java [me]thods
Example:

	coverString("Certified Wooden Spoon", "o"))

output:
	Certified W[o][o]den Sp[o][o]n
Example:

	coverString("hello hello", "ello"))

output:
	h[ello] h[ello]
Example:

	coverString("apples", "pears"))

output:
	[apples]
 */