class MyCustomException extends Exception {
    public MyCustomException(String S) {
        super(S);
    }
}

public class Program2_new {
    public static void main(String[] args) {
        try {char t=args[1].charAt(0);
            if(!(Character.isDigit(t)))
                throw new MyCustomException(" Not an Integer");
            }
         catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}