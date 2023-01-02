// 16.	Reverse each word. In above case output is maR si a doog yob.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Q16 {
    public static void main(String[] args) {
        StringBuffer B1 = new StringBuffer("Ram is a good boy");
        System.out.println("Input String is: "+B1);
        StringBuffer B2 = new StringBuffer();
        B2 = B1.reverse();
        int first = B2.indexOf(" ");
        String str = B2.substring(0, first);
        String str1 = B2.substring(first + 1);
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
        System.out.println("Final String is: "+result);
    }
}
