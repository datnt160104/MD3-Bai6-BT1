package rikkei.academy;

public class Main {
    public static void main(String[] args) {
     Circle cr =new Circle();
        System.out.println(cr);
        cr =new Circle(3.5,"black");
        System.out.println(cr);


     Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3.5,"blue",2);
        System.out.println(cylinder);
    }
}
