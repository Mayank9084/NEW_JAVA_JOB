package calc;

class Calculator{
    public void calculator(int a , int b){
        System.out.println("Result is " + a+b);
    }
}

class ScClalculator{
    public void ScCalculator(int a , int b){
        System.out.println("Result is " + Math.sin(a+b));
    }
}

class MyClalculator{
    public void MyCalculator(int a , int b){
        System.out.println("Result is " + a+b);
        System.out.println("Result is " + Math.sin(a+b));
    }
}

public class Quest_1{
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}