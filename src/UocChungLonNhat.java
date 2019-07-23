import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a = ");
        a = scanner.nextInt();

        System.out.print("Nhap b = ");
        b = scanner.nextInt();

        int a1 = a;
        int b1 = b;
        while (a1 != b1) {
            if (a1>b1){
                a1 -= b1;
            } else {
                b1 -= a1;
            }
        }
        System.out.println("UCLN("+a+","+b+") = "+a1);
    }
}
