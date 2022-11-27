import java.util.Scanner;

public class Bai_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền anh X gửi: ");
        double tienGui = scanner.nextDouble();

        System.out.print("Nhập số tiền anh X muốn có: ");
        double tienNhan = scanner.nextDouble();

        System.out.print("Nhập lãi suất tiết kiệm theo năm: ");
        double laiSuat = scanner.nextDouble();

        int soNam = 0;
        while (tienGui < tienNhan){
            tienGui += tienGui * laiSuat / 100;
            soNam++;
        }
        System.out.print("Anh X cần ít nhất " + soNam + " để nhận được số tiền mong muốn");
    }
}
