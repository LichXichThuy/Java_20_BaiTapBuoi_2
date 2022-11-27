import java.util.Scanner;

public class Bai_17 {
    public static void main(String[] args) {
        int soNgauNhien = (int) (Math.random() * 1000);
//        System.out.println(soNgauNhien);
        int soDoan;
        while ((soDoan = nhapSoDoan()) != soNgauNhien){
            if (soDoan > soNgauNhien) System.out.println("Số " + soDoan + " lớn hơn số cần tìm");
            else System.out.println("Số " + soDoan + " bé hơn số cần tìm");
        }
        System.out.println(soDoan + " là số cần tìm");
    }
    public static int nhapSoDoan(){
        System.out.print("Nhập số bạn đoán: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
