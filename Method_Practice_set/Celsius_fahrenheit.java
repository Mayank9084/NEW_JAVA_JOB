import java.util.Scanner;
class Celsius_fahrenheit{
    static float celsius (float n){
        return (n*((float) 9 /5))+32;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in celsius : ");
        float x = sc.nextFloat();
        System.out.println("Temperature in Fahrenheit : " + celsius(x));
    }
}

