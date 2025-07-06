import java.util.Scanner;
public class Income_tax_calculator {
    public static void main(String[] args) {
        float income,tax = 0;
        System.out.print("Enter your per annum Income : ");
        Scanner sc = new Scanner(System.in);
        income = sc.nextFloat();
        System.out.println(income);
        if (income <= 250000){
            tax = tax + 0;
            System.out.println("There is no tax below 2.5LPA : " + tax);
        } else if (income > 250000 && income <= 500000)
        {
            tax = tax + (income - 250000)*5/100;
            System.out.println("You should pay 5% Tax of your income : " + tax);
        } else if (income > 500000 && income <= 1000000) {
            tax = tax + (float) ((500000 - 250000) * 5) /100;
            tax = tax + (income - 500000)*2/100;
            System.out.println("You should pay 20% Tax of your income : " + tax);
        } else if (income > 1000000) {
             tax = tax + (float) ((500000 - 250000) * 5) /100;
             tax = tax + (float) ((1000000 - 500000) * 2) /100;
             tax = tax + (income - 1000000)*3/100;
            System.out.println("You should pay 30% Tax of your income : " + tax);
        }
    }
}
