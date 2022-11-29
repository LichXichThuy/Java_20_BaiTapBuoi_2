import java.util.Scanner;

public class Bai_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điều kiện: 0<=x1<x2<10000; 1<=v1; v2<=10000");
        Kang kang1 =new Kang();
        Kang kang2 = new Kang();
        kang1.nhapThongTin(scanner);
        kang2.nhapThongTin(scanner);

        kang1.xuatThongTin();
        kang2.xuatThongTin();

        while (kang1.getX()< kang1.getX()){
            kang1.setX(kang1.getX()+ kang1.getV());
            kang2.setX(kang2.getX()+kang2.getV());
        }
        if (kang1.getX() == kang1.getX()) System.out.println("Hai Kangoru sẽ gặp nhau");
    }
}
