import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int x = 0;
        Scanner numArray = new Scanner(System.in);
        System.out.print("Введите число, определяющее количество значений в массиве: ");
        int y = numArray.nextInt();
        int[] array = new int[(y-x)+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = x;
            x++;
        }
        System.out.print("Значения элементов массива кратные 3:");
        for (int s = 0; s < array.length; s++) {
            if (array[s]>0) {
                if (array[s]%3 == 0) {
                    System.out.print("[" + array[s] + "]");
                }
            }
        }
    }
}