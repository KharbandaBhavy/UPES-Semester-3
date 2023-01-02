// 12.	Find first letter of last word. Input is Ram is a good boy, Output: b.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Q12 {
    public static void main(String[] args) {
        StringBuffer Strb = new StringBuffer("Ram is a good boy");
        int first = Strb.indexOf(" "); 
        String str1 = Strb.substring(first + 1);

        int second = str1.indexOf(" ");
        String str2 = str1.substring(second + 1);

        int third = str2.indexOf(" ");
        String str3 = str2.substring(third + 1);

        int fourth = str3.indexOf(" ");  
        String str4 = str3.substring(fourth + 1);
        System.out.println("\nInput string is:  " + Strb);
        System.out.println("First letter of last word is: " + str4.charAt(0)); 
    }
}
