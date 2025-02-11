//Alex Pham
//CSC321
//Lab 4

import java.util.Scanner;

public class apham4 
{
    public static void main(String[] args) 
    {
        //Displays the menu options
        System.out.println("Choose a football team:");
        System.out.println("Option 1 - Los Angeles Rams");
        System.out.println("Option 2 - Philadelphia Eagles");
        System.out.println("Option 3 - Tampa Bay Buccaneers");
        System.out.println("Option 4 - Detroit Lions");

        //Gets user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of your choice (1-4):");
        int option = userInput.nextInt();

        //Displays the result based on the user's choice
        if (option == 1) 
        {
            System.out.println("You chose option 1, the most recent NFC Superbowl Champions, Los Angeles Rams!");
        } 
        else if (option == 2) 
        {
            System.out.println("You chose option 2, the team who can get revenge in Superbowl 59 against Kansas City!");
        } 
        else if (option == 3) 
        {
            System.out.println("You chose option 3, Tom Brady was 1 out of 2 QBs to beat Mahomes in the playoffs!");
        } 
        else if (option == 4) 
        {
            System.out.println("You chose option 4, from 15-2 record and the best stats in the league to losing to a rookie QB in the playoffs!");
        } 
        else 
        {
            System.out.println("Invalid option. Please choose a number between 1 and 4!");
        }
        userInput.close();
    }
}

