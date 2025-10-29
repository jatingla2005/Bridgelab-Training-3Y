import java.util.Scanner;
import java.util.Arrays;
public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                if(count == factors.length) {
                    factors = Arrays.copyOf(factors, factors.length * 2);
                }
                factors[count++] = i;
            }
        }
        System.out.print("Factors are: ");
        for(int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}