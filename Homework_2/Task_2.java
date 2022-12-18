package Homework_2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;
import java.util.logging.Level;

// Задачу 2  не доделал, а 3 даже не успеваю начать 
public class Task_2 {
    
    Logger logger = Logger.getLogger(Task_2.class.getName());
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        randomArray(arr,randomNum,arraySize);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arraySize);
        System.out.println(Arrays.toString(arr));
        Logger logger = Logger.getLogger(Task_2.class.getName());
        


       
    
}
    private static void randomArray(int[] array, ThreadLocalRandom rand,int size){
        for(int i =0; i < array.length;i++){
            array[i] = rand.nextInt(0,10);
        }
    }
    private static void bubbleSort(int[] array, int size)
    {
        for (int i=0; i<size; i++){
            for(int j=0; j < size;j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                

            }
        }

    }
}
