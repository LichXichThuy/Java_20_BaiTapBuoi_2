import java.util.Scanner;

public class Bai_19 {
    public static void main(String[] args) {
        System.out.println("Chọn một trong hai chương trình sau:");
        System.out.println("-1- Giải phương trình bậc 1: ax + b = 0");
        System.out.println("-2- Giải phương trình bậc 2: ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) giaiPhuongTrinhBac1();
        else giaiPhuongTrinhBac2();
    }
    public static void giaiPhuongTrinhBac1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        float a = scanner.nextFloat();

        System.out.print("Nhập b = ");
        float b = scanner.nextFloat();

        if (a == 0) System.out.println("Phương trình vô nghiệm");
        else System.out.println("Phương trình có nghiệm = " + (-b/a));
    }
    public static void giaiPhuongTrinhBac2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        float a = scanner.nextFloat();
        if (a==0){
            System.out.print("Nhập lại a (khác 0): ");
            a =scanner.nextFloat();
        }

        System.out.print("Nhập b = ");
        float b = scanner.nextFloat();

        System.out.print("Nhập c = ");
        float c = scanner.nextFloat();

        float delta = b*b - 4 * a * c;
        if (delta < 0) System.out.println("Phương trình vô nghiệm");
        else if (delta == 0) System.out.println("Phương trình có nghiệm kép "+(-b/(2*a)));
        else{
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
