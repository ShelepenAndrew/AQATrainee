import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String name = "Вячеслав";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String urName = sc.nextLine();
        if (urName.equals(name)) {
            System.out.println("Привет, " + urName + "!");
        } else {
            System.out.println("Привет, Вы ввели имя " + urName + ". Нет такого имени!");
        }
    }
}