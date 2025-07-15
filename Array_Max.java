public class Array_Max {
    public static void main(String[] args) {
        int [] arr = {1,2,455,4,5};
        int max = Integer.MIN_VALUE;
        for (int e:arr) {
            if (e>max) {
                max = e;
            }
        }
        System.out.println("The max value in array is : " + max);
    }
}
