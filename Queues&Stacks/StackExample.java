import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // What is a stack?
        // - LIFO data structure (Last-In, First-Out)
        // - Stores objects into a sort of "vertical tower"
        // - Push() to add to the top
        // - Pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        

        stack.push("Minecraft");
        stack.push("Terraria");
        stack.push("Stardew Valley");
        stack.push("Hollow Knight");
        stack.push("Celeste");

        //System.out.println(stack.empty()); 

        //String myFavGame = stack.pop(); // Celeste
        System.out.println(stack.peek()); // Celeste (top of the stack)
        

        System.out.println(stack.search("Celeste")); // 1
        //System.out.println(myFavGame);

        //Example of stack running out of memory
        // for(int i = 0; i < 1000000000; i++) {
        //     stack.push("Minecraft");
        // }
    }
}
