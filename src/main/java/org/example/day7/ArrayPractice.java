package org.example.day7;

import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] intArrays1;
        int[] intArrays2 = new int[5];
        int[] intArrays3 = {1, 2, 3, 4, 5};

        String[] shoppingList = {"bananas", "apples", "pears"};
        intArrays2[0] = 5;
        intArrays2[1] = 4;
        intArrays2[2] = 3;
        intArrays2[3] = 2;
        intArrays2[4] = 1;

        System.out.println(Arrays.toString(intArrays3));

        printArray(intArrays2);
        printArray(intArrays3);
//        printArray(shoppingList);
    }
}
