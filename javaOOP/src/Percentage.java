import java.util.Scanner;
public class Percentage {
    static Scanner read = new Scanner(System.in);
    static int percentage(int obtained) {
        System.out.print("Enter max mark can be obtained in a paper : ");
        int tot = read.nextInt();
        tot*=5;
        return obtained/tot*100;
    }

    public static void main(String[] args) {
        int obt = 0;
        for(int i=0;i<5;i++) {
            System.out.print("Enter Marks for Subject "+(i+1)+" : ");
            int a = read.nextInt();
            obt+=a;
        }
        System.out.println("Percentage : "+percentage(obt)+"%");
    }
}
