import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Nhập vào số phần tử của mảng
        System.out.print("Nhập vào số phần tử của mảng: n = ");
        int n = scanner.nextInt();
        // Khai báo mảng có n phần tử
        float[] mangNhap = new float[n];
        // Nhập vào từng phần tử của mảng
        for (int i = 0; i < n; i++){
            System.out.print("Phần tử số " + (i + 1) + " = ");
            mangNhap[i] = scanner.nextFloat();
        }
        // In ra mảng đã nhập
        inMang(mangNhap);
        // Khai báo các biến chứa kết quả
        float giaTriTrungBinh = 0;
        float max = mangNhap[0];
        float min = mangNhap[0];
        Float maxAm = null;
        Float minAm = null;
        Float maxDuong = null;
        Float minDuong = null;

        for (float item: mangNhap){
            giaTriTrungBinh += item;    // Tính giá trị trung bình
            if (item > max) max = item; // Tính max
            if (item < min) min = item; // Tính min
            //Nếu maxAm và minAm chưa có giá trị, gán với item âm
            if (maxAm == null && item < 0) maxAm = minAm = item;
            if (item < 0 && item > maxAm) maxAm = item;
            if (item < 0 && item < minAm) minAm = item;
            //Nếu maxDuongvà minDuong chưa có giá trị, gán với item dương
            if (maxDuong == null && item >=0) maxDuong = minDuong = item;
            if (item > 0 && item > maxDuong) maxDuong = item;
            if (item > 0 && item < minDuong) minDuong = item;
        }
        // a) Tính giá trị trung bình
        giaTriTrungBinh /= n;
        System.out.println("Giá trị trung bình của mảng = " + giaTriTrungBinh);
        // b) In max
        System.out.println("Giá trị lớn nhất = " + max);
        // In min
        System.out.println("Giá trị nhỏ nhất = " + min);
        // c) In max âm
        System.out.println("Giá trị âm lớn nhất = " + maxAm);
        // In min âm
        System.out.println("Giá trị âm nhỏ nhất = " + minAm);
        // d) In max dương
        System.out.println("Giá trị dương lớn nhất = " + maxDuong);
        // In min dương
        System.out.println("Giá trị dương nhỏ nhất = " + minDuong);
        // e) In các phần tử chẵn
        System.out.print("Các phần tử chẵn: ");
        for (int i = 1; i < n; i += 2) System.out.print(mangNhap[i] + " ");
        System.out.print("\n");
        // In các phần tử lẻ
        System.out.print("Các phần tử lẻ: ");
        for (int i = 0; i < n; i += 2) System.out.print(mangNhap[i] + " ");
        System.out.print("\n");
        // f) Thêm và xóa một phần tử theo Index
        System.out.println("Thêm một phần tử vào mảng đã nhập");
        System.out.print("Nhập giá trị phần tử và vị trí (từ 0 đến n) của phần tử: ");
        themMotPhanTu(scanner.nextFloat(), scanner.nextInt(), mangNhap);
        // XÓA
        System.out.println("Xóa một phần tử vào mảng đã nhập");
        System.out.print("Nhập vị trí cần xóa (từ 0 đến n - 1): ");
        xoaMotPhanTu(scanner.nextInt(), mangNhap);
    }
    public static void themMotPhanTu(float giaTriThem, int viTriThem, float[] mangCanThem){
        float[] mangDaThem = new float[mangCanThem.length + 1];
        for (int i = 0; i < mangDaThem.length; i++){
            if (i == viTriThem) mangDaThem[i] =giaTriThem;
            else if (i < viTriThem) mangDaThem[i] = mangCanThem[i];
            else mangDaThem[i] = mangCanThem[i-1];
        }
        System.out.print("Mảng sau khi đã thêm: ");
        inMang(mangDaThem);
    }
    public static void xoaMotPhanTu(int viTriXoa, float[] mangCanXoa){
        float[] mangDaXoa = new float[mangCanXoa.length - 1];
        if (viTriXoa == mangCanXoa.length - 1) {
            for (int i = 0; i < mangDaXoa.length; i++) mangDaXoa[i] = mangCanXoa[i];
        }
        else for (int i = 0; i < mangDaXoa.length; i++){
            if (i < viTriXoa) mangDaXoa[i] = mangCanXoa[i];
            else mangDaXoa[i] = mangCanXoa[i + 1];
        }
        System.out.print("Mảng sau khi đã xóa: ");
        inMang(mangDaXoa);
    }
    public static void inMang(float[] mangIn){
        for (float item: mangIn) System.out.print(item + " ");
        System.out.print("\n");
    }
}
