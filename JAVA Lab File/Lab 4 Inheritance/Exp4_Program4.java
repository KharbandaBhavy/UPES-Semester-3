// 4.Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration and the type of the call. 
// Write a program using the concept of polymorphism in Java to calculate the charges.

// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.*;

class Calls {
    int dur;
    String type;

    int rate() 
    //Rates for urgent call is 5 per minute, lightning is 3 per minute, and ordinary is 1 per minute.
    {
        if (type.equals("urgent"))
            return 5;
        else if (type.equals("lightning"))
            return 3;
        else
            return 1;
    }
}

class Bill extends Calls {
    int amount;

    void read() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Choose the Call Type (urgent/lightning/ordinary): ");
        type = input.next();
        System.out.print(" Enter Call duration(minutes): ");
        dur = input.nextInt();
        input.close();
    }

    void calc() {
        if (dur <= 1) {
            amount = rate() * dur;
        } else if (dur <= 5) {
            amount = rate() * dur + 5;
        } else {
            amount = rate() * dur + 7;
        }
    }

    void display() {
        System.out.println(" Call Type : " + type);
        System.out.println(" Duration : " + dur + " min.");
        System.out.println(" Charge: Rs. " + amount);
    }
}

class Exp4_Program4 {
    public static void main(String arg[]) {
        Bill b = new Bill();
        b.read();
        b.calc();
        b.display();
    }
}


