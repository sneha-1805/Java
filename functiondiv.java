import java.util.Scanner;

public class functiondiv {
    public static int calculateDiv(int a, int b){
        int div = a/b;
        return div;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int div = calculateDiv(a, b);
        System.out.println("Divide : " +div);
        sc.close();

    }
}
