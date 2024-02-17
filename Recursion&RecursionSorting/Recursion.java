

public class Recursion {

    public static void main(String[] args) {

        walk(5);
        System.out.println("7! = "+factorial(7));
        System.out.println("2^8 = "+power(2, 8));
    }


    private static void walk(int steps) {
        
        if(steps < 1) return; //Base case
        System.out.println("You take a step!");
        walk(steps - 1); //Recursive call (decrement the steps by 1)
        //You are adding to the call stack until the base case is reached 
        // Ex. main() -> walk(5) -> walk(4) -> walk(3) -> walk(2) -> walk(1) -> walk(0)
        //Remember stacks are LIFO (Last In First Out)
    }

    private static int factorial(int num) {
        if(num < 1) return 1; //Base case
        return num * factorial(num - 1); //Recursive call (decrement the number by 1)
    }

    
    private static int power(int base, int exponent) {
        if(exponent < 1) return 1; //Base case

        return base * power(base, exponent - 1); //Recursive call (decrement the exponent by 1)
    }

    
}
