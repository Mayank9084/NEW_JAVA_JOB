package Error_Exception;
import java.util.Scanner;
class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius can not be NEGATIVE or less than 0";
    }
    public String getMessage(){
        return "Radius can not be NEGATIVE or less than 0";
    }
}
public class Throw_Throws_Exceptions {
    public static double area(float r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{

        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Quotient : ");
        int x = sc.nextInt();
        System.out.print("Enter Dividend : ");
        int y = sc.nextInt();
        try{
            int c = divide(x, y);
            System.out.println("Answer is : " + c);
        }
        catch (Exception e){
            System.out.println("Exception is : " + e);
        }
        System.out.print("Enter Radius : ");
        float z = sc.nextFloat();
        try{
            double ar = area(z);
            System.out.println("Area of Circle is : " + ar);
        }
        catch (Exception e){
            System.out.println("Exception" + e);
        }
    }
}
