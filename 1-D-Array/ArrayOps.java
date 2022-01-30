import java.util.Scanner;
public class ArrayOps {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = takeArray();

        display(arr);
    }

    public static int[] takeArray(){
        System.out.println("Size?");

        int n = sc.nextInt();

        int[] arr = new  int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at "+i+" position");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void display(int[] arr) {
        System.out.println("Elements in array are: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
