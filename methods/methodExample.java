package methods;

public class methodExample {
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }
    public static void main(String[] args){
        methodExample mExample = new methodExample();
        System.out.println(mExample.add(10, 12));
        System.out.println(mExample.subtract(100, 78));
        System.out.println(mExample.multiply(13, 17));
        System.out.println(mExample.divide(20, 3));
    }
}
