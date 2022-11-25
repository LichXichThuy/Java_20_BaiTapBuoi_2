import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TinhTienKaraoke {
    static LocalTime timeStart; // Khai báo thời gian vào phòng
    static LocalTime timeEnd;   // Khai báo thời gian kết thúc
    static byte waterBottles;   // khai báo số chai nước

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thời gian vào phòng từ 09:00 đến trước 24:00");

//      Yêu cầu nhân viên thu ngân nhập thời gian vào hát
//      Kiểm tra giờ đã nhập có đúng không? Nếu sai yêu cầu nhập lại
        System.out.print("Nhập vào giờ vào phòng: ");
        byte hoursStart = scanner.nextByte();
        while (!checkHours(hoursStart)){
            System.out.print("Bạn đã nhập sai giờ, vui lòng nhập lại giờ từ 09 đến 23: ");
            hoursStart = scanner.nextByte();
        }
//      Kiểm tra phút đã nhập có đúng không? Nếu sai yêu cầu nhập lại
        System.out.print("Nhập vào phút vào phòng: ");
        byte minutesStart = scanner.nextByte();
        while (!checkMinutes(minutesStart)){
            System.out.print("Bạn đã nhập sai phút, vui lòng nhập lại phút từ 00 đến 59: ");
            minutesStart = scanner.nextByte();
        }
//      Yêu cầu nhân viên thu ngân nhập thời gian kết thúc
//      Kiểm tra giờ đã nhập có đúng không? Nếu sai yêu cầu nhập lại
        System.out.print("Nhập vào giờ kết thúc: ");
        byte hoursEnd = scanner.nextByte();
        while (!checkHours(hoursEnd)){
            System.out.print("Bạn đã nhập sai giờ, vui lòng nhập lại giờ từ 09 đến 23: ");
            hoursEnd = scanner.nextByte();
        }
//      Kiểm tra phút đã nhập có đúng không? Nếu sai yêu cầu nhập lại
        System.out.print("Nhập vào phút kết thúc: ");
        byte minutesEnd = scanner.nextByte();
        while (!checkMinutes(minutesEnd)){
            System.out.print("Bạn đã nhập sai phút, vui lòng nhập lại phút từ 00 đến 59: ");
            minutesEnd = scanner.nextByte();
        }

        timeStart = LocalTime.of(hoursStart, minutesStart); // Đặt thời gian vào phòng
        timeEnd = LocalTime.of(hoursEnd, minutesEnd);   // Đặt thời gian kết thúc

//      Yêu cầu nhân viên nhập số chai nước đã sử dụng
        System.out.print("Nhập số chai nước đã sử dụng: ");
        waterBottles = scanner.nextByte();

        System.out.println("Tổng số tiền cần phải thanh toán = " + totalMoney() + " đồng.");
    }
    private static boolean checkHours(byte hours) { // Kiểm tra giờ
        if (9 <= hours && hours <= 23) return true;
        return false;
    }
    private static boolean checkMinutes(byte minutes){  // Kiểm tra phút
        if (0 <= minutes && minutes <=59) return true;
        return false;
    }
    public static LocalTime timeUse(){  // Tính thời gian vào phòng
        LocalTime subTime = timeEnd.minus(Duration.ofHours(timeStart.getHour()));
        subTime = subTime.minus(Duration.ofMinutes(timeStart.getMinute()));
        return subTime;
    }
    private static int hourlyMoney(){   // Tính tiền phòng theo số giờ vào phòng
        int hours = timeUse().getHour();
        int Money;
        // Nếu số phút sử dụng > 0 thì tính tiền thêm một giờ
        if (timeUse().getMinute() > 0) hours +=1;
        // Tinh tien
        if (hours > 3) return 90000 + (hours - 3) * 90000 * 30 / 100;
        return hours * 30000;
    }
    private static int totalMoney(){    // Tính tổng số tiền cần phải trả = (tiền theo giờ + tiền nước) * 80% nếu vào phòng từ 09:00 đến 17:00
        int Money = hourlyMoney() + waterBottles * 10000;
        if (timeStart.isAfter(LocalTime.parse("08:59")) && timeStart.isBefore(LocalTime.parse("17:01"))) return Money * 80 / 100 ;
        return Money;
    }
}
