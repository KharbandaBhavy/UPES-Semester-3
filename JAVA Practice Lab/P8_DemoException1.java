public class P8_DemoException1 {
    public static void main(String[] args) {
        int a = 25, b = 4, c = 0, d = 3, e;
        e = a / b;
        System.out.println(e);
        try {
            e = a / c;
            System.out.println(e);
            System.out.println("Exception");

        } catch (Exception E) {
            System.out.println("Execution Continues");
        }
        e=a/d;System.out.println(e);
        System.out.println("Hari");
    }
}
