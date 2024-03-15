package questions;

class Rectangle{
    private double lenght;
    private double breadth;

    public Rectangle(double lenght,double breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    public double area(){
        return lenght * breadth;
    }
}

public class practical11 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);
        
        double area1 = rect1.area();
        double area2 = rect2.area();

        System.out.println("Area of (4,5): "+ area1);
        System.out.println("Area of (5,8): "+ area2);

    }
}
