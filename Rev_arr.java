public class Rev_arr {
    public static void main(String[] args) {
        // Hmara array jisse hme reverse krna hai
        int [] arr = {1,2,3,4,5};
        // 'l' define kra hai array length ko
        int l = arr.length;
        // 'n' me hum array ki length ko 2 se divide kre hai
        int n = Math.floorDiv(arr.length, 2);
        // 'temp' is like extra box in which we put our value for swapping
        int temp;

        for (int i=0; i<n ; i++){
            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int element: arr) {
            System.out.println(element + " ");
        }
    }
}
