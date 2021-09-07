import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("температура в градусах Цельсия: ");
        float num1 = scanner.nextInt();
        System.out.println("температура по Фаренгейту: " + (32+(9 * 

num1) / 5));
    }
}
