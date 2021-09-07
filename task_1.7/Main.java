import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("длина: ");
        int num1 = scanner.nextInt();
        System.out.println("ширина: ");
        int num2 = scanner.nextInt();
        System.out.println("глубина: ");
        int num3 = scanner.nextInt();
        System.out.println(num1 * num2 * num3 );
    }

}
