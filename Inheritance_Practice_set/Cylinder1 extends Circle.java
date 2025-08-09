package Inheritance_pract_set;
class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Circle_in_Cylinder {
    public static void main(String[] args) {
        Circle obj = new Circle(4);
        System.out.println(obj.area());
        Cylinder1 objC = new Cylinder1(6,4);
        System.out.println(objC.volume());
    }
}
