import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    public static void sort(int[] array){

        for(int i = 0; i<array.length; i++){
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }

        return smallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int smallestIndex = startIndex;
        int temp = 0;
        for (int i = startIndex; i < array.length; i++) {
            temp = array[i];
            if (temp < smallest) {
                smallest = temp;
                smallestIndex = i;
            }
        }

        return smallestIndex;

    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if (temp < smallest) {
                smallest = temp;
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int val1 = array[index1];
        int val2 = array[index2];
        array[index1] = val2;
        array[index2] = val1;
    }

}
