public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {6, 5, 8, 7, 11};
System.out.println("Smallest: " + smallest(numbers));
System.out.println("Smallest Index: " + indexOfSmallest(numbers));

int[] array = {-1, 6, 9, 8, 12};
System.out.println(indexOfSmallestFrom(array, 0));
System.out.println(indexOfSmallestFrom(array, 1));
System.out.println(indexOfSmallestFrom(array, 2));


    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i: array){
            if(i < smallest){
                smallest = i;
            }
        }

        return smallest;
    }
        public static int indexOfSmallestFrom(int[] array, int startIndex){
            
        int smallest = array[startIndex];
        int smallestIndex = startIndex;
        
        int temp = 0;
        for(int i = startIndex; i<array.length ;i++){
            temp = array[i];
            if(temp < smallest){
                smallest = temp;
                smallestIndex = i;
            }
        }

        return smallestIndex;


        }
        public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;
        
        int temp = 0;
        for(int i = 0; i<array.length ;i++){
            temp = array[i];
            if(temp < smallest){
                smallest = temp;
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
