public class Method_Refrece_object_differ {
    static void change(int[] arr) {
        arr[0]=56;
    }
    static void tellMeJoke(){
        System.out.println("Chin tapak dum dum");
    }
    public static void main(String[] args) {
        tellMeJoke();
        int [] arr1 = {1,2,3,4,5};
        change(arr1);
        System.out.println("the value after changing is : " + arr1[0]);
    }
}
