import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N + 2];
        int[] B = new int[N + 2];
        int[] C = new int[N + 2];

        // 개발자의 위치 입력
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        // 가상의 위치 추가
        A[0] = -1000;
        A[N + 1] = 2000;

        // 위치 정렬
        Arrays.sort(A, 1, N + 1);

        // 공을 주고받을 사람 정하기
        for (int i = N; i >= 1; i--) {
            int nxt = (A[i] - A[i - 1]) <= (A[i + 1] - A[i]) ? i - 1 : i + 1;
            B[i] = nxt;
            C[nxt]++;
        }

        int Ans = 0;

        // 최소 공 개수 계산
        for (int i = 1; i <= N; i++) {
            if (C[i] == 0 || (B[B[i]] == i && C[i] == 1 && C[B[i]] == 1 && i < B[i])) {
                Ans++;
            }
        }

        System.out.println(Ans);
    }
}