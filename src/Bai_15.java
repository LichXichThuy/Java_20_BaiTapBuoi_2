import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        System.out.print("Nhạp vào một chuỗi: ");

        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        // In độ dài của chuỗi
        System.out.print("Chuỗi có độ dài = " + chuoi.length());
        // In ký tự tại một vị trí index
        System.out.print("\nNhập vào vị trí (từ 1 đến độ dài của chuỗi) cần in ký tự:");
        int index = scanner.nextInt() - 1;
        System.out.print("Ký tự tại vị trí thứ " + (index + 1) + " là \'" + chuoi.charAt(index) + "\'\n");
        // Kiem tra chuỗi phụ "abcdef"
        if (chuoi.contains("abcdef")) System.out.println("Chuỗi vừa nhập có chuỗi phụ \"abcdef\"");
        else System.out.println("Chuỗi vừa nhập không có chuỗi phụ \"abcdef\"");
    }
}
