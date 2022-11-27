//import java.lang.reflect.Array;
//import java.util.List;
//import java.util.Scanner;
//
//public class Bai_14 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // Nhập vào số phần tử của mảng
//        System.out.print("Nhập vào số phần tử của mảng: n = ");
//        int n = scanner.nextInt();
//        // Khai báo mảng có n phần tử
//        float[] mangNhap = new float[n];
//        // Nhập vào từng phần tử của mảng
//        for (int i = 0; i < n; i++){
//            System.out.print("Phần tử số " + (i + 1) + " = ");
//            mangNhap[i] = scanner.nextFloat();
//        }
//        // In ra mảng đã nhập
//        inMang(mangNhap);
//        //
//        float[] mangXoaLapLai;
//        int soPhanTuXoa = 0;
//        for (int i = 0; i < mangNhap.length - 1; i++)
//            for (int j = i + 1; j < mangNhap.length; j++)
//
//    }
//
//    public static void inMang(float[] mangIn){
//        for (float item: mangIn) System.out.print(item + " ");
//        System.out.print("\n");
//    }
//
//}
