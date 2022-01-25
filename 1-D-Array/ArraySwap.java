public class ArraySwap {
    
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
        
        int[] other = {100,200,300,400};

        System.out.println(arr[i] + " " + other[j]);

        // Here swap doesnt happen
        swap(arr,other);

        System.out.println(arr[i] + " " + other[j]);

    }

    public static void swap(int[] one, int[] two){

        int[] temp = one;
        one = two;
        two = temp;
    }

}
