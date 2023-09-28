import java.util.Random;

public class TaskThree {
    public static void main(String[] args){
        int[] mas = new int[20];
        Random rnd = new Random();

        System.out.println("Массив: ");
        for(int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(50);
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        System.out.println("Элементы массива, кратные 3: ");
        for (int b = 0; b < mas.length; b++ ) {
            if (b % 3 == 0)
                System.out.print(b + " ");
        }
    }
}