package Basics_00Replits;

public class Employee {
    public static void main(String[] args) {
        String firstName = "Noah",
                lastName = "Smith",
                companyName = "Apple",
                jobTitle = "SDET";
        int startDay = 10;
        int salary = 200_000;
        int startYear = 2022;
        int startMonth = 1;
        boolean isFullTime = true;
        String address = "One Apple Park Way, Cupertino, CA 95014";

        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + "/" + startDay + "/" + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        int salary_2_Years = 230000;

        System.out.println("Employee Information");
        System.out.println("We have " + fullName + " joining " + companyName);
        System.out.println(firstName + " will start on " + fullStartDate + " as full time: " + isFullTime);
        System.out.println(firstName + " here is some information about your employment");
        System.out.println("Your email is " + email);
        System.out.println("Your base salary is $" + salary + " and after 2 years it will be $" + salary_2_Years);
        System.out.println("Welcome aboard, see you at " + address);
    }
}
/*
Use the given information to create and print out the information of an employee
Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)
first name: Noah

last name: Smith

company name: Apple

salary: 200,000

start day: 10

start month: 1

start year: 2022

full time: true

job title: SDET

office address: One Apple Park Way, Cupertino, CA 95014

Declare these new variables using the values of the previous variables
full name: (first and last name)

full start date: (start month date, year)

email: (first name + start day @ company name .com)

salary after 2 years (base salary * 15 %)

Display all the information in the following format using the variables created up to this point:
Employee Information
We have FULL_NAME joining COMPANY_NAME
FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
FIRST_NAME here is some information about your employment
Your email is EMAIL
Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
Welcome aboard, see you at ADDRESS
Note: Variables should be used to construct the message otherwise it will be hardcoded information

Main topics: variables, primitive datatypes, concatenation, operators
 */