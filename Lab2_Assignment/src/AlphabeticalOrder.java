
/*
 * author : Amrutha R
 * Desc : Alphabetical Order
 * Date : 23/10/2020
 */
import java.util.*;
public class AlphabeticalOrder {

	public static void main(String[] args) {
        int number;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings : ");
        number = sc.nextInt();   
        s.close();
        String strings[] = new String[number];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < number ; i++)
        {
        	strings[i] = s.nextLine();
        }
        for (int i = 0; i < number; i++) 
        {
            //sort the string in alphabetical order
            for (int j = i + 1; j < number; j++) { 
                if (strings[i] != strings[j]) 
                {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        System.out.println("Strings in Sorted Order:");
        for (int i = 0; i < number ; i++) 
        {
            System.out.println(strings[i] + ", ");
        }
    }
}
