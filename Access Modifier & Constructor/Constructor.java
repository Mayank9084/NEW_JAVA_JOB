package Access_modifiers_Comstructor;
import java.util.Scanner;
class MyEmployee{
    private int id;
    private String name;
    public MyEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name : ");
        name = sc.nextLine();
        System.out.print("Enter employee ID : ");
        id = sc.nextInt();
    }
    public String getName(){
        System.out.print("Your Name is : ");
        return name;
    }
    public  void setName(String n1){
        name = n1;
    }
    public int getId(){
        System.out.print("Your ID is : ");
        return id;
    }
    public  void setId(int n2){
        id = n2;
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee mayank = new MyEmployee();
       // mayank.setName("mayank");
       // mayank.setId(15);
        System.out.println(mayank.getName());
        System.out.println(mayank.getId());
    }
}
