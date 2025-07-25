class Employee_1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
    public class Employee_2 {
        public static void main(String[] args) {
        Employee_1 mayank = new Employee_1();
        mayank.setName("MAYANK");
        mayank.salary = 233;
            System.out.println(mayank.getSalary());
            System.out.println(mayank.getName());
        }
}
