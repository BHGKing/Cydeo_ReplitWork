package String_03Replits;

import java.util.Scanner;

public class CarInsuranceQuote {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        Scanner input = new Scanner(System.in);

        double premiumCost = 0;

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String firstName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, fullName.indexOf(" ")).toLowerCase();
        String lastName = fullName.substring( fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2).toUpperCase() + fullName.substring(fullName.indexOf(" ") + 2).toLowerCase();
        fullName = firstName + " " + lastName;

        System.out.println("Do you have a US driver license?");
        String validLicense = input.nextLine();

        if (validLicense.equalsIgnoreCase("yes")){

            System.out.println("Enter your zip code");
            int zipCode = input.nextInt();
            input.nextLine();

            if(zipCode == 20910 || zipCode == 20740){
                premiumCost += 60;
            }else if (zipCode == 22102 || zipCode == 22103){
                premiumCost += 30;
            }else {
                premiumCost += 50;
            }

            System.out.println("Is this vehicle owned, financed, or leased?");
            String ownership = input.nextLine();

            if (ownership.equalsIgnoreCase("Owned") || ownership.equalsIgnoreCase("Financed") || ownership.equalsIgnoreCase("Leased")){

                if (ownership.equalsIgnoreCase("Owned")){
                    premiumCost += 10;
                } else if (ownership.equalsIgnoreCase("Financed")){
                    premiumCost += 15;
                } else {
                    premiumCost += 20;
                }
            }

            System.out.println("How is this vehicle primarily used?");
            String usage = input.nextLine();

            if (usage.equalsIgnoreCase("business") || usage.equalsIgnoreCase("pleasure") || usage.equalsIgnoreCase("commuting")) {

                if (usage.equalsIgnoreCase("commuting")) {

                    System.out.println("How many days do you commute?");
                    int commuteDays = input.nextInt();
                    premiumCost += 20;
                    int dailyAmount = 5;

                    commuteDays = commuteDays * dailyAmount;
                    premiumCost += commuteDays;


                }else if (usage.equalsIgnoreCase("business")) {

                    premiumCost += 50;

                } else if (usage.equalsIgnoreCase("pleasure")) {

                    premiumCost += 10;

                }
            }

            System.out.println("How old are you?");
            int age = input.nextInt();
            input.nextLine();

            if (age < 16) {
                System.out.println("You can't be driving!");
                System.exit(0);
            } else if (age > 16 && age < 20) {
                premiumCost *= 10;
            } else if (age > 20 && age < 25) {
                premiumCost *= 6;
            } else {
                premiumCost *= 2;
            }

            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents = input.nextLine();

            if(accidents.equalsIgnoreCase("Yes")){

                System.out.println("How many?");

                int numOfAccidents = input.nextInt();

                premiumCost += numOfAccidents * 10;

            }
            input.nextLine();

            System.out.println("What is the highest level of education you have completed?");
            String education = input.nextLine();
            education = education.replace(" ", "");


            if (education.equalsIgnoreCase("Bachelors") ||  education.equalsIgnoreCase("Masters")){

                premiumCost -= (premiumCost * (5.0 / 100));

            } else if (education.equalsIgnoreCase("PHD")){

                premiumCost -= (premiumCost * (10.0 / 100));

            } else if (education.equalsIgnoreCase("HighSchool")) {

                premiumCost += (premiumCost * (5.0 / 100));

            } else {
                System.out.println("Invalid Entry of education");
            }

            // build reference number

            // first 2 letters of first name
            String refFirstName = firstName.substring(0, 2).toUpperCase();

            // last 3 letters of last name
            String refLastName3Letters = lastName.substring(lastName.length() - 3).toUpperCase();

            String refEducation = education.toUpperCase().trim();

            String referenceNum = refFirstName + age + refLastName3Letters + zipCode + refEducation;



            System.out.println(fullName+ ", " + "here's your quote!");
            System.out.println("This is your start premium cost: $" +  premiumCost);
            System.out.println("This is your reference number: " + referenceNum);



        }else {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }
    }
}
