package questions;

public class practical18 {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer buffer = new StringBuffer("Hello");

        // Appending text to the buffer
        buffer.append(" World");

        // Displaying the buffer content
        System.out.println("Buffer after appending: " + buffer);

        // Inserting text at a specific position
        buffer.insert(5, "Java ");

        // Displaying the buffer content after insertion
        System.out.println("Buffer after insertion: " + buffer);

        // Deleting characters from the buffer
        buffer.delete(5, 10);

        // Displaying the buffer content after deletion
        System.out.println("Buffer after deletion: " + buffer);

        // Reversing the content of the buffer
        buffer.reverse();

        // Displaying the buffer content after reversal
        System.out.println("Buffer after reversal: " + buffer);

        // Obtaining the length of the buffer
        int length = buffer.length();
        System.out.println("Length of the buffer: " + length);

        // Deleting all content from the buffer
        buffer.delete(0, buffer.length());

        // Checking if the buffer is empty
        boolean isEmpty = buffer.length() == 0;
        System.out.println("Is buffer empty? " + isEmpty);
    }
}
