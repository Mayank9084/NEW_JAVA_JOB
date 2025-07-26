import java.util.Scanner;

class circle{
    private float pi = 3.14159f;
    private float r,area,circum,diam;
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Radius of CIRCLE : ");
        r = sc.nextFloat();
    }
    public float get_detail(){
        return r;
    }
    public void set_area(){
       area = pi*r*r;
    }
    public float get_area(){
        System.out.print("The area of CIRCLE is : " );
        return area;
    }
    public void set_Circum(){
        circum = 2*pi*r;
    }
    public float get_Circum(){
        System.out.print("The circumference of CIRCLE is : " );
        return circum;
    }
    public void set_Diam(){
        diam = 2*r;
    }
    public float get_Diam(){
        System.out.print("The Diameter of CIRCLE is : " );
        return diam;
    }
}
public class Access_modifiers {
    public static void main(String[] args) {
       circle mayank = new circle();
       mayank.set_details();
       mayank.set_area();
        System.out.println(mayank.get_area());
        mayank.set_Circum();
        System.out.println(mayank.get_Circum());
        mayank.set_Diam();
        System.out.println(mayank.get_Diam());
    }
}
