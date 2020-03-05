/*
 * Edmunds GovTech Problem3
 * Last update: 03/02/20
 * @author: Connor Keenan
 * @version: 2020.03.02
 * @comment: Could change class name to reflect problem, break code inside cases into methods, Single Responsibility Principle 
 */
import java.util.*;
public class Problem3Functional{
    public static void main(String[ ] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Select from the following menu:\n" 
            + "1. Format Phone Number.\n" 
            + "2. Format Social Security Number.\n" 
            + "Q. Exit Program.\n"
            + "Make your menu selection now:");
        String input = in.nextLine();

        while(true){    //Choice
            switch(input){            

                case("1"):  //Formatting a Phone Number
                System.out.println("Enter your 10 digit phone number");
                input = in.nextLine();
                if(input.length() == 10 && input.matches("[0-9]+")) //Check length and all digits
                    System.out.println("(" + input.substring(0, 3) + ")" + input.substring(3,6) + "-" + input.substring(6));
                else
                    System.out.println("Error! Phone numbers should be 10 digits long.");
                break;

                case("2"):  //Formatting a Social Security Number
                System.out.println("Enter your 9 digit SSN");
                input = in.nextLine();
                if(input.length() == 9 && input.matches("[0-9]+"))  //Check length and all digits
                    System.out.println(input.substring(0, 3) + "-" + input.substring(3,5) + "-" + input.substring(5));
                else
                    System.out.println("Error! Phone numbers should be 9 digits long.");
                break;

                case("Q"):  //Exits Program
                System.out.println("Exiting program...Good Bye");
                return;
            }
            System.out.print("Make your menu selection now: ");
            input = in.nextLine();   
        }
    }
}