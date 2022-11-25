import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {

        System.out.print("Nhập vào một số tự nhiên: ");
        Scanner scanner = new Scanner(System.in);
        int soTuNhien = scanner.nextInt();
        System.out.println("Tổng các chữ số của số " + soTuNhien + " = " + tinhTongCacChuSo(soTuNhien));

    }

    public static int tinhTongCacChuSo(int soTuNhien){
        int tong = 0;
        do {
            tong += soTuNhien % 10;
            soTuNhien /= 10;
        } while (soTuNhien != 0);
        return tong;
    }
}
