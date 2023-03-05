package Variable_Scanner_01Replits;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        //Enter your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal! \nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            String email = input.next();
            input.nextLine();//to capture Enter key press
            System.out.println("Enter your street");
            String street = input.nextLine();
        // continue for city

        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your work phone number");
        String workPhoneNumber = input.nextLine();

        System.out.println("Enter your personal phone number");
        String personalPhoneNumber = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height = input.nextDouble();

        System.out.println("Enter your weight");
        double weight = input.nextDouble();

        System.out.println("Are you married?");
        boolean  married = input.nextBoolean();

        System.out.println("Patient personal information\nFull name: "+firstName+" "+lastName+"\nAddress: "+street+", "+city+", "+state+" "+ zipCode+"\nContact: work phone number: "+ workPhoneNumber+", personal phone number: "+personalPhoneNumber+", email: "+email+"\nAge: "+age+"\nHeight: "+ height+"\nWeight: "+weight+" pounds \nMarried: "+married);

        input.close();
    }
}
/*
This program will use Scanner to get many inputs about a patient and use that information to build a summary.
Declare nine String variables: firstName, lastName, email, street, state, city

Declare two int variables: age, zipCode

Declare two double variables: height, weight

Declare a boolean variable: isMarried

Declare two long variables: workPhoneNumber ,personalPhoneNumber

Create a Scanner object named scan

Your program flow should go like this:
Note: anything indented is an input value from the console
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
Take all the inputs from the above flow and combine these sections together
Declare and assign a contact variable using these inputs: work phone, personal phone and email. Use a comma and a space to separate each value

Declare and assign a fullName variable using these inputs: first name and last name Use a space to seperate each value

Declare and assign an address variable using these inputs: street, city, state, zip code Use a comma and a space to separate each value

Display all of the information together as below
The final output of your program should be:
The first part of the outcome are the questions which are asked from the Scanner portion

Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?

Patient personal information
Full name: James May
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married: true
Main topics: variables, primitive datatypes, String, Scanner, concatenation
 */