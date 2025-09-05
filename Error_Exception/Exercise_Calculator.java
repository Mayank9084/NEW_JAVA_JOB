package Error_Exception;
import java.util.Scanner;
//Exercise 6: You have to create a custom calculator with following operations:
//        1. + -> Addition
//        2. - -> Subtraction
//        3. * -> Multiplication
//        4. / -> Division
//        which throws the following exceptions:
//        1. Invalid input Exception ex: 8 & 9
//        2. Cannot divide by 0 Exception
//        3. Max Input Exception if any of the inputs is greater than 100000
//        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
class InvalidInputException extends Exception{
    public String toString(){
        return "You give INVALID INPUT";
    }
    public String getMessage(){
        return "Check INPUT";
    }
}
class CanNotDivideByZero extends Exception{
    public String toString(){
        return "Can not DIVIDE by ZERO 0 ";
    }
    public String getMessage(){
        return "Can not DIVIDE by ZERO 0 ";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input cant be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "Input cant be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply(double a, double b)throws MaxInputException, MaxMultiplyInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CanNotDivideByZero, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CanNotDivideByZero();
        }
        return a / b;
    }
}
public class Exercise_Calculator {
    public static int sum(double a, double b) throws InvalidInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return (int) (a+b);
    }
    public static double div(double a, double b) throws CanNotDivideByZero{
        if(a==0 || b==0) throw new CanNotDivideByZero();
        return  a/b;
    }
    public static void main(String[] args) throws InvalidInputException, CanNotDivideByZero, MaxInputException, MaxMultiplyInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value A : ");
        double x = sc.nextDouble();
        System.out.print("Enter value b : ");
        double y = sc.nextDouble();
        CustomCalculator c = new CustomCalculator();
        try {
            System.out.println("Addition: " + c.add(x, y));
            System.out.println("Subtraction: " + c.subtract(x, y));
            System.out.println("Multiplication: " + c.multiply(x, y));
            System.out.println("Division: " + c.divide(x, y));
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

    }
}
