import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        // Nhập tọa độ điểm A
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm A:");
        System.out.print("x(A) = ");
        float xA = scanner.nextFloat();
        System.out.print("y(A) - ");
        float yA = scanner.nextFloat();
        // Nhập tọa độ điểm B
        System.out.println("Nhập tọa độ điểm B:");
        System.out.print("x(B) = ");
        float xB = scanner.nextFloat();
        System.out.print("y(B) - ");
        float yB = scanner.nextFloat();
        // Xuất ra màn hình độ dài AB
        System.out.println("Độ dài đoạn thẳng AB = " + Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2)));
    }
}
