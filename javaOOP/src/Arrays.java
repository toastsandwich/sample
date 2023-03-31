import java.util.*;
public class Arrays {
    static Scanner read = new Scanner(System.in);
    static void arrays(){
        System.out.print("Enter number of elements for your custom array : ");
        int n = read.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter element : ");
            arr[i] = read.nextLine();
        }
        for(String x : arr) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        arrays();
    }
}
