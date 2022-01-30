public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3, 6, 8, 12, 33, 37, 44, 48, 59, 65, 69, 77, 79, 81, 85, 88, 91, 96, 109, 112};

        int res = binarySearch(arr, 91);

        if (res == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element found at index "+ res);
        }
        
    }

    public static int binarySearch(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length -1;
        
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if (arr[mid] < item) {
                lo = mid + 1;
            } else if(arr[mid] > item){
                hi = mid - 1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
}
