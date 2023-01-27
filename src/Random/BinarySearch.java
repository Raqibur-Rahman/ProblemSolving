package Random;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        if(arraySize<=0){
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("Insert "+ arraySize+" elements to the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("After sorting your array elements are looks like:");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }


        System.out.print("Enter key value to find : ");
        int valueToFind = sc.nextInt();
        int index = search(array,valueToFind,0,arraySize-1);
        if(index!=-1){
            System.out.println("Value found at index : " +index);
        }else{
            System.out.println("Value not found in the array.");
        }
    }

    private static int search(int[] array, int key, int firstIndex, int lastIndex) {
        int middleIndex;
        while (firstIndex<=lastIndex){
            middleIndex=(firstIndex+lastIndex)/2;
            if(array[middleIndex]==key){
                return middleIndex;
            }
            else if(key>array[middleIndex]){
                firstIndex=middleIndex+1;
            }
            else lastIndex=middleIndex-1;
        }
        return -1;
    }
}

