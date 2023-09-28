import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
       String name;
       Scanner scn = new Scanner(System.in);

       System.out.println("Введите имя: ");
       name = scn.nextLine();
       if (name.equals("Вячеслав")) {
           System.out.println("Привет, Вячеслав");
       } else {
           System.out.println("Нет такого имени");
       }
    }
}