public class SelectionSort {
    public static void main(String[] args) {

        int array[] = { 64, 25, 12, 22, 11 };

        selectionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
        
    }

    private static void selectionSort(int[] array) {
        
        int counter = 0;
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]){
                    min = j;
                }
                counter++;
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        System.out.println("Iterations: " + counter);
    }

    
}
