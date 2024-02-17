package DynamicArrays;
import java.util.ArrayList;

public class DynamicArrExample {
    public static void main(String[] args) {

        //Check dynamicarray.java for the implementation of the DynamicArray class
        
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F"); //grows the array size to 10 since capacity is at 5 ^^^

        dynamicArray.delete("F"); 
        dynamicArray.delete("E"); 
        dynamicArray.delete("D"); //Since we deleted these three, that means the array shrinks
        // because the size is now 3 and there would be a lot of wasted memory. See shrink() in DynamicArray.java


        dynamicArray.insert(0, "X"); // insert "X" at index 0
        dynamicArray.delete("A"); // delete the first occurrence of "A"
        System.out.println("C is at Index: "+dynamicArray.search("C")); //2

        System.out.println(dynamicArray);
        System.out.println("Size: "+dynamicArray.size);
        System.out.println("Capacity: "+dynamicArray.capacity);
        System.out.println("Is empty?: "+dynamicArray.isEmpty());


    }
}
