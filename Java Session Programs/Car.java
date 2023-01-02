public class Car {
    //Object can be almost everything, look around you, your computer, keys, book, car
    //are all objects. Each object might have a state and behavior
    //For example computer state might be his amount of cpus, os, ram and behavior, shut off, turn on
    //In oop each object will have state in form of fields and expose behavior in form of methods
    //Class is a template (blueprint) for creating object

    //Classes naming convention is to capitalize the first letter of each word in the name
    //For example FlyingCenterSystem
    //Classes usually will be public meaning they
    //are allowed to be accessed from anywhere in our code
    //private means that no other class can enter this class

    //member variables or fields are simply variables that declared inside a class
    //unlike the local variables that declared inside methods those variables can be accessed
    //by different classes and be used inside methods
    //In order to define a field we need first an access modifier that works the same way as
    //class access modifier and this will determine who allowed to access this field
    //usually field will be private unlike class (encapsulation) we are hiding the fields
    //from being accessed from anywhere in the code
    private int wheels;
    //private int creationYear;
    private String type;
    //private String color;
    //private boolean isFirstHand;

    //Setters

    public void setType(String type) {
        this.type=type;
    }

    //We can define restrictions inside the setters and validate the values before setting them
    public void setWheels(int wheels) {
        if(wheels>=4)
            this.wheels = wheels;
    }

    //Getters

    public String getType(){
        return this.type;
    }

    public int getWheels(){
        return this.wheels;
    }
}
