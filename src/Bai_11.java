import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số tự nhiên n = ");
        // Nhập giá trị n
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Công thức tính: log2(n) = log10(n) / log10(2)
        double log2_n = Math.log10(n) / Math.log10(2);
        System.out.println("Logarit cơ số 2 của n = " + log2_n);
        // In kết quả ra màn hình
        // Nếu log2(n) là số tự nhiên thì số tự nhiên lớn nhất nhỏ hơn log2(n) là log2(n) trừ 1
        // Nếu log2(n) là số chấm động thì số tự nhiên lớn nhất nhỏ hơn log2(n) là cận dưới của log2(n)
        if (log2_n == Math.floor(log2_n)) System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(n) là: " + (int)(log2_n - 1));
        else System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(n) là: " + (int) Math.floor(log2_n));
    }
}
