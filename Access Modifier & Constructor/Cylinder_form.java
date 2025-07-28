package Access_modifiers_Comstructor;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Cylinder_form {
    public static void main(String[] args) {
        Cylinder mayank = new Cylinder();
        mayank.setHeight(4);
        System.out.println("Height of CYLINDER is " + mayank.getHeight());
        mayank.setRadius(9);
        System.out.println("Radius of CYLINDER is " + mayank.getRadius() );
    }
}
