import java.util.Scanner;

public class greaterno {
    public static int getGreater(int a, int b){
        if(a>b){
            return a;

        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater number is: " + getGreater(a, b));
        sc.close();
    }
}
