
public class Quicksort {
    
    public static void main(String[] args) {
        
        int[] arr = {5, 3, 7, 6, 2, 8, 4, 1};

        quicksort(arr, 0, arr.length - 1); //Sort the array

        for(int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static void quicksort(int[] array, int start, int end) {
        if (end <= start) return; //Base case

        int pivot = partition(array, start, end); //Partition the array and get the pivot index
        quicksort(array, start, pivot - 1); //Sort the left side of the array
        quicksort(array, pivot + 1, end); //Sort the right side of the array

    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end]; //Choose the last element as the pivot
        int i = start - 1; //Index of the smaller element

        for(int j = start; j <= end - 1; j++){ //Loop through the array
            if(array[j] < pivot){ //If the current element is less than the pivot
                i++; //Increment the index of the smaller element
                int temp = array[i]; //Swap the elements
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++; //Increment the index of the smaller element
        int temp = array[i]; //Swap the pivot with the element at the index of the smaller element
        array[i] = array[end]; 
        array[end] = temp;

        return i; //Return the index of the pivot

    }

}
