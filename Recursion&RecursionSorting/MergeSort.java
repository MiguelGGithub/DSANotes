
public class MergeSort {
    
    public static void main(String[] args) {
        
        int[] array = {5, 3, 8, 6, 2, 7, 1, 4};

        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        
        int length = array.length; 
        if(length <= 1) return; //Base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //Index for leftArray
        int j = 0; //Index for rightArray

        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //Indexes for array, leftArray, and rightArray

        //Check conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                l++;
                i++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            r++;
            i++;
        }

    }
}
