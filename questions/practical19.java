package questions;

class Animal{
    public void name(){
        System.out.println("Jack");
    }
}
class Dog extends Animal{
    public void color(){
        System.out.println("Dog color is black");
    }
}
class pitbul extends Dog{
    public void p(){
        System.out.println("Breed is Pitbul");
    }
}

public class practical19 {
    public static void main(String[] args) {
        pitbul obj = new pitbul();
        obj.name();
        obj.color();
        obj.p();
    }
}
