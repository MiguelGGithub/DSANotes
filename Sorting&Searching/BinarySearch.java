
//import java.util.Arrays;

public class BinarySearch {

    // What is a binary search? How does it work?
    // - Search algorithm that finds the position of a target value within a SORTED array.
    // - Half the array is eliminated during each step of searching until only 1 element remains, the target value.
    // - Always begins in the middle then compares if target value is greater or less than the middle value and deletes one side of the array. This is repeated.
    // - The time complexity of binary search is O(log n).

    
    public static void main(String[] args) {
        
        int[] array = new int[1000000];
        int target = 777777; //20 Steps. linear approach would take 777777 steps
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = binarySearching(array, target);

        if(index == -1){
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index: " + index);
        }

        
    }

    private static int binarySearching(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = low+((high-low)/2);
            int value = array[middle];

            System.out.println("Middle: "+value);

            if(value < target){
                low = middle + 1;
            } else if (value > target){
                high = middle - 1;
            } else {
                return middle; // Found the value
            } 
        }
        return -1; // Value not found
    }
}
