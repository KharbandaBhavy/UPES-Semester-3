// 3. Write a program for the following HashSet, copy another collection object to HashSet object, delete all entries at one call from HashSet.
// Search user defined objects from HashSet
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.*;
import java.util.Scanner;

public class Exp10_Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        HashSet<String> H1 = new HashSet<String>();                                 //Creating a HashSet
        H1.add("Bhavy");
        System.out.println("\nHashSet before adding another object: " + H1);

        HashSet<String> H2 = new HashSet<String>();                                 //Creating another Hashset
        H2.add("Kharbanda");

        H2.addAll(H1);                                                              //Adding H2 to H1
        System.out.println("\nNew Hashset after Addition: " + H2);
 
        H1.clear();                                                                 //For clearing the Hashset
        System.out.println("\nOriginal HashSet after deletion:" + H1);              

        System.out.println("\nEnter the string to search in Hashset : ");
        str = input.nextLine();
        input.close();
        System.out.println("Hashset contains this string- '"+str+"' :"+H2.contains(str));
    }
}


