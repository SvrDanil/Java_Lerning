package Homework_1;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Введите 1 число" );
        Scanner scanner = new Scanner(System.in);
        int First = scanner.nextInt();
        System.out.println("Введите знак " );
        char Symbol  = scanner.next().charAt(0);
        System.out.println("Введите 2 число" );
        int Second = scanner.nextInt();
        switch (Symbol){
        case '+':
                result = First+Second;
            break;
        case '-':
                result = First-Second;
            break;
        case '*':
                result = First*Second;
            break;
        case '/':
                result = First/Second;
            break;
        default : 
        System.out.println("Не верный ввод");
        }
        System.out.println("Ответ = "+ result);
    }
}
