import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = read.nextDouble();
        if(num%2==0) {
            System.out.format("%f is even.\n",num);
        } else {
            System.out.format("%f is odd.\n",num);
        }

        switch ((int)num) {
            case 5 -> System.out.println("Number is 5.");
            case 10 -> System.out.println("Number is 10.");
            default -> System.out.println("Number not listed");
        }

        for(int i=0;i<=(int)num;i++) {
            if(i%2==0) {
                continue;
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
