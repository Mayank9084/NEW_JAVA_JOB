package Error_Exception;

public class Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("Failed to divide , Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
