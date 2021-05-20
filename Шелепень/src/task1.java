import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        if (num>7) {
            System.out.println("Привет, Вы ввели число " + num + " и оно > 7");
        } else if (num==7){
            System.out.println("Привет, Вы ввели число " + num + " и оно = 7");
        } else {
            System.out.println("Привет, Вы ввели число " + num + " и оно < 7");
        }
    }
}