import java.util.Scanner;
    class Employee {
        int id;
        int salary;
        String name;
        public void print_details() {
            System.out.println("Your id is : " + id);
            System.out.println("Your name is : " + name);
        }
        public int get_salary(){
            return salary;
        }
    }
public class Class_with_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee mayank = new Employee();
        mayank.salary = 20;
        System.out.print("Enter your ID ");
        mayank.id = sc.nextInt();
        System.out.print("Enter Employee Name : ");
        mayank.name = sc.next();
        int salary = mayank.salary;
        System.out.println(salary);
        System.out.println("----------X----------X----------");
        mayank.print_details();
    }
}
