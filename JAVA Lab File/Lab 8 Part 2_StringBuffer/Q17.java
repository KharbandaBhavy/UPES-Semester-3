// 17.	Interchange first two words. In above case is Ram a good boy.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Q17 {
    public static void main(String[] args) {
        StringBuffer StrB = new StringBuffer("Ram is a good boy");
        System.out.println("Input String is: "+StrB);
        int first = StrB.indexOf(" ");
        String str = StrB.substring(0, first);
        String str1 = StrB.substring(first + 1);
        int second = str1.indexOf(" ");
        String str2 = str1.substring(0, second);
        String str3 = str1.substring(second + 1);
        int third = str3.indexOf(" ");
        String str4 = str3.substring(0, third);
        String str5 = str3.substring(third + 1);
        int fourth = str5.indexOf(" ");
        String str6 = str5.substring(0, fourth);
        String str7 = str5.substring(fourth + 1);

        String result = str2 + " " + str + " " + str4 + " " + str6 + " " + str7;
        System.out.println("Final String is: "+result);
    }
}
