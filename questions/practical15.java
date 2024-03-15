package questions;

class Pclass{
    public void pmethod(){
        System.out.println("This is a parent class");
    }
}
class Cclass extends Pclass{
    public void cmethod(){
        System.out.println("This is a child class");
    }
}

public class practical15 {
    public static void main(String[] args) {
        Pclass m = new Pclass();
        Cclass n = new Cclass();

        m.pmethod();
        n.cmethod();
        n.pmethod();
    }
}
