package questions;

class MyInteger {
    private int value;

    // Constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    // Setter method
    public void setValue(int value) {
        this.value = value;
    }

    // Method to increment value by 1
    public void increment() {
        value++;
    }
}

public class practical20 {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(10);

        // Displaying the initial value
        System.out.println("Initial value: " + num.getValue());

        // Incrementing the value
        num.increment();

        // Displaying the incremented value
        System.out.println("Value after increment: " + num.getValue());

        // Setting a new value
        num.setValue(20);

        // Displaying the new value
        System.out.println("New value: " + num.getValue());
    }
}
