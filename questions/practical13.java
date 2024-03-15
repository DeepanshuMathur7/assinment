package questions;

class functionOverloading{
    public void a(){
        System.out.println("Without Parameters");
    }
    public void a(int n){
        System.out.println("With Parameters :"+ n);
    }
}

public class practical13 {
    public static void main(String[] args) {
        functionOverloading b = new functionOverloading();
        b.a(5);
        b.a();
    }
}
