package questions;

class parent_class{
    public void print(){
        System.out.println("This is a parent class");
    }
}
class child extends parent_class{
    public void print1(){
        System.out.println("This is a child class");
    }
}

public class practical14 {
    public static void main(String[] args) {
        parent_class obj = new parent_class();
        child obj1 = new child();
        
        obj.print();
        obj1.print1();
        obj1.print();
        
    }
}
