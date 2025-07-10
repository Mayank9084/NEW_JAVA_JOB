public class Array_syntax{
    public static  void main (String[] args) {
        /* we can write arrays in 3 ways which are :

           1. Declaration then memory allocation.
                int[] = marks; Declaration
                marks = new int[5]; memory allocation

           2. Declaration + memory allocation.
                int[] marks = new int[5];

           3. Declaration + initialization.
                int[] marks = {1,2,3,4,5};
         */

        // Array Traversal using for loop
        int[] marks = {1,2,3,4,5};
        for (int i=0; i< marks.length ;i++){
            System.out.println(marks[i]);
        }

        /*
        // Array reverse using for loop
        int[] marks = {1,2,3,4,5};
        for (int i= marks.length-1; i>=0 ;i--){
            System.out.println(marks[i]);
        }
         */

        /*
        // Displaying Array using for-each Loop
        int[] marks = {1,2,3,4,5};
          for (int element : marks){
                System.out.println(element);
          }
         */
    }
}