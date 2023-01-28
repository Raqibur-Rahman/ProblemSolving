package DSA_Random_Practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 77, 4, 33, 6, 7, 22};

        for (int k = 0; k < array.length - 1;k++) {

            for (int i = 0; i < array.length - k-1; i++) {
                if (array[i] > array[i + 1]) {
                    int tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                }
            }

        }

        System.out.println("Sorter elements are:");
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
