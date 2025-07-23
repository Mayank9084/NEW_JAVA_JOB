import java.util.Scanner;
class Average_use_argument{
    static int avg ( int ...arr){
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return (result / arr.length);
    }
    public static void main (String[]args){
        int c = avg(1,2,3,4,5);
        System.out.print("The avg of nos passed as arguments are " + c);
    }
}
