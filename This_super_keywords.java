//  this keyword eliminates the confusion between
//  the parameters and the class attributes with the same name. Take a look at the example given below :
class This{
    int x;
    public int getX() {
        return x;
    }
    // Constructor with a parameter
    This(int x){
        // if we don't use "this" keyword then the expected output is
        // 65 because we've passed x=65 to the constructor of the cwh class.
        // But the compiler fails to differentiate between the parameter 'x' & class attribute 'x.'
        // Therefore, it returns 0.
        this.x = x;
    }
}
public class This_super_keywords {
    public static void main(String[] args) {
        This A = new This(5);
        System.out.println(A.getX());
    }
}
