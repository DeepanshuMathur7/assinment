package questions;

public class practical17 {

    static int demo = 4;
    // static block
    static{
        System.out.println("This is a block");
    }
    // static method
    static void Smethod(){
        System.out.println("This is a method");
    }
    public static void main(String[] args) {
        System.out.println("This is a variable "+demo);
        Smethod();
    }
}
