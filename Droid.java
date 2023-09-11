// Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.Collections;

/**
 * TITLE: Drone Simulator
 * 
 * SUMMARY: This program is a simualtion of a drone racer! The user can buy a drone, upgrade their drone, and race it!
 * 
 * PROGRAM ELEMENT LIST: functions, try catch, double, int, string, ArrayList, while loops, if, else if, else, scanner, boolean, 
 */
public class Droid
{
    
    /**
     * Constructor for objects of class Droid
     */
    public Droid()
    {
        
        // NONE
        
    } // End of constructor
    
    
    
    /**
     * Function Summary: This function clears the console
     * 
     * Parameters: no parameters
     * 
     * Return: void function (no return)
     */
    public static void clearConsole() {
        
        System.out.print("\f\n\n"); // Clears console and prints 2 blank lines
        
    } // End of clearConsole
    
    
    
    /**
     * Function Summary: This function pauses the program for a specific amount of time
     * 
     * Parameters: time - time is an int parameter. This is the number of seconds that the program is going to pause for.
     * 
     * Return: void function (no return)
     */
    public static void pauseProgram(int time) {
        
        try { // Pause program
            Thread.sleep(time * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } // End of try catch
        
    } // End of pauseProgram
    
    
    
    /**
     * Function Summary: This function returns a random number from a range
     * 
     * Parameters: average - average is an int parameter.
     * 
     * Return: This function returns a random int number between average-2 and average+2.
     */
    public static int random(int average) {
        
        // variables
        // gets random double number between average-3 and average+2, not including average-3 and including average+2.
        double temp = (average - 3) + Math.random() * (average + 2);
        // converts temp into an int
        int returnValue = (int) Math.ceil(temp);
        
        return returnValue;
        
    } // End of random
    
    
    
    /**
     * Function Summary: This function prints out a specific number of spaces
     * 
     * Parameters: amount - amount is an int parameter. This modifies how many spaces are going to be printed out
     * 
     * Return: returns a string which only consists of spaces, and the number of spaces differ depending on the parameter.
     */
    public static String printSpaces(int amount) {
        
        return new String(new char[amount]).replace("\0", " ");
        
    } // end of printSpaces
    
    
    
    /**
     * Function Summary: This function draws a shop with keyboard characters (ASCII ART!)
     * 
     * Parameters: none
     * 
     * Return: none
     */
    public static void drawShop() {
        
        System.out.println("     ======================      ");
        System.out.println("    )V V V V V V V V V V V V(    ");
        System.out.println("   )V V V V V V V V V V V V V(   ");
        System.out.println("  )V V V V V|-------|V V V V V(  ");
        System.out.println(" )V V V V V | SHOP! | V V V V V( ");
        System.out.println(")V V V V V  |_______|  V V V V V(");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                 "); // Shop drawing
        System.out.println("::::::####::::#####::::####::::::");
        System.out.println("::::::####::::#####::::####::::::");
        System.out.println("::::::####::::#####::::####::::::");
        System.out.println(":::::::::::::::::::::::::::::::::");
        System.out.println("::::::####::::|---|::::####::::::");
        System.out.println("::::::####::::|   |::::####::::::");
        System.out.println("::::::####::::|'  |::::####::::::");
        System.out.println("::::::::::::::|___|::::::::::::::");
        
    } // End of drawShop
    
    
    
    /**
     * This functions draws a drone with keyboard characters (ASCII ART!)
     * 
     * Parameters: none
     * 
     * Return: none
     */
    public static void drawDrone() {
        
        // drawing drone
        System.out.println("----------------==||==----------------\n               @+====+@\n               //    \\\\\n               \\\\____//");
        System.out.println("                \\____/\n               /      \\\n             (_        _)");
        
    } // End of drawDrone
    
    
    
    /**
     * Function Summary: This function enters the shop
     * 
     * Parameters: money - money is an int parameter. It is the amount of money that the user has before the race.
     * 
     * Return: returns an int depending on what place the user get
     */
    public static void enterShop(int money) {
        
        // clears the screen
        clearConsole();
        
        // draws the shop
        drawShop();

        System.out.println("\n\n\nEntering shop...");
        
        // Pauses program for 3 seconds
        pauseProgram(3);
        clearConsole();
        
        System.out.println("                                           OPTIONS                                           ");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|  (1) Buy Beginner Drone  :      $1000                                                     |");
        System.out.println("|  (2) Buy Advanced Drone  :      $2000                                                     |");
        System.out.println("|  (3) Buy Pro Drone       :      $4000                                                     |");
        System.out.println("|  (4) Upgrade Drone Speed :      $100                                                      |");
        System.out.println("|  (5) Repair Drone        :      $500                                                      |");
        System.out.println("|  (6) Sell Drone : We will give you half of your total money spent on your current drone.  |");
        System.out.println("|  (7) Exit Shop                                                                            |");
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("\n\nYou have : $" + money);
        
    } // End of enterShop
    
    
    
    /**
     * Function Summary: This function exits the shop
     * 
     * Paramters: none
     * 
     * Return: none
     */
    public static void exitShop() {
        
        // clears the screen
        clearConsole();
        
        // draws shop
        drawShop();
        
        System.out.println("\n\n\nExiting shop...");
        
        // Pauses program for 3 seconds
        pauseProgram(3);
        
        clearConsole();
        
    } // End of exitShop
    
    
    
    /**
     * Function Summary: This function switches to the main screen
     * 
     * Parameters: none
     * 
     * Return: none
     */
    public static void mainScreen() {
        
        clearConsole();
        System.out.println("-------------------"); // Box design
        System.out.println("| DRONE SIMULATOR |");
        System.out.println("-------------------");
        
        System.out.println("\nYou are in the main screen.");
        System.out.println("\nHere are the list of commands that you can use: ");
        
        // commands
        System.out.println("----------------------------------------------------");
        System.out.println("|  Main: goes to main menu                         |");
        System.out.println("|  Shop: goes to shop                              |");
        System.out.println("|  Stat: you can see the stats of your drone here  |");
        System.out.println("|  Race: race your drone!                          |");
        System.out.println("|  Exit: Exit program                              |");
        System.out.println("----------------------------------------------------");
        
    } // end of mainScreen
    
    
    
    /**
     * Function Summary: This function sets the screen to the stats screen.
     * 
     * Parameters: speed - speed is an int parameter. It is the current speed of the drone.
     *             health - health is an int parameter. It represents the health of the drone.
     *             droneType - droneType is a String parameter. This is the type of drone that the user owns.
     *             totalPrice - totalPrice is an int parameter. This represents the total amount of money the user spent on the drone.
     * 
     * Return: none
     */
    public static void statsScreen(int speed, int health, String droneType, int totalPrice) {
        
        // clear console
        clearConsole();
        
        // draw the drone
        drawDrone();
        
        // Introduction
        System.out.println("\n\nThis is the Stats Screen. Here you will be able to see the stats of your drone.");
        
        // Stats of drone
        System.out.println("\n  ----------------------------------------");
        System.out.println("  |  Drone Type : " + droneType + "         |");
        System.out.println("  |  Speed : " + String.valueOf(speed) + "                          |");
        System.out.print("  |  Drone Health : " + String.valueOf(health) + "%               ");
        if (health == 0) {
            System.out.println("    |");
        } else if ((health > 0) && (health <= 90)) {
            System.out.println("   |");
        } else {
            System.out.println("  |");
        }
        System.out.println("  |  Total Price Spent on Drone : $" + String.valueOf(totalPrice) + "  |");
        System.out.println("  ----------------------------------------");
        
    } // End of statsScreen
    
    
    
    /**
     * Function Summary: This function takes the user to the race screen.
     * 
     * Parameters: none
     * 
     * Return: none
     */
    public static void enterRaceScreen() {
        
        // Clears the console
        clearConsole();
        
        // Racing logo
        System.out.println("                                 88                          \n                                 \"\"                          ");
        System.out.println("                                                             \n8b,dPPYba, ,adPPYYba,  ,adPPYba, 88 8b,dPPYba,   ,adPPYb,d8  ");
        System.out.println("88P'   \"Y8 \"\"     `Y8 a8\"     \"\" 88 88P'   `\"8a a8\"    `Y88  ");
        System.out.println("88         ,adPPPPP88 8b         88 88       88 8b       88  ");
        System.out.println("88         88,    ,88 \"8a,   ,aa 88 88       88 \"8a,   ,d88 ");
        System.out.println("88         `\"8bbdP\"Y8  `\"Ybbd8\"' 88 88       88  `\"YbbdP\"Y8 ");
        System.out.println("                                                 aa,    ,88  ");
        System.out.println("                                                  \"Y8bbdP\"   ");
        
        // Welcome
        System.out.println("\n\nWelcome to Drone Racing!");
        
        // Options
        System.out.println(" -------------------------");
        System.out.println(" | (1) Beginner Race     |");
        System.out.println(" | (2) Intermediate Race |");
        System.out.println(" | (3) Hard Race         |");
        System.out.println(" | (4) Professional Race |");
        System.out.println(" | (5) Exit              |");
        System.out.println(" -------------------------");
        
        // Explanation
        System.out.println("\nYou will race against 3 other players!");
        System.out.println("There are 4 types of races: Beginner, Intermediate, Hard, and Professional.");
        System.out.println("The harder the race, the more rewards you get!");
        
    } // End of race
    
    
    
    /**
     * Function Summary: This function allows the user to race their drone.
     * 
     * Parameters: droneSpeed - This is an int parameter. This represents the speed of the user's drone.
     *             dronePicture - This is a String parameter. This is the image of the drone that will represent the drones in the race.
     *             computerSpeed - This is an int parameter. This will be the computer's speed.
     *             money - This is an int parameter. This represents the amount of money the user had BEFORE the race.
     * 
     * Return: This function returns an int, and that is the money earned. This varies on what place the user got.
     */
    public static int race(int droneSpeed, String dronePicture, int computerSpeed, int money) {
        
        // variables
        int playerPosition = 0;
        int computerPosition1 = 0;
        int computerPosition2 = 0;
        int computerPosition3 = 0;
        ArrayList <Integer> ranking = new ArrayList<Integer>();
        int playerRanking;
        int originalPlayerPosition = 0;
        int originalComputerPosition1 = 0;
        int originalComputerPosition2 = 0;
        int originalComputerPosition3 = 0;
        
        // Clears console
        clearConsole();
        
        // Drone arena
        System.out.println("==========================================================================================================================================================");
        System.out.print(" " + dronePicture + "  |");
        System.out.println("   <-- You are here");
        System.out.print(" " + dronePicture + "  |                                                                                                  ");
        System.out.println("           ");
        System.out.print(" " + dronePicture + "  |                                                                                                  ");
        System.out.println("           ");
        System.out.print(" " + dronePicture + "  |                                                                                                  ");
        System.out.println("           ");
        System.out.println("==========================================================================================================================================================");        
        
        // Pause program for 1 second
        pauseProgram(1);
        
        // The race
        while ((playerPosition < 150) || (computerPosition1 < 150) || (computerPosition2 < 150) || (computerPosition3 < 150)) {
            // Clear console
            clearConsole();
            if (playerPosition < 150) {
                originalPlayerPosition += random(droneSpeed);
                playerPosition = originalPlayerPosition;
                if (originalPlayerPosition >= 150) {
                    playerPosition = 150;
                } // End of if
            } else {
                originalPlayerPosition += random(droneSpeed);
            } // End of if else
            if (computerPosition1 < 150) {
                originalComputerPosition1 += random(computerSpeed);
                computerPosition1 = originalComputerPosition1;
                if (originalComputerPosition1 >= 150) {
                    computerPosition1 = 150;
                } // End of if
            } else {
                originalComputerPosition1 += random(computerSpeed);
            } // End of if else
            if (computerPosition2 < 150) {
                originalComputerPosition2 += random(computerSpeed);
                computerPosition2 = originalComputerPosition2;
                if (originalComputerPosition2 >= 150) {
                    computerPosition2 = 150;
                } // End of if
            } else {
                originalComputerPosition2 += random(computerSpeed);
            } // End of if else
            if (computerPosition3 < 150) {
                originalComputerPosition3 += random(computerSpeed);
                computerPosition3 = originalComputerPosition3;
                if (originalComputerPosition3 >= 150) {
                    computerPosition3 = 150;
                } // End of if
            } else {
                originalComputerPosition3 += random(computerSpeed);
            } // End of if else
            
            // Arena
            System.out.println("==========================================================================================================================================================");            System.out.println(printSpaces(playerPosition) + dronePicture + "     <-- You are here");
            System.out.println(printSpaces(computerPosition1) + dronePicture);
            System.out.println(printSpaces(computerPosition2) + dronePicture);
            System.out.println(printSpaces(computerPosition3) + dronePicture);
            System.out.println("==========================================================================================================================================================");            
            
            // Pause program for 1 second
            pauseProgram(1);
        } // End of while
        
        // Adding values to ranking
        ranking.add(originalPlayerPosition);
        ranking.add(originalComputerPosition1);
        ranking.add(originalComputerPosition2);
        ranking.add(originalComputerPosition3);
        
        // Sorting the list ranking
        Collections.sort(ranking);
        playerRanking = 4 - ranking.indexOf(originalPlayerPosition); // Getting the user's ranking
        
        // Gives money depending on the type of race and the player's ranking
        if (playerRanking == 1) {
            
            switch (computerSpeed) {
                case 10:
                    System.out.println("\n\nCongratulations! Your drone was placed 1st! You get $300 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 300));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 300;
                
                case 15:
                    System.out.println("\n\nCongratulations! Your drone was placed 1st! You get $350 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 350));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 350;
                
                case 20:
                    System.out.println("\n\nCongratulations! Your drone was placed 1st! You get $400 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 400));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 400;
                
                case 30:
                    System.out.println("\n\nCongratulations! Your drone was placed 1st! You get $450 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 450));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 450;
            } // End of switch case
            
        } else if (playerRanking == 2) {
            
            switch (computerSpeed) {
                case 10:
                    System.out.println("\n\nCongratulations! Your drone was placed 2nd! You get $150 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 150));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 150;
                
                case 15:
                    System.out.println("\n\nCongratulations! Your drone was placed 2nd! You get $200 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 200));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 200;
                
                case 20:
                    System.out.println("\n\nCongratulations! Your drone was placed 2nd! You get $250 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 250));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 250;
                
                case 30:
                    System.out.println("\n\nCongratulations! Your drone was placed 2nd! You get $300 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 300));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 300;
            } // End of switch case
            
        } else if (playerRanking == 3) {
            
            switch (computerSpeed) {
                case 10:
                    System.out.println("\n\nCongratulations! Your drone was placed 3rd! You get $100 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 100));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 100;
                
                case 15:
                    System.out.println("\n\nCongratulations! Your drone was placed 3rd! You get $150 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 150));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 150;
                
                case 20:
                    System.out.println("\n\nCongratulations! Your drone was placed 3rd! You get $200 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 200));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 200;
                
                case 30:
                    System.out.println("\n\nCongratulations! Your drone was placed 3rd! You get $250 as a reward!");
                    System.out.println("Your drone health decreased by 10%.");
                    System.out.println("\nYou now have: $" + (money + 250));
                    System.out.print("\nPlease press ENTER to continue.");
                    return 250;
            } // End of switch case
            
        } else {
            
            System.out.println("\n\nUnlucky! You got last place! Here is $50 for a participation reward.");
            System.out.println("Your drone health decreased by 10%.");
            System.out.println("\nYou now have: $" + (money + 50));
            System.out.print("\nPlease press ENTER to continue.");
            return 50;
            
        } // End of if, else if, else
        
        // Default return value in case of error
        return 0;
        
    } // End of race
    
    
    
    /**
     * This is the main function
     */
    public static void main(String[] args) {
        
        // Variables
        Scanner myScanner = new Scanner(System.in); // main scanner
        Scanner numberScanner = new Scanner(System.in); // scanner only for numbers
        int money = 1000;
        String userCommand;
        ArrayList <String> commands = new ArrayList<String>();
        commands.add("main");
        commands.add("shop"); // adding values to the array
        commands.add("stat");
        commands.add("race");
        commands.add("exit");
        int totalSpent = 0;
        int shopCommand;
        int raceCommand;
        int droneSpeed;
        int droneHealth;
        String droneType;
        String dronePicture = "\uD83D\uDEF0"; // image of drone
        boolean ownsDrone;
        int numUpgrades = 0;
        
        // Title
        clearConsole(); // Clears console at start of program
        System.out.println("-------------------"); // Box design
        System.out.println("| DRONE SIMULATOR |");
        System.out.println("-------------------");
        
        // Introduction
        System.out.println("\nWelcome to DRONE SIMULATOR!"); // Welcome message
        System.out.print("In this program, you will be able to create a virtual drone, "); // What to expect in program
        System.out.println("and will learn to be a professional drone racer!");
        System.out.println("Full screen is recommended.");
        System.out.print("\n\nPlease press ENTER to continue.");
        myScanner.nextLine();
        
        // Tutorial
        System.out.println("\n\nI will now begin the tutorial.");
        System.out.println("\nTo do anything in this program, you need to have a drone, but you don't have one yet!");
        System.out.println("Let's go buy a drone from the shop.");
        System.out.println("\nType in \"shop\" to go to the shop (without the quotation marks).");
        
        // User enters in shop
        System.out.print("\nYour command: ");
        while (true) { // Checks for invalid user input
            userCommand = myScanner.nextLine(); // Gets user input
            userCommand = userCommand.toLowerCase(); // Converts to lowercase
            if (userCommand.equals(commands.get(1))) { // User's command is equal to "shop"
                break; // Break out of while loop
            } else if (commands.contains(userCommand)) { // User's command is a valid command but it is not equal to "shop"
                System.out.println("\nThat's not what you're trying to do right now!");
                System.out.print("Please enter in the correct command: ");
            } else { // User's command is not valid
                System.out.println("\nThat is not a valid command!");
                System.out.print("Please enter in the correct command: ");
            } // End of if, else if, else
        } // End of while
        pauseProgram(1); // Pause program for 1 second
        enterShop(money); // Enter shop
        
        // Shop tutorial
        System.out.println("\nThis is the shop. Here you can buy your drone, and also upgrade your drone!"); // Shop introduction
        System.out.println("\nThe first three options allows you to buy a drone. Keep in mind that you cannot own more than one drone at a time!");
        System.out.println("\nThe fourth option allows you to upgrade your drone. You can only upgrade a drone 10 times!");
        System.out.println("\nThe fifth option allows you to repair your drone, if it is broken!");
        System.out.println("\nThe sixth option allows you to sell your current drone.");
        System.out.println("\nType in the option number to use that option!");
        System.out.println("\n\nNow that we know how the shop works, let's go ahead and buy a drone!");
        
        // Buy first drone
        System.out.println("You currently have $1000, so let's buy the Beginner Drone.");
        System.out.print("\nPlease select on option: ");
        while (true) { // Check for invalid user input
            if (!numberScanner.hasNextInt()) { // user's command is not an integer
                System.out.println("\nThat is not a valid command!"); // Error message
                System.out.print("Please enter in a valid command: ");
                numberScanner.next(); // Clear scanner
            } else { // User's command is an integer
                shopCommand = numberScanner.nextInt(); // Assign's user's command to shopCommand
                if (shopCommand == 1) { // User selected the right command
                    // Updates all appropriate variables
                    money -= 1000;
                    droneSpeed = 10;
                    droneHealth = 100;
                    totalSpent += 1000;
                    ownsDrone = true;
                    droneType = "Beginner Drone";
                    System.out.println("\nSuccessfully bought Beginner Drone!"); // Successful message
                    System.out.println("You now have: $" + money); // Shows user how much money they have
                    break; // Breaks out of while loop
                } else if ((shopCommand >= 2) && (shopCommand <= 7)) { // User command is one of the options but not 1
                    System.out.println("\nThat's not what you're trying to do right now!"); // Error message
                    System.out.print("Please enter in the correct command: ");
                } else { // not a valid command
                    System.out.println("\nThat is not a valid command!"); // Error message
                    System.out.print("Please enter in a valid command: ");
                } // end of if, else if, else
            } // end of if, else
        } // End of while
        
        // Exit shop
        System.out.println("\nLet's exit the shop.");
        System.out.print("\nYour command: ");
        while (true) { // Check for invalid user input
            if (!numberScanner.hasNextInt()) { // user's command is not an integer
                System.out.println("\nThat is not a valid command!"); // Error message
                System.out.print("Please enter in a valid command: ");
                numberScanner.next(); // Clears scanner
            } else { // user's command is an interger
                shopCommand = numberScanner.nextInt(); // assigns their input to shopCommand
                if (shopCommand == 7) { // the user enters in the correct command
                    pauseProgram(1); // pauses progrma for 1 second
                    exitShop(); // exits the shop
                    break; // Breaks out of while loop
                } else if ((shopCommand >= 1) && (shopCommand <= 7)) { // user's input is one of the shop's options but it is not the right one
                    System.out.println("\nThat is not what you are trying to do right now!"); // Error message
                    System.out.print("Please enter in the correct command: ");
                } else { // not a valid command
                    System.out.println("\nThat is not a valid command!"); // Error message
                    System.out.print("Please enter in a valid command: ");
                } // End of if, else if, else
            } // End of if, else
        } // End of while
        mainScreen(); // Goes back to main screen
        
        // Stats command tutorial
        System.out.println("\n\nNow that you have a drone, let's check the stats of your drone.");
        System.out.println("The command for that is \"stat\" without the quotation marks.");
        System.out.print("\nYour command: ");
        while (true) { // Checks for invalid user input
            userCommand = myScanner.nextLine();
            userCommand = userCommand.toLowerCase();
            if (userCommand.equals(commands.get(2))) { // User's command is equal to "stat"
                pauseProgram(1); // pause program for 1 second
                statsScreen(droneSpeed, droneHealth, droneType, totalSpent); // sets the screen to statsScreen.
                break; // Breaks out of loop
            } else if (commands.contains(userCommand)){ // User's command is a valid command but is not "stat"
                System.out.println("\nThat's not what you're trying to do right now!"); // Error message
                System.out.print("Please enter in the correct command: ");
            } else { // user's command is not valid
                System.out.println("\nThat is not a valid command!"); // Error message
                System.out.print("Please enter in the correct command: ");
            } // End of if, else if, else
        } // End of while
        
        // first race
        System.out.println("\nNow, let's start earning money! After 1 race, the tutorial will be over and you will have full control of the program.");
        System.out.println("Type in \"race\" without the quotation marks to start a race.");
        System.out.print("\nYour command: ");
        while (true) { // Check for invalid user input
            userCommand = myScanner.nextLine();
            userCommand = userCommand.toLowerCase();
            if (userCommand.equals(commands.get(3))) { // User input is equal to "race"
                pauseProgram(1); // pauses program for 1 second
                enterRaceScreen(); // enters race screen
                break; // breaks out of loop
            } else if (commands.contains(userCommand)) { // user input is valid but is not "race"
                System.out.println("\nThat's not what you're trying to do right now!"); // Error message
                System.out.print("Please enter in the correct command: ");
            } else { // user input is not valid
                System.out.println("\nThat is not a valid command!");
                System.out.print("Please enter in the correct command: ");
            } // End of if, else if, else
        } // End of while
        
        // Starting the beginner race
        System.out.println("\nChoose the Beginner Race, as your drone isn't fast enough for other races!");
        System.out.print("\nYour command: ");
        while (true) { // Checking for invalid user input
            if (!numberScanner.hasNextInt()) { // user input is not an integer
                System.out.print("\nThat is not a valid command! Please enter in the correct command: "); // Error message
                numberScanner.next();
            } else { // user input is an integer
                raceCommand = numberScanner.nextInt();
                if (raceCommand == 1) { // user command is equal to 1
                    pauseProgram(1);
                    money += race(droneSpeed, dronePicture, 10, money);
                    break;
                } else if ((raceCommand > 1) && (raceCommand <= 5)) { // user command is valid but not 1
                    System.out.println("\nThat is not what you're trying to do right now!"); // Error message
                    System.out.print("Please enter in the correct command: ");
                } else { // user command is not valid
                    System.out.print("\nThat is not a valid command! Please enter in the correct command: "); // Error message
                } // End of if, else if , else
            } // End of if, else
        } // End of while
        myScanner.nextLine();
        mainScreen();
        System.out.println("\nYou now finished the tutorial! Enjoy using the program!"); // finished tutorial
        
        // main program
        while (true) { // loops whole program until user decides to quit program
            System.out.print("\nYour command: ");
            userCommand = myScanner.nextLine(); // getting user input
            userCommand = userCommand.toLowerCase(); // converts userCommand to lowercase
            if (commands.contains(userCommand)) { // user's command is valid
                if (userCommand.equals(commands.get(0))) { // user's command is "main"
                    
                    pauseProgram(1); // Pause program for 1 second
                    mainScreen(); // goes to main screen
                    
                } else if (userCommand.equals(commands.get(1))) { // user's command is equal to "shop"
                    
                    pauseProgram(1); // pause program for 1 second
                    enterShop(money); // enters shop
                    System.out.println("\nHi, how can I help you today?");
                    while (true) { // keeps the user in the shop until they exit the shop
                        System.out.print("\nYour command: ");
                        while (true) { // check for invalid user input
                            if (!numberScanner.hasNextInt()) { // user's input is not an integer
                                System.out.println("\nThat is not a valid command!"); // error message
                                System.out.print("Please enter in a valid command: ");
                                numberScanner.next(); // clears scanner
                            } else { // user input is an integer
                                shopCommand = numberScanner.nextInt();
                                if ((shopCommand >= 1) && (shopCommand <= 7)) { // user input is a valid command
                                    break; // break out of loop
                                } else { // user input is not valid
                                    System.out.println("\nThat is not a valid command!"); // error message
                                    System.out.print("Please enter in a valid command: ");
                                    numberScanner.next();
                                } // end of if, else
                            } // end of if, else
                        } // end of while
                        
                        if (shopCommand == 1) { // if user selected first option
                            if (ownsDrone) { // if user already has a drone
                                System.out.println("\nYou already own a drone!"); // error message
                            } else if (money < 1000) { // if user doesn't have enough money
                                System.out.println("\nYou don't have enough money!"); // error message
                            } else { // if user is able to buy drone
                                // updates appropriate variables
                                money -= 1000;
                                totalSpent = 1000;
                                droneSpeed = 10;
                                droneHealth = 100;
                                droneType = "Beginner Drone";
                                ownsDrone = true;
                                numUpgrades = 0;
                                System.out.println("\nYour purchase of " + droneType + " was successfull!"); // successfull message
                                System.out.println("You now have : $" + money + "."); // shows how much money the user has
                            } // end of if, else if, else
                        } else if (shopCommand == 2) { // if user selected the 2nd option
                            if (ownsDrone) { // if user already owns a drone
                                System.out.println("\nYou already own a drone!"); // erro rmessage
                            } else if (money < 2000) { // if user doesn't have enough money
                                System.out.println("\nYou don't have enough money!"); // error message
                            } else { // if user is able to buy drone
                                // updates appropriate variables
                                money -= 2000;
                                totalSpent = 2000;
                                droneSpeed = 15;
                                droneHealth = 100;
                                droneType = "Advanced Drone";
                                ownsDrone = true;
                                numUpgrades = 0;
                                System.out.println("\nYour purchase of " + droneType + " was successfull!"); // successfull message
                                System.out.println("You now have : $" + money + "."); // shows how much money the user has left
                            } // end of if, else if, else
                        } else if (shopCommand == 3) { // if user selected the third option
                            if (ownsDrone) { // if user already has a drone
                                System.out.println("\nYou already own a drone!"); // error message
                            } else if (money < 4000) { // if user doesn't have enough money
                                System.out.println("\nYou don't have enough money!"); // error message
                            } else { // if user is able to buy drone
                                // updates appropriate variables
                                money -= 4000;
                                totalSpent = 4000;
                                droneSpeed = 20;
                                droneHealth = 100;
                                droneType = "Pro Drone";
                                ownsDrone = true;
                                numUpgrades = 0;
                                System.out.println("\nYour purchase of " + droneType + " was successfull!"); // successfull message
                                System.out.println("You now have : $" + money + "."); // shows how much money the user has left
                            } // end of if, else if, else
                        } else if (shopCommand == 4) { // user selects the fourth option
                            if (!ownsDrone) { // user doesn't have a drone
                                System.out.println("\nYou don't own a drone!"); // error message
                            } else if (numUpgrades >= 10) { // if the user already upgraded the drone 10 times
                                System.out.println("\nYou already upgraded your drone 10 times!"); // erro rmessage
                            } else if (money < 100) { // if user doesn't have enough money
                                System.out.println("\nYou don't have enough money!"); // error message
                            } else { // user is able to buy upgrade
                                // updates appropriate variables
                                money -= 100;
                                totalSpent += 100;
                                droneSpeed++;
                                numUpgrades++;
                                System.out.println("\nYour purchase of Upgrade Drone Speed was successfull!"); // successful message
                                System.out.println("You now have : $" + money + "."); // shows how much money the user has left
                            } // end of if, else if, else
                        } else if (shopCommand == 5) { // the user chooses the fifth option
                            if (!ownsDrone) { // user doesn't own a drone
                                System.out.println("\nYou don't own a drone!"); // error message
                            } else if (droneHealth == 100) { // user's drone is already in perfect condition
                                System.out.println("\nYour drone is already in perfect condition!"); // error message
                            } else { // user is able to buy repair
                                // updates appropriate variables
                                money -= 500;
                                droneHealth = 100;
                                System.out.println("\nYour drone is fixed! Good as new!"); // successful message
                                System.out.println("You now have : $" + money + "."); // shows how much money the user has left
                            } // end of if, else if, else
                        } else if (shopCommand == 6) { // user chooses the sixth option
                            if (!ownsDrone) { // user doesn't have a drone
                                System.out.println("\nYou don't own a drone!"); // error message
                            } else if ((money + (totalSpent / 2)) < 1000) { // if the user sells the drone they will have less than 1000
                                System.out.println("\nIf you sell your drone, you will not have enough money to buy another one ever again!"); // error
                            } else { // user is able to sell drone
                                // updates appropriate variables
                                money += (totalSpent / 2);
                                ownsDrone = false;
                                System.out.println("\n$" + String.valueOf(totalSpent/2) + " have been added to your account"); // successful message
                                System.out.println("You now have : $" + money + "."); // shows how much money the user has left
                            } // end of if, else if, else
                        } else { // the user chooses the 7th option
                            pauseProgram(1); // pauses program for 1 second
                            exitShop(); // exits the shop
                            mainScreen(); // goes to main screen
                            break; // breaks out of shop loop
                        } // end of if, else if, else
                    } // end of while
                    
                } else if (userCommand.equals(commands.get(2))) { // user command is "stat"
                    
                    if (!ownsDrone) { // if the user doesn't own a drone
                        System.out.println("\nYou don't own a drone yet! Please buy one from the shop."); // error message
                    } else { // user owns a drone
                        pauseProgram(1); // pauses program for 1 second
                        statsScreen(droneSpeed, droneHealth, droneType, totalSpent); // goes to stat screen
                    } // end of if, else
                    
                } else if (userCommand.equals(commands.get(3))) { // user chooses "race"
                    
                    if (!ownsDrone) { // if the user doesn't own a drone
                        System.out.println("\nYou don't own a drone yet! Please buy one from the shop."); // error message
                    } else if (droneHealth <= 0) { // if the health of drone is 0
                        System.out.println("\nYour drone is broken! Go repair it from the shop!"); // error message
                    } else { // if user is able to race
                        pauseProgram(1); // pause program for 1 second
                        enterRaceScreen(); // enter race screen
                        System.out.print("\nYour command: ");
                        while (true) { // checks for invalid user input
                            if (!numberScanner.hasNextInt()) { // if user input is not an integer
                                System.out.println("\nThat is not a valid command!"); // error message
                                System.out.print("Please enter in the correct command: ");
                                numberScanner.next();
                            } else { // if user input is an integer
                                raceCommand = numberScanner.nextInt();
                                if (raceCommand == 1) { // if user's command is 1
                                    pauseProgram(1); // pause program for 1 second
                                    money += race(droneSpeed, dronePicture, 10, money); // start beginner race
                                    droneHealth -= 10;
                                    myScanner.nextLine();
                                    pauseProgram(1);
                                    mainScreen(); // goes to main screen
                                    break; // breaks out of loop
                                } else if (raceCommand == 2) { // if user selected 2
                                    pauseProgram(1); // pause program for 1 second
                                    money += race(droneSpeed, dronePicture, 15, money);
                                    droneHealth -= 10;
                                    myScanner.nextLine();
                                    pauseProgram(1);
                                    mainScreen(); // goes to main screen
                                    break;
                                } else if (raceCommand == 3) { // user chooses 3
                                    pauseProgram(1); // pause program for 1 second
                                    money += race(droneSpeed, dronePicture, 20, money);
                                    droneHealth -= 10;
                                    myScanner.nextLine();
                                    pauseProgram(1);
                                    mainScreen(); // goes to main screen
                                    break;
                                } else if (raceCommand == 4) { // user chooses 4
                                    pauseProgram(1);
                                    money += race(droneSpeed, dronePicture, 30, money);
                                    droneHealth -= 10;
                                    myScanner.nextLine();
                                    pauseProgram(1);
                                    mainScreen(); // goes to main screen
                                    break;
                                } else if (raceCommand == 5) { // user chooses 5
                                    pauseProgram(1);
                                    mainScreen(); // goes to main screen
                                    break;
                                } else { // not a valid command
                                    System.out.println("\nThat is not a valid command!"); // error message
                                    System.out.print("Please enter in the correct command: ");
                                } // end of if, else if, else
                            } // end of if, else
                        } // end of while
                    } // end of if, else if, else
                    
                } else if (userCommand.equals(commands.get(4))) { // if user chose "exit"
                    
                    System.out.print("\nAre you sure? YOUR DATA WILL NOT BE SAVED! (Y/N): "); // confirm message
                    while (true) { // check for invalid user input
                        userCommand = myScanner.nextLine();
                        userCommand = userCommand.toLowerCase();
                        if (userCommand.equals("y")) { // user selects yes
                            pauseProgram(1);
                            System.out.println("\nThank you for using DRONE SIMULATOR. Hope you had fun playing!");
                            System.exit(0); // exits program
                        } else if (userCommand.equals("n")) { // user selects no
                            pauseProgram(1);
                            System.out.println("\nProgram NOT terminated!"); // doesn't exit program
                            break;
                        } else { // not a valid command
                            System.out.print("\nPlease use the correct command: "); // error message
                        } // end of if, else if, else
                    } // end of while
                    
                } else { // for some reason, if there is an error
                    
                    System.out.println("Error! Please restart program..."); // error message
                    System.exit(0); // force quit program
                    
                } // end of if, else if, else
            } else { // invalid user input
                System.out.println("\nThat is not a valid command!"); // error message
                System.out.println("Please enter in the correct command. ");
            } // end of if, else if, else
        } // end of while
        
    } // End of main method
    
} // end of class



/*
 * NOTES:
 * none
 * 
 * TEST CODE:
 * System.out.println(userCommand);
 * System.out.println(userCommand.equals("y"));
 * 
 */


