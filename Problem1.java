/*
 * Edmunds GovTech Problem1
 * Last update: 03/02/20
 * @author: Connor Keenan
 * @version: 2020.03.02
 */
import java.util.*;
public class Problem1
{
    public static void main(String[ ] args){
        HashMap<String, Integer> ids = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        String input;
        String idNum;    //Starting id, for key without previous
        while(true)
        {
            System.out.println("Enter name to be converted into unique id.");
            input = (in.nextLine().substring(0,3).toUpperCase()); 
            idNum = "005";
            if(input.equals("QQQ")) //Quit and print the map
                System.out.println(ids);
            else if(!ids.containsKey(input)){   //First of its key
                System.out.println(input + idNum);   //3 letters, uppercase and 000
                ids.put(input, 1);  //Stores first three letters for key, 1*5 = 005       
            }
            else if(ids.containsKey(input)){    //Not the first of its key
                int temp = ids.get(input) + 1;  //Returns value for key + 1            
                System.out.println("temp: " + temp);
                idNum = idNum.format("%03d", 5*temp);   //Turns value into multiple of 5, formatted 005
                if(Integer.parseInt(idNum) > 995){      //Cannot have id postfix exced
                    System.out.println("id postfix digit limit exceded, please choose available id name.");
                    break;
                }
                System.out.println("idNum: " + idNum);
                System.out.println(input + idNum);   //3 letters, uppercase and 000

                ids.replace(input, temp);   //Replaces value of key
            }
        }

    }
}