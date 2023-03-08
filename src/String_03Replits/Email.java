package String_03Replits;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW

        int firstNameEndIndex = email.indexOf('_');
        String firstName = email.substring(0, firstNameEndIndex);
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        // Extract last name
        int lastNameStartIndex = firstNameEndIndex + 1;
        int lastNameEndIndex = email.indexOf('@');
        String lastName = email.substring(lastNameStartIndex, lastNameEndIndex);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        // Extract domain
        int domainStartIndex = lastNameEndIndex + 1;
        int domainEndIndex = email.lastIndexOf('.');
        String domain = email.substring(domainStartIndex, domainEndIndex);
        domain = domain.substring(0, 1).toUpperCase() + domain.substring(1).toLowerCase();

        // Print results
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);




    }
}
/*
Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

First name: $first name
Last name: $last name
Domain: $domain
Hint: Think about how to use substring and indexOf together
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
Ex:
  Input:
    sergey_brin@gmail.com

  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
 */