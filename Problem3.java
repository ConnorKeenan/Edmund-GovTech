/*
 * Edmunds GovTech Problem3
 * Last update: 03/02/20
 * @author: Connor Keenan
 * @version: 2020.03.02
 */
import java.util.*;
public class Problem3{
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
                System.out.println("Enter 10 digits");
                input = in.nextLine();
                if(isPhoneNumber(input))
                    System.out.println(formatPhoneNumber(input));
                else
                    System.out.println("Error! Phone numbers should be 10 digits long.");
                break;

                case("2"):  //Formatting a Social Security Number
                System.out.println("Enter 9 digits");
                input = in.nextLine();
                if(isSSNumber(input))
                    System.out.println(formatSSNumber(input));
                else
                    System.out.println("Error! Phone numbers should be 9 digits long.");
                break;

                case("Q"):  //Exit Program
                System.out.println("Exiting program...Good Bye");
                return;
            }
            System.out.print("Make your menu selection now: ");
            input = in.nextLine();   
        }
    }

    public static boolean isPhoneNumber(String num)
    {
        if(num.length() == 10 && isStringOnlyDigits(num))  //Check length and all digits
            return true;
        else
            return false;
    }

    public static String formatPhoneNumber(String phoneNum)
    {
        return "(" + phoneNum.substring(0, 3) + ")" + phoneNum.substring(3,6) + "-" + phoneNum.substring(6);
    }

    public static boolean isSSNumber(String num)
    {
        if(num.length() == 9 && isStringOnlyDigits(num))  //Check length and all digits
            return true;
        else
            return false;
    }

    public static String formatSSNumber(String sSNum)
    {
        return sSNum.substring(0, 3) + "-" + sSNum.substring(3,5) + "-" + sSNum.substring(5);
    }

    public static boolean isStringOnlyDigits(String num)
    {
        if(num.matches("[0-9]+"))   
            return true;
        else
            return false;
    }
}

