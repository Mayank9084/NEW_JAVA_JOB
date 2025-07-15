public class Array_Min {
    public static void main(String[] args) {
        int [] arr = { 1,89,63,-852,954};
        int min = Integer.MAX_VALUE;
        for (int e:arr) {
            if(e<min){
                min = e;
            }
        }
        System.out.println("The minimum value : " + min);
    }
}
