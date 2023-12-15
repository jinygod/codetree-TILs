import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i <= n; i++) { // 시작값을 2로 수정하고 범위를 <= n으로 수정
            if (isPrime(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}