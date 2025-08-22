import java.util.*;
public class PrintNumber{
         public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("you entered: " +n);
            sc.close();
         }
}