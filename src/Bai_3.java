import static java.lang.System.getProperty;

public class Bai_3 {
    public static void main(String[] args) {
        System.out.println("Java version: " + getProperty("java.version"));
        System.out.println("Java Runtime Version: " + getProperty("java.runtime.version"));
        System.out.println("Java Home: " + getProperty("java.home"));
        System.out.println("Java Vendor: " + getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + getProperty("java.class.path"));
    }
}
