import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào hai số nguyên dương từ 10 đến 99: ");
        System.out.print("- Số thứ nhất = ");
        String soThuNhat = scanner.nextLine();

        System.out.print("- Số thứ hai = ");
        String soThuHai = scanner.nextLine();

        if (soThuNhat.charAt(0) == soThuHai.charAt(0) || soThuNhat.charAt(0) == soThuHai.charAt(1) ||
                soThuNhat.charAt(1) == soThuHai.charAt(0) || soThuNhat.charAt(1) == soThuHai.charAt(1))
            System.out.print("True");
        else System.out.print("False");
    }
}
