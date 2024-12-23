import java.util.Scanner;
public class Mobile {
    // Static methods
    static void iphone() {
        System.out.println("This is iPhone.");
    }

    static void android() {
        System.out.println("These are Androids.");
    }

    static int add(int a, int b) {
        int sum = a + b; 
        return sum; 
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Mobile Shop!");

        // Call static methods
        iphone();
        android();

        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = add(a, b); 
        System.out.println("The sum of two numbers is: " + sum);
    }
}
