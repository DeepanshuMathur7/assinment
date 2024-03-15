package questions;

class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id = 4;
        name = "Piyush";
    }
    public MyEmployee(String myname,int myid){
        name = myname;
        id = myid;
    }
    public String getname(){
        return name;
    }
    public int id(){
        return id;
    }
}

public class practical12 {
    public static void main(String[] args) {
        MyEmployee object = new MyEmployee("Deepanshu",5);

        System.out.println(object.getname());
        System.out.println(object.id());
    }
}
