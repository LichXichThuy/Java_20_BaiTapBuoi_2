import java.util.ArrayList;

public class Bai_1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < 11; i++){
            list3.add("=");
            if (i % 2 == 0){
                list1.add("*");
                list2.add(" ");
            }
            else {
                list1.add(" ");
                list2.add("*");
            }
        }
        list1.add(" ");
        list2.add(" ");
        list3.add("=");
        for (int i = 12; i < 50; i++){
            list1.add("=");
            list2.add("=");
            list3.add("=");
        }
        for (int i = 0; i < 9; i++){
            if (i % 2 == 0){
                for (String item: list1) System.out.print(item);
                System.out.print("\n");
            }
            else {
                for (String item: list2) System.out.print(item);
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 6; i++){
            for (String item: list3) System.out.print(item);
            System.out.print("\n");
        }
    }

}
