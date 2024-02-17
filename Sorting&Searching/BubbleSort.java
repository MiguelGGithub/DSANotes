public class BubbleSort {
    public static void main(String[] args) {
        
        int[] array = {5, 8, 3, 6, 2, 1, 9, 4, 7, 19, 18, 2, 21};

        bubbleSort(array);

        for(int i : array){
            System.out.print(i+" ");
        }

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("ArrayList: \t" + elapsedTime+ " ns");

    }

    public static void bubbleSort(int array[]){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                counter++;

            }
        }
        System.out.println("Steps: " + counter);
    }
}
