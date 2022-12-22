package Homework_3;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Iterator;
import java.util.Collections;

public class Task_3 {public static void main(String[] args) {
        int startCapasity = 10;
        ArrayList<Integer> list = new ArrayList<Integer>(startCapasity);
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        ArrayList<Integer> list1 = randomList(list,randomNum,startCapasity);
        listPrint(list1);
        int min = list1.get(0);
        int max = list1.get(0);
        int sum =0;
        for (Integer i: list1) {
            if(i < min) 
            min = i;
            if(i > max) 
            max = i;
            sum = sum+i;
            }
            double middle = sum / list1.size();

        System.out.println("Среднее число: " + middle);
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
}
    
   
    
    
    private static ArrayList<Integer> randomList(ArrayList<Integer> list, ThreadLocalRandom rand,int size){
        for (int i =0; i < size ;i++){
             int a = rand.nextInt(0,10);
             list.add(i,a);
            }
            return list;
        }
    
    private static void listPrint(ArrayList<Integer> list){
        for (Object o : list){
            System.out.print(o);
            }
            System.out.println();
        }
    
}
    
