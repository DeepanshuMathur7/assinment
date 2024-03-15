package questions;

abstract class Shape{
    abstract void rectanglearea(int length, int breadth);
    abstract void squreearea(int side);
    abstract void circlearea(int radius); 
}
class Area{
    public int rectanglearea(int length, int breadth){
        return length*breadth;
    }
    public int squreearea(int side){
        return side*side;
    }
    public int circlearea(int radius){
        return (int) (2*Math.PI*radius);
    }
}

public class practical16 {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println(obj.rectanglearea(5, 5));
        System.out.println(obj.squreearea(6));
        System.out.println(obj.circlearea(2));
    }
}
