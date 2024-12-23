import java.util.Scanner;

public class code {

    // Static methods from the Mobile functionality
    static void iphone() {
        System.out.println("This is iPhone.");
    }

    static void android(int price) {
        System.out.println("These are Androids."+price);
    }

    static int div(int a, int b) {
        int div = a / b;
        return div;
    }

    // Non-static attributes and methods from the Code functionality
    String name = "";
    String level = "";
    int rating = 0;
    int score = 0;

    static void greeting() {
        System.out.println("Welcome Avinash");
    }

    public static void main(String args[]) {
        greeting();
        // Mobile functionality
        System.out.println("Welcome to Mobile Shop!");

        iphone();
        android(80000);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers to add: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int div = div(a, b);
        System.out.println("The div of two numbers is: " + div);

        // Code functionality
        code pro = new code(); // Create an object to access non-static members
        pro.name = "java";
        pro.level = "advanced";
        pro.rating = 10;
        pro.score = 10;

        System.out.println(pro.level);
        
    }
}
