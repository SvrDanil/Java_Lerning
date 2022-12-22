package Homework_3;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        randomArray(array1,randomNum , 10);
        System.out.println(Arrays.toString(array1));
        int[] array2 = mergesort(array1);
        System.out.println(Arrays.toString(array2));
}

public static int[] mergesort(int[] array1) {
    int[] copyArr1 = Arrays.copyOf(array1, array1.length);
    int[] copyArr2 = new int[array1.length];
    int[] result = mergesortInner(copyArr1, copyArr2, 0, array1.length);
    return result;
}

public static int[] mergesortInner(int[] buffer1, int[] buffer2,
int startIndex, int endIndex) {
if (startIndex >= endIndex - 1) {
    return buffer1;
    }

    int middle = startIndex + (endIndex - startIndex) / 2;
    int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
    int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
    int index1 = startIndex;
    int index2 = middle;
    int destIndex = startIndex;
    int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
while (index1 < middle && index2 < endIndex) {
result[destIndex++] = sorted1[index1] < sorted2[index2]
        ? sorted1[index1++] : sorted2[index2++];}
while (index1 < middle) {
    result[destIndex++] = sorted1[index1++];}
while (index2 < endIndex) {
    result[destIndex++] = sorted2[index2++];}
return result;
}

private static void randomArray(int[] array, ThreadLocalRandom rand,int size){
    for(int i =0; i < array.length;i++){
        array[i] = rand.nextInt(0,10);
    }
}
}
