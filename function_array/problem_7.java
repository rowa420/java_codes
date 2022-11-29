package assignment_2;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class problem_7 {
    public static void main(String[] args) {

        int num = 0;

        int[] array = new int[20];

        Random number = new Random();

        for (int i = 0; i < 20; i++) {
            array[i] = number.nextInt(101);
            num = num + array[i];
            System.out.println("the numbers are");
            System.out.println("" + array[i]);
        }
        problem_7 array_1 = new problem_7();

        array_1.findmax(array);

        array_1.findmin(array);
        System.out.println("duplicate");
        array_1.duplicate1(array);


    }

    public static void findmax(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(+array[i]);

        }
        System.out.println("the max is " + array[19]);
    }

    public static void findmin(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(+array[i]);

        }
        System.out.println("the min is " + array[0]);

    }

    public static void duplicate1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("the duplicate value found");
                } else {
                    System.out.println(" not found");
                }
            }
        }

    }
}

