import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_20 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số số tự nhiên: n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> mang = new ArrayList<Integer>();
        List<Integer> mangChan = new ArrayList<Integer>();
        List<Integer> mangLe = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            System.out.print("Nhập vào số thứ " + (i+1) + " = ");
            mang.add(scanner.nextInt());
            if (mang.get(i) % 2 == 0) mangChan.add(mang.get(i)); // Nếu số nhập vào là số chẵn thì thêm vào mảng chăn
            else mangLe.add(mang.get(i));   // Nếu số nhập vào là số lẻ thì thêm vào mảng lẻ
        }

        System.out.print("Mảng các số chẵn gồm: ");
        inMang(mangChan);

        System.out.print("\nMảng các số lẻ gồm: ");
        inMang(mangLe);
    }
    public static void inMang(List<Integer> mang){
        for (int item: mang) System.out.print(item + " ");
    }
}
