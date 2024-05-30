import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i ++){
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        Arrays.sort(left);
        Arrays.sort(right);

        for(int i = 0; i <= 14; i++){
            sum += left[n-i-1];
            sum += right[n-i-1];
        }

        System.out.println(sum);
    }
}