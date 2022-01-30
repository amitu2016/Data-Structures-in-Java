public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {43, 32, 22, 67, 47, 99, 102, 13, 44, 88};
        int result = linearSearch(arr, 102);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index "+result);
        }

    }

    public static int linearSearch(int[] arr, int item) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
            return -1;
    }
}
