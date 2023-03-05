package Statements_02Replits;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double price = 0;

        // Ask for screen size
        System.out.println("Select screen size:");
        double screen = input.nextDouble();
        input.nextLine();

        if (screen == 13.3){
            price += 200;
        }else if (screen == 15.0) {
            price += 300;
        }else if (screen == 17.3){
            price += 400;
        }


        // Ask for CPU type
        System.out.println("Select CPU type:");
        String cpu = input.next();

        if (cpu.equalsIgnoreCase("i3")){
            price += 150;
        }else if (cpu.equalsIgnoreCase("i5")){
            price += 250;
        }else if (cpu.equalsIgnoreCase("i7")){
            price += 350;
        }


        // Ask for RAM size
        System.out.println("Select RAM size:");
        int ram = input.nextInt();
        input.nextLine();

        price += (ram / 4) * 50;


        // Ask for storage type and size
        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        input.nextLine();

        if (storageType.equalsIgnoreCase("HDD")){
            price += (storageSize / 500) * 50;
        }else if (storageType.equalsIgnoreCase("SSD")){
            price += (storageSize / 500) * 100;
        }


        // Ask for screen resolution
        System.out.println("Select screen resolution:");
        String resolution = input.next();

        if (resolution.equalsIgnoreCase("FULLHD")){
            price += 100;
        }else if (resolution.equalsIgnoreCase("4K")){
            price += 200;
        }

        // Display total price
        System.out.println("Final price is: $" + price);
    }
}
/*
Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:
First ask the user about the screen size

Select screen size:

For a screen size of 13.3, add $200 to the total price
For a screen size of 15.0, add 300 to the total price
For screen size of 17.3, add $400 to the total price
Then ask the user about the CPU

Select CPU type:

For a CPU of i3, add $150 to the total price
For a CPU of i5, add $250 to the total price
For a CPU of i7, add $350 to the total price
Then ask the user about the RAM size

Select RAM size:

Add $50 to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4
Then ask the user about the storage type and amount

Select storage type:

Select storage size:

For HDD, add $50 to the total price for every 500GB
For SSD, add $100 to the total price for every 500GB
Then ask the user about the screen resolution

Select screen resolution:

For FULLHD, add $100 to the total price
For 4K, add $200 to the total price
** At the end display the total price of the custom computer**

Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

Example Flows:

  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
 */