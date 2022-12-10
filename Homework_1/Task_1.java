package Homework_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите n" );
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        int tripl = 1;
        for (int i = 1; i <= n; i++) {
             fact = fact * i;
             tripl = tripl + i;
        }
        
       System.out.println("Факториал = "+ fact);
       System.out.println("Сумма = " + tripl);
    }   
}