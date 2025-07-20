public class Var_args {
    static int sum(int ...arr){
        int result = 0;
        for (int a:arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Nothing : " + sum());
        System.out.println("Sum of elements : " + sum(1,2,3,4));
    }
}
