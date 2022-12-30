package Homework_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Notebook {
    ArrayList<String[]> notebooks = new ArrayList<>();
    String[] fields = {"Производитель", "Модель", "Экран", "CPU", "GPU", "RAM", "SSD", "OS", "Цвет", "Цена"};

    public void readFile() throws FileNotFoundException {
        File notebooksDB = new File("Homework_6/notebooks_db.txt");
        Scanner scanner = new Scanner(notebooksDB);
        while (scanner.hasNextLine()) {
            String[] temp = scanner.nextLine().split(" - ");
            notebooks.add(temp);
        }
    }

    public void printFile(ArrayList<String[]> forPrint) {
        int c = 1;
        for (String[] notebook : forPrint) {
            System.out.printf("#%d\n", c);
            for (int i = 0; i < notebook.length; i++) {
                System.out.printf("%s: %s\n", fields[i], notebook[i]);
            }
            System.out.println();
            c++;
        }
    }
    public void printFields(){
        for (int i = 0; i < fields.length; i++) {
            System.out.printf("%d: %s\n", i+1, fields[i]);
        }
    }
    public ArrayList<String> findParameters(int index){
        ArrayList<String> result = new ArrayList<>();
        Set<String> tempSet = new HashSet<>();
        for (String[] notebook : notebooks) {
            tempSet.add(notebook[index]);
        }
        for (String item : tempSet) {
            result.add(item);
        }
        return result;
    }
    public void printSet(ArrayList<String> set, int index){
        int c = 1;
        System.out.printf("%s:\n", fields[index]);
        for (String i : set) {
            System.out.printf("%d: %s\n", c, i);
            c++;
        }
    }
    public ArrayList<String[]> findFiltered(int index, String searchStr){
        ArrayList<String[]> result = new ArrayList<>();
        for (String[] notebook : notebooks){
            if (notebook[index].equals(searchStr)){
                result.add(notebook);
            }
        }
        return result;
    }
}
