package Inheritance_pract_set;
class Rectangle{
        public int width,height;
        Rectangle(int w,int h){
            this.height = h;
            this.width = w;
        }
        public double area(){
        return this.width *this.height;
    }
        static class Cuboid extends Rectangle{
            public int length;
            Cuboid(int l,int w,int h){
                super( w, h);
                this.length = l;
            }
            public double tsArea(){
                int i = this.length * this.width + this.width * this.height + this.height * this.length;
                int a = 2;
                return i*a;
            }
    }
    }

public class Rect_inherit_cuboid {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(15, 16);
        System.out.println(obj.area());
        Rectangle.Cuboid ar = new Rectangle.Cuboid(6,4,8);
        System.out.println(ar.tsArea());
    }
}
