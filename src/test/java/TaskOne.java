import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args){
        int a;
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите число: ");
        a = scn.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        }
    }
}