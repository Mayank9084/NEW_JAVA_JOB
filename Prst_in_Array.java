import java.util.Scanner;
public class Prst_in_Array {
    public static void main(String[] args) {
        System.out.print("Enter number you want to check : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] value = {10,56,96,78,85};
        boolean isInArray = false;
        for (int elements:value) {
            if(num==elements){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Number is present in Array : " + num);
        }
        else {
            System.out.println("Number is not present in Array : " + num);
        }
    }
}
