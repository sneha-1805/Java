import java.util.*;
public class functionmul {
    public static int calculateMul(int a, int b){
       int mul=a*b;
        return mul;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateMul(a, b);
        System.out.println("multiply of 2 number is :" + mul);
        sc.close();
    }
}
