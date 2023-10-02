import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int n = 0;
        int len = 0;
        int avg = 0;
        // ввод числа строк
        while (true) // ввод числа строк
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System.in);
            try {
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException fg) {
                // если введенное значение не является числом
                System.out.print("Вы ввели не число. ");
            }
        }
        // создание массива строк
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите строку №" + (i + 1));
            str[i] = sc2.nextLine();
        }
        // нахождение средней длины среди строк
        for (int i = 0; i < n; i++) {
            len += str[i].length();
        }
        avg = len / n;
        // вывод строк
        System.out.println(avg);
        System.out.println("Строки чьи длины меньше средней:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < avg) {
                System.out.println(i + ")" + str[i] + " ее длина:" + str[i].length());
            }
        }

    }
}
