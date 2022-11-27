import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập vào một chuỗi bất kỳ
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        StringBuilder chuoiNhapVao = new StringBuilder(scanner.nextLine());

        char chuCaiDau = chuoiNhapVao.charAt(0);
        char chuCaiDauUpper;
        // Viết hoa chữ cái đầu nếu không là khoảng trắng
        if (chuCaiDau != ' '){
            chuCaiDauUpper = Character.toUpperCase(chuCaiDau);
            chuoiNhapVao.setCharAt(0,chuCaiDauUpper);
        }
        // Viết hoa chữ cái đầu các từ tiếp theo sau khoảng trắng
        for (int i = 0; i < chuoiNhapVao.length() - 1; i++){
            if (chuoiNhapVao.charAt(i) == ' ' && chuoiNhapVao.charAt(i+1) != ' ') {
                chuCaiDau = chuoiNhapVao.charAt(i+1);
                chuCaiDauUpper = Character.toUpperCase(chuCaiDau);
                chuoiNhapVao.setCharAt(i+1,chuCaiDauUpper);
            }
        }
        // In chuỗi
        System.out.println("Chuỗi viết hoa chữ cái đầu: " + chuoiNhapVao);
    }
}
