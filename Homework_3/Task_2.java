package Homework_3;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Iterator;

public class Task_2 {public static void main(String[] args) { 
    int startCapasity = 10;
    ArrayList<Integer> list = new ArrayList<Integer>(startCapasity);
    ThreadLocalRandom randomNum = ThreadLocalRandom.current();
    ArrayList<Integer> list1 = randomList(list,randomNum,startCapasity);
    listPrint(list1);
    ArrayList<Integer> result = listRedactor(list1);
    listPrint(result);

}

private static ArrayList<Integer> listRedactor(ArrayList<Integer> list){
    for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();){
        Integer number = iterator.next();
        if (number % 2 == 0) {
            iterator.remove();
        }
       }
       return list;
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