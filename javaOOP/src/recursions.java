import java.util.Scanner;
public class recursions {
     static int fact(int k) {
        if(k == 1) {
            return 1;
        }
        return k*fact(k-1);
    }
    static int sum(int k) {
         if(k==0) {
             return 0;
         }
         return k+sum(k-1);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(fact(n)+"\n"+sum(n));
    }
}
