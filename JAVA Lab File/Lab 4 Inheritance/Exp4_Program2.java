// 2.Write a program in Java to create a Player class. 
// Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player class. 
// Code by Bhavy Kharbanda
// Sap Id: 500082531

class Player {
    String name;

    Player(String n) {
        name = n;
    }

    public void display() {
        System.out.println(" Player name: " + name);
    }
}

class Cricket_Player extends Player {
    String type;

    Cricket_Player(String n, String t) {
        super(n);
        type = t;
    }

    public void display() {
        super.display();
        System.out.println(" Player type: " + type);
    }
}

class Football_Player extends Player {
    String type;

    Football_Player(String n, String t) {
        super(n);
        type = t;
    }

    public void display() {
        super.display();
        System.out.println(" Player type: " + type);
    }
}

class Hockey_Player extends Player {
    String type;

    Hockey_Player(String n, String t) {
        super(n);
        type = t;
    }

    public void display() {
        super.display();
        System.out.println(" Player type: " + type);
    }
}

class Exp4_Program2 {
    public static void main(String args[]) {
        Cricket_Player c = new Cricket_Player("Rahul", "Cricket");
        Football_Player f = new Football_Player("Ronaldo", "Football");
        Hockey_Player h = new Hockey_Player("Hardeep", "Hockey");
        c.display();
        f.display();
        h.display();
    }
}
