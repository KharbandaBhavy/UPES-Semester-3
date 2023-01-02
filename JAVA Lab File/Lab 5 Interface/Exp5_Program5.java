// 5.Write program to create an interface StackInterface having methods push (), pop () and display (). StackClass implements StackInterface. 
// Class StackClass contains the main method which is having a switch case for selecting the particular operation of the stack.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.util.Scanner;

interface StackInterface {
    void push(int element);
    void pop();
    void display();
}

class Stack implements StackInterface {
    private int size = 10;
    private int top = -1;
    private int[] stack = new int[size]; 

    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack is Overflow!");
            return;
        } else {
            top++;
            stack[top] = element;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Underflow!");
            return;
        } else {
            System.out.println("Element is popped from stack: " + stack[top]);
            top--;
        }
    }

    public void display() {
        if (top == - 1) {
            System.out.println("Stack is Empty!");
            return;
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.printf("%d: %d\n", i, stack[i]);
            }
        }
    }
}

public class Exp5_Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack S = new Stack();
        int choice;

        for (;;) {
            System.out.println("\n\n***** MENU *****\n");
            System.out.println("1. Push an element to the Stack");
            System.out.println("2. Pop an element from the Stack");
            System.out.println("3. Display all elements of the Stack");
            System.out.println("4. Exit\n");
            System.out.println("Enter your choice : ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int pushElt = input.nextInt();
                    S.push(pushElt);
                    break;
                
                case 2:
                    S.pop();
                    break;

                case 3:
                    System.out.println("Displaying stack:\n");
                    S.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice, Try Again......");
            }
        }
    }
}