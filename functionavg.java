import java.util.*;
public class functionavg {
    public static float calculateAvg(float a, float b,float c){
        float avg = (a+b+c)/3;
      return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = calculateAvg(a, b, c);
        System.out.println("Average :" + avg);
        sc.close();
}
}
