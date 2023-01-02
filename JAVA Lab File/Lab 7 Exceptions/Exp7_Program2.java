// 2. Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments). 
// Code by Bhavy Kharbanda
// Sap Id: 500082531

class CommandLineException extends Exception {
    public CommandLineException(String S) {
        super(S);
    }
}

class Exp7_Program2 {
    public static void main(String args[]) throws CommandLineException {
        try {
            int marks = Integer.parseInt(args[0]);
            if (isInt(marks)==false)
            {
                throw new CommandLineException("You have not entered an integer");
            }
            if (marks >= 90)
                System.out.println("Excellent grade");
            else if (marks >= 70 && marks < 90)
                System.out.println("Average grade");
            else
                System.out.println("Try hard next time");
            
        } catch (NumberFormatException Ex) {
            System.out.println(Ex.getMessage());
        }
    }

    private static boolean isInt(int x) {
        return (x % 1 == 0 ? true : false);
        
    }
}
