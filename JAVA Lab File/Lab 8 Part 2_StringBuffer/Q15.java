// 15.	Word wise reverse of the string. In above case boy good a is Ram.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Q15 {
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
        String result = str7 + " " + str6 + " " + str4 + " " + str2 + " " + str;
        
        System.out.println("\nInput string is:  "+Strb);
        System.out.println("Final string is:  "+result);
    }
}
