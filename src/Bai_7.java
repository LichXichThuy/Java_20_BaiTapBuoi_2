import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {

        System.out.print("Nhập vào một số tự nhiên = ");
        Scanner scanner = new Scanner(System.in);
        int soNhapVao = scanner.nextInt();

        System.out.print("Ước số của " + soNhapVao + " là: ");
        for (int i = 1; i <= soNhapVao/2; i++){
            if ((soNhapVao % i) ==0) System.out.print(i + " ");
        }
    }

}
