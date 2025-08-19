import java.util.Scanner;

public class sumofallevenno {
    public static int calculateSum(int n){
    int sum = 0;
    int even = 0;
    for(int i = 1; i<=n;i++){
        sum +=even;
        even +=2;

    }
    return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = calculateSum(n);

        System.out.println("Sum of 1st no " + n + "odd number is " + result );
        sc.close();
    }
}


