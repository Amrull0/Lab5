//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peremena peremena = new Peremena(); // Создаем объект класса

        System.out.println("Введите значения x для y=3x+5: ");
        double x = sc.nextDouble();
        double result1 = peremena.peremena1(x);
        System.out.println("Результат: " + result1);

        System.out.println("Введите значения a и b для y=(a+b)/(a-b): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result2 = peremena.peremena2(a, b);
        System.out.println("Результат: " + result2);

        System.out.println("Введите значения a, x и b");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int x1 = sc.nextInt();
        int result3 = peremena.peremena3(a1, b1, x1);
        System.out.println("Результат: " + result3);
    }
}

    class Peremena {
        public double peremena1(double x) {
        return x * 3 + 5;
        }

        public double peremena2(double a, double b) {
            if (a == b) {
            System.out.println("Деление на ноль");
            return 0.0;
            }
            return (a + b) / (a - b);
        }

        public int peremena3(int x, int a, int b) {
            if (b == 0) {
            System.out.println("Деление на ноль");
            }
            int y = 1;
            for (int i = 1; i <= (a * x / b); i++) {
            y *= i;
            }
            return y;
        }
    }
