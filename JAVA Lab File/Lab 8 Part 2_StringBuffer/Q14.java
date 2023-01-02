// 14. Replace first letter of every word by x. In above case xam xs x xood xoy.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

public class Q14 {
    public static void main(String[] args) {
        StringBuffer Strb= new StringBuffer("Ram is a good boy");
        int first=Strb.indexOf(" ");
        String str=Strb.substring(0,first);
        String str1=Strb.substring(first+1);   
        int second=str1.indexOf(" ");      
        String str2=str1.substring(0,second);     
        String str3=str1.substring(second+1); 
        int third=str3.indexOf(" ");
        String str4=str3.substring(0,third);
        String str5=str3.substring(third+1);
        int fourth=str5.indexOf(" ");
        String str6=str5.substring(0,fourth);
        String str7=str5.substring(fourth+1);

        char r1=str.charAt(0);
        String s1=Character.toString(r1);
        String temp1 = str.replaceAll(s1,"x");

        char r2=str2.charAt(0);
        String s2= Character.toString(r2);
        String temp2=str2.replaceAll(s2,"x");

        char r3=str4.charAt(0);
        String s3=Character.toString(r3);
        String temp3=str4.replaceAll(s3,"x");

        char r4= str6.charAt(0);
        String s4=Character.toString(r4);
        String temp4=str6.replaceAll(s4,"x");

        char r5=str7.charAt(0);
        String s5=Character.toString(r5);
        String temp5=str7.replaceAll(s5,"x");

        System.out.println("\nInput string is: "+Strb);
        System.out.println("Final output string is: "+temp1+" "+temp2+ " "+temp3+ " "+temp4+" "+temp5);
    }
}
