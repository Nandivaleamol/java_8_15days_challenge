package day_14;

import java.util.Arrays;
/*Problem Statement: 05
Write a Java program to merge 2 arrays and make sure the result is sorted.
        input:
        array1 = {10,20,30,40,50}
        array2 = {9,18,27,27,36,45}

        Output:
        merged array = {9, 10, 18, 20, 27, 27, 30, 36, 40, 45, 50}
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {9, 18, 27, 27, 36, 45};

        int[] finalArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, finalArray, 0, array1.length);
        System.arraycopy(array2, 0, finalArray, array1.length, array2.length);
        Arrays.sort(finalArray);
        for (int element : finalArray) {
            System.out.print(element + " ");
        }
    }
}
