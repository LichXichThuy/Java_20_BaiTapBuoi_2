import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai_6 {
    public static void main(String[] args) {
        // Nhập chuỗi
        System.out.print("Nhập vào một chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String chuoiNhap = scanner.nextLine();
        // In chuỗi theo thứ tự ngược lại
        for (int i = chuoiNhap.length() - 1; i >= 0; i--){
            System.out.print(chuoiNhap.charAt(i));
        }
    }
}
