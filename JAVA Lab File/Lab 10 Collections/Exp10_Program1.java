// 1. Write a program for the following. Read all elements from ArrayList by using Iterator. Create duplicate object of an ArrayList instance.
// Reverse ArrayList content.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.*;

public class Exp10_Program1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Bhavy");
        list.add("Desh");
        list.add("Divyam");
        list.add("Bharat");
        Iterator IT = list.iterator();
        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
        ArrayList<String> temp = new ArrayList<String>();
        temp = (ArrayList<String>) list.clone();
        System.out.println("\nDuplicate Array List Instance:" + temp);
        Collections.reverse(list);
        System.out.println("\nReversed Array List:" + list);
    }
}


