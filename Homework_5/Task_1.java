package Homework_5;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, ArrayList<String>>> phoneBook = new ArrayList<>();
        String[] fieldsArray = {"ID", "First Name", "Last Name","Phone"};
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int menu = menu(input);
            switch (menu) {
                case 1 -> printPhoneBook(phoneBook, fieldsArray);
                case 2 -> fillMap(input, phoneBook, fieldsArray);
                case 3 -> deleteEntry(input, phoneBook);
                case 0 -> flag = false;
            }
        }
    }
    
private static void fillMap(Scanner inp, ArrayList<HashMap<String, ArrayList<String>>> book, String[] fields) {
    HashMap<String, ArrayList<String>> userInput = new HashMap<>();
    ArrayList<String> bookSize = new ArrayList<>();
    bookSize.add(String.valueOf(book.size()));
    userInput.put("ID", bookSize);
    ArrayList<String> phones = new ArrayList<>();
    String temp = "";
    for (String field : fields) {
        if (!field.equals("ID") && !field.equals("Phone")) {
            System.out.printf("Введите значение поля %s: ", field);
            ArrayList<String> value = new ArrayList<>();
            temp = inp.nextLine();
            value.add(temp);
            userInput.put(field, value);
        }
        while (field.equals("Phone")) {
            System.out.printf("Введите значение поля %s: ", field);
            temp = inp.nextLine();
            phones.add(temp);
            System.out.print("Ввесть доп. номер телефона Д/Н?: ");
            String choice = inp.nextLine().toUpperCase();
            if (choice.equals("Н") || choice.equals("N")) {
                userInput.put(field, phones);
                break;
            }
        }
    }
    book.add(userInput);
}
private static void printPhoneBook(ArrayList<HashMap<String, ArrayList<String>>> book, String[] fields) {
    for (HashMap<String, ArrayList<String>> map : book) {
        for (String field : fields) {
            if (!field.equals("Phone")) {
                System.out.printf("%s = %s\n", field, map.get(field).get(0));
            } else {
                for (int i = 0; i < map.get(field).size(); i++) {
                    System.out.printf("%s%d = %s\n", field, i + 1, map.get(field).get(i));
                }
            }
        }
        System.out.println("-------");
    }
    System.out.println("");
}

private static int menu(Scanner inp) {
    System.out.println("");
    System.out.print("""
            Вывести справочник - 1
            Добавить запись - 2
            Удалить запись - 3
            Выход - 0
            :""");
    int choice = inp.nextInt();
    inp.nextLine();
    System.out.println("");
    return choice;
}
private static void deleteEntry(Scanner inp, ArrayList<HashMap<String, ArrayList<String>>> book) {
    System.out.print("Введите ID: ");
    int deletion = inp.nextInt();
    inp.nextLine();
    book.remove(deletion);
    System.out.println("");
}
}

