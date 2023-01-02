// 2. Write a program for the following HashMap. Find whether specified key exists or not, find whether specified value exists or not.
// get all keys from the given HashMap, get all key-value pair as Entry objects.

// Code by Bhavy Kharbanda
// Sap Id: 500082531
import java.util.*;
import java.util.Scanner;
public class Exp10_Program2 {
    public static void main(String[] args) {
        int key1, key2;
        String Value1, Value2;
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> H = new HashMap<Integer, String>();
        H.put(1,"Bhavy");
        H.put(2,"Desh");
        H.put(3,"Divyam");
        H.put(4,"Bharat");

        System.out.println("\nEnter the key to check if it exists: ");     //For checking if the keys exist
        key1 = input.nextInt();
        System.out.println("Enter another key to check if it exists: ");
        key2 = input.nextInt();

        boolean B1 = H.containsKey(key1);
        System.out.println(key1+" exists in HashMap? : " + B1);     //result 
        boolean B2 = H.containsKey(key2);
        System.out.println(key2+" exists in HashMap? : " + B2);
        
        System.out.println("\nEnter the string to check if it exists: ");     //For checking if the values exist
        Value1 = input.next();
        System.out.println("Enter another string to check if it exists: ");
        Value2 = input.next();
        input.close();

        boolean B3 = H.containsValue(Value1);
        System.out.println(Value1+ " exists in HashMap? : " + B3);     //result
        boolean B4 = H.containsValue(Value2);
        System.out.println(Value2+" exists in HashMap? : " + B4);

        System.out.println("\nKey Set Declared: "+H.keySet());
        System.out.println("Entry Set Declared: "+H.entrySet());
    }
}

