import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        System.out.println("Chọn phương thức bạn muốn sử dụng: ");
        System.out.println("(1) Chuyển đổi cơ số 10 sang nhị phân");
        System.out.println("(2) chuyển đổi nhị phân sang cơ số 10");
        Scanner scanner = new Scanner(System.in);
        int phuongThuc = scanner.nextInt();
        // Nhập phương thức muốn chuyển đổi
        System.out.print("Nhập số bạn muốn chuyển đổi = ");
        int soCanChuyen = scanner.nextInt();
        // Trả về kết quả theo phương thức đã chọn
        if (phuongThuc == 1) System.out.println("Số " + soCanChuyen + " chuyển sang hệ nhị phân là: " + chuyenThanhNhiPhan(soCanChuyen));
        else System.out.println("Số " + soCanChuyen + " chuyển sang hệ thập phân là: " + chuyenThanhThapPhan(soCanChuyen));
    }
    // Hàm đổi sang hệ nhị phân
    public static int chuyenThanhNhiPhan(int soThapPhan){
        int soNhiPhan = 0;
        int i = 0;
        do {
            soNhiPhan += (soThapPhan % 2) * (int) Math.pow(10, i);
            soThapPhan /= 2;
            i++;
        } while (soThapPhan != 0);
            return soNhiPhan;
    }
    // Hàm đổi sang hệ thập phân
    public static int chuyenThanhThapPhan(int soNhiPhan){
        int soThapPhan = 0;
        int i = 0;
        do {
            soThapPhan += (soNhiPhan % 10) * (int) Math.pow(2,i);
            soNhiPhan /= 10;
            i++;
        } while (soNhiPhan != 0);
        return soThapPhan;
    }
}


