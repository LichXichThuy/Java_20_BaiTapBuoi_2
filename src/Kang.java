import java.util.Scanner;

public class Kang {
    private String tenKang;
    private int x;
    private int v;
    public Kang(String tenKang, int x, int v){
        this.tenKang = tenKang;
        this.x = x;
        this.v = v;
    }
    public Kang(){};
    public void nhapThongTin(Scanner scanner){
        System.out.print("Nhập tên của Kang: ");
        tenKang = scanner.nextLine();
        System.out.print("Nhập vị trí của "+tenKang+": ");
        x=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vận tốc của "+tenKang+": ");
        v=Integer.parseInt(scanner.nextLine());
    }
    public void xuatThongTin(){
        System.out.println(tenKang + ": vị trí = " + x + "   vận tốc = " + v);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
