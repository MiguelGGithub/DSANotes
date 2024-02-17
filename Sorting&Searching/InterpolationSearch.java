public class InterpolationSearch {

    public static void main(String[] args) {
        

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1028, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576};
        int index = interpolationSearch(array, 32768);
        

        if(index != -1){
            System.out.println("Element found at index: "+index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;
        int counter = 1;

        while(value >= array[low] && value <= array[high] && low <= high){
            int probe = (high - low) * (value - array[low]) / (array[high] - array[low]) + low;
            counter++;
            

            if(array[probe] == value){
                System.out.println("Probe Steps: "+counter);
                return probe;
            } else if(array[probe] < value){
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
    
}
