
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int i: array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallestIndex = i;
                smallest = array[i];
            }
        }
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        System.out.println(array);
        
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(array);
        }
    }

}
