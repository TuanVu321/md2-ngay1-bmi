import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao can nang theo kg");
        double weight = scanner.nextDouble();
        System.out.println("nhap vao chieu cao theo met");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Thieu can");
        } else {
            if (bmi < 25) {
                System.out.println("binh thuong");
            } else {
                if (bmi < 30) {
                    System.out.println("thua can");
                } else {
                    System.out.println("beo phi");
                }
            }
        }
    }
}
