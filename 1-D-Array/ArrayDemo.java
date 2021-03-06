public class ArrayDemo{
    
    public static void main(String[] args) {
        int[] arr = null;

        //System.out.println(arr);

        arr = new int[5];
       
        System.out.println(arr);

        // Assigning values to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+10;
        }

        // Retrieving using enhanced for loop
        for (int i : arr) {
            System.out.println(i);
        }

        int i = 0 , j = 2;

        System.out.println(arr[i] + " " + arr[j]);

        //Swapping the elemments at 0 and 2 positions
        swap(arr, i, j);

        System.out.println(arr[i] + " " + arr[j]);

    }

    public static void swap( int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}