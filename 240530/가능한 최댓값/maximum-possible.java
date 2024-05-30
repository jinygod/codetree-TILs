import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        int[][][] dp = new int[n + 1][16][16];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 15; j++) {
                for (int k = 0; k <= 15; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - 1][k] + left[i - 1]);
                    }
                    if (k > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j][k - 1] + right[i - 1]);
                    }
                }
            }
        }

        System.out.println(dp[n][15][15]);
    }
}