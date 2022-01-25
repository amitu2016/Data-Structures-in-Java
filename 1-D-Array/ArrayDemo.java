public class ArrayDemo{
    
    public static void main(String[] args) {
        int[] arr = null;

        //System.out.println(arr);

        arr = new int[5];
       
        System.out.println(arr);

        // Assigning values to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // Retrieving using enhanced for loop
        for (int i : arr) {
            System.out.println(i);
        }



    }
}