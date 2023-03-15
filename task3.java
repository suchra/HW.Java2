import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите строку: ");
        String user_string = iScanner.nextLine();
        iScanner.close();
        System.out.println(isPali(user_string));
    }


    private static boolean isPali(String user_string) {
        int length = user_string.length();
        for (int i = 0; i < (length/2); i++) {
            if(user_string.charAt(i) != user_string.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
}