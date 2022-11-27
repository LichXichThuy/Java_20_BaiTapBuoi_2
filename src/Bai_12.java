import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số tự nhiên n từ 1 đến 9: n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
