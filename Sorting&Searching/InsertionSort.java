public class InsertionSort {

    public static void main(String[] args) {
       
        int array[] = { 64, 25, 12, 22, 11 };

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }

    }

    //Explanation
    private static void insertionSort(int[] array) {
        
        for(int i = 1; i < array.length; i++){ //Start from the second element
            int temp = array[i]; //Store the current element
            int j = i - 1; //Start comparing with the previous element

            while(j >= 0 && array[j] > temp){ //If the previous element is greater than the current element
                array[j+1] = array[j]; //Move the previous element to the next position
                j--; //Move to the previous element
            }
            
            array[j+1] = temp; //Insert the current element in the correct position
        }

    }
    
}
