package Otus;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generate(18);
        int[] minMax = findMinAndMax(array);

        printArray(array);

        System.out.println("Минимум " + minMax[0]);
        System.out.println("Максимум " + minMax[1]);

        float avg = getAverage(array);
        System.out.println("Среднее значение " + avg);
    }

    private static int[] generate(int size){
        int[] array = new int[size];

        for (int i=0; i<array.length; i++){
            array[i] = new Random().nextInt(30);
    }
        return array;
}
    private static int[] findMinAndMax (int[] array){
        int min = array[0];
        int max = array[0];

        for (int i = 1; i< array.length; i++){
            if (array[i]< min){
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
                
            }
        }
        return new int[]{min,max};
    }

    private static void printArray(int[] array){
        System.out.println("Массив ");
        for (int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static float getAverage(int[] array){
        int sum = 0;

        for (int num : array){
            sum += num;
        }
        return sum/(float)array.length;

    }

}

