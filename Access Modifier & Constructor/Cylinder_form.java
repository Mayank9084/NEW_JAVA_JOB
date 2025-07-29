package Access_modifiers_Comstructor;

import java.util.Scanner;

class Cylinder{
    private float radius;
    private float height;
    private float pie = 3.14159f;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float surfaceArea(){
        return  2*pie*radius*radius + 2*pie*radius*height;
    }
    public float volume(){
        return  pie*radius*radius*height;
    }
}
public class Cylinder_form {
    public static void main(String[] args) {
        Cylinder mayank = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Cylinder : ");
        mayank.setHeight(sc.nextFloat());
        System.out.print("Height of CYLINDER is " + mayank.getHeight());
        System.out.print("\nEnter Radius of Cylinder : ");
        mayank.setRadius(sc.nextFloat());
        System.out.print("Radius of CYLINDER is " + mayank.getRadius() );
        System.out.println("\nSurface Area = " + mayank.surfaceArea());
        System.out.println("\nVolume = " + mayank.volume());
    }
}
