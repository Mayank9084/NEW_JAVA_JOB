public class Array_Sorted {
    public static void main(String[] args) {
        boolean isSroted = true;
        int [] arr = {1,2,3,4,5,6};
        for (int i=0; i < arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSroted = false;
                break;
            }
        }
        if (isSroted){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not Sorted");
        }
    }
}
