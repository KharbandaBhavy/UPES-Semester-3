// 13. Find first letter of every word.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Q13 {
    public static void main(String[] args) {
        StringBuffer Strb = new StringBuffer("Ram is a good boy");
        int first = Strb.indexOf(" ");
        String str = Strb.substring(0, first);
        String str1 = Strb.substring(first + 1);
        int second = str1.indexOf(" ");
        String str2 = str1.substring(0, second);
        String str3 = str1.substring(second + 1);
        int third = str3.indexOf(" ");
        String str4 = str3.substring(0, third);
        String str5 = str3.substring(third + 1);
        int fourth = str5.indexOf(" ");
        String str6 = str5.substring(0, fourth);
        String str7 = str5.substring(fourth + 1);

        System.out.println("First letter of " + str + " is: " + str.charAt(0));
        System.out.println("First letter of " + str2 + " is: " + str2.charAt(0));
        System.out.println("First letter of " + str4 + " is: " + str4.charAt(0));
        System.out.println("First letter of " + str6 + " is: " + str6.charAt(0));
        System.out.println("First letter of " + str7 + " is: " + str7.charAt(0));
    }
}
