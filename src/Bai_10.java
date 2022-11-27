import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tự nhiên n = ");
        int n = scanner.nextInt();

        // Khai báo biến kết quả tổng các số nguyên tố từ 1 đến n
        int iTong = 0;
        // Kiểm tra số nguyên tố từ 2 đến n
        // Nếu là số nguyên tố thì in ra màn hình và cộng vào iTong
        System.out.print("Các số nguyên tố từ 1 đến n gồm: ");
        for (int i = 2; i <= n; i++){
            if (kiemTraSoNguyenTo(i)){
                System.out.print(i + " ");
                iTong += i;
            }
        }
        // In kết quả ra màn hình
        System.out.print("\nTổng các số nguyên tố từ 1 đến n = " + iTong);
    }
    public static boolean kiemTraSoNguyenTo(int soCanKiemTra){
        for (int i = 2; i < soCanKiemTra; i++){
            if (soCanKiemTra % i == 0) return false;
        }
        return true;
    }
}
