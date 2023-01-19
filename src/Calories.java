
/*--------------------------------------------
    Program 1: Garrett's Popcorn Calorie Tracker
    Garrett's popcorn is looking to hire a developer to create a program that allows a customer to determine the total number of calories based on the 
    number of cups of popcorn the user enters. The nutritional facts state that there are 150 calories (54 calories from fat) per 1 cup (30 grams) of 
    Garrett's mixed popcorn. You will create a program that lets the customer enter the number of cups of popcorn consumed and then report 1) the total 
    number of calories consumed 2) the total number of calories from fat, and 3) the amount of popcorn in grams consumed.

    Calorie Information: https://www.nutritionix.com/i/garrett-popcorn-shops/garrett-mix/581d840270aa658137d9ddd6

	
	There will be five requirements for Program 1
	Requirement 1 - Variables declared and intialized; Constant variables declared; Properly utilized Scanner Object
                    
	Requirement 2 - Input/Output of all necessary information 
                    
    Requirement 3 - Correct calculations are made for cup to calorie conversion, calories from fat and cup to grams
    Requirement 4 - Style - Proper use of comments, spacing, in program; use of
                    descriptive variable names
    Requirement 5 - Program is submitted by the due date listed and pushed to assigned GitHub Repository; 
                    Repository contains a minimum of three commits.
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring I 2023
    System: Visual Studio Code, Mac OS
    Author: Michael Dreis
*/
import java.util.Scanner; //Scanner Class imported



public class Calories {
    public static void main(String[] args) throws Exception {

        //DECLARATIONS (Declare your variables below including your Scanner Object)
        int userCups;
        String userName;
        int totalCalories;
        int totalFatCalories;
        int totalGrams;
        final int CALORIES_PER_CUP = 150;
        final int CALORIES_FROM_FAT = 54;
        final int GRAMS_PER_CUP = 30;

        //INTRODUCTION
        System.out.println("Welcome to the Garrett's Popcorn Calorie Tracker!  This program will allow you to enter the total number of cups of Garrett's popcorn and provide you with the total number of calories consumed, the breakdown of calories from fat and the total number of grams per cup consumed.");
        System.out.println(" ");

        //INPUT AND OUTPUT (Use wording found in .gif video on README.md )
        Scanner scn = new Scanner(System.in);
        System.out.println("To get started, please enter the total number of popcorn cups consumed: ");
        userCups = Integer.parseInt(scn.nextLine());
        System.out.println("Please enter your name: ");
        userName = scn.nextLine();

        //MAKE CALCULATIONS
        totalCalories = userCups * CALORIES_PER_CUP;
        totalFatCalories = userCups * CALORIES_FROM_FAT;
        totalGrams = userCups * GRAMS_PER_CUP;


        //OUTPUT DATA TO CONSOLE
        System.out.println(userName + " your caloric intake of Garrett's Popcorn is listed below:");
        System.out.println("*****************************************************************************");
        System.out.println(userCups + " cup(s) equates to " + totalCalories + " calories");
        System.out.println(userCups + " cup(s) equates to " + totalGrams + " grams consumed");
        System.out.println("Of the " + totalCalories + " calories - " + totalFatCalories + " are from fat");

        scn.close();


    }
}
