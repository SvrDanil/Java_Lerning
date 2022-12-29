package Homework_5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task_2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> db = new ArrayList<>();
        HashMap<String, Integer> dbData = new HashMap<>();
        getFile(dbData, db);
        System.out.println("Исходный список: ");
        System.out.println(db);
        LinkedHashMap<String, Integer> sortedData = new LinkedHashMap<>();
        sortedDB(dbData, sortedData);
        System.out.println("Количество повторяющихся имён в файле: ");
        printDuplicates(sortedData);
    }

    private static void getFile(HashMap<String, Integer> data, ArrayList<String> original) throws FileNotFoundException {
        File reader = new File("Homework_5/Task2.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] temp = input.split(" ");
            original.add(input);
            if (data.containsKey(temp[0])) {
                data.put(temp[0], data.get(temp[0]) + 1);
            } else {
                data.put(temp[0], 1);
            }
        }
    }

    private static void printDuplicates(HashMap<String, Integer> data) {
        Set<Map.Entry<String, Integer>> entries = data.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.printf("%10s %s %d\n", entry.getKey(), ":", entry.getValue());
        }
    }
    private static void sortedDB(HashMap<String, Integer> data, LinkedHashMap<String, Integer> sorted){
        String maxKey = "";
        int maxValue = 0;
        while (data.size() > 0){
            Set<Map.Entry<String, Integer>> entries = data.entrySet();
            for (Map.Entry<String, Integer> entry : entries){
                if (entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            sorted.put(maxKey, maxValue);
            data.remove(maxKey);
            maxKey = "";
            maxValue = 0;
        }
    }
}
