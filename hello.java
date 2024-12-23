import java.util.Scanner;

class Hello {
    public static void main(String args[]) {

 int num1 = 20;
   int num2 = 30;
   
   if(num1==num2){
      System.out.println("the numbers are equal");
   } else {
      System.out.println("not equal");
   }
    String f1 = new String("apple");
   String f2 = new String("apple");

   System.out.println(f1.equals(f2));

   Scanner scan = new Scanner(System.in);
   String Rcb = scan.nextLine();

   if(Rcb.equals("win")){
      System.out.println("Ee sala cup namdhey");
   } else {
      System.out.println("cup illa");
   }

   int mark = scan.nextInt();

   if(mark%3==0 || mark%5==0){
      System.out.println("divide by 3 and 5");
   } else {
      System.out.println("nor divisible by both");
   }

 }
  
  
}

