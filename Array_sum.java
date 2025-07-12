public class Array_sum {
    public static void main(String[] args) {
        float [] marks = {20.23f,26.15f,56.7f,31.4f,45.98f};
        float sum = 0.00f;
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println("Sum of numbers are : " + sum);
    }
}
