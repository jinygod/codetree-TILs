import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        // 블럭 쌓기 명령
        int[] nCnt = new int[N + 1];

        for (int i = 0; i < K; i++) {
            int Ai = sc.nextInt();
            int Bi = sc.nextInt();
            nCnt[Ai]++;
            if (Bi + 1 <= N) {
                nCnt[Bi + 1]--;
            }
        }
        
        // Prefix sum을 이용하여 실제 각 칸에 쌓인 블럭 수 계산
        for (int i = 1; i <= N; i++) {
            nCnt[i] += nCnt[i - 1];
        }

        // 첫 번째 칸부터 N번째 칸까지의 블럭 수를 저장할 배열
        int[] blockCounts = new int[N];
        for (int i = 0; i < N; i++) {
            blockCounts[i] = nCnt[i + 1];
        }

        // 정렬
        Arrays.sort(blockCounts);

        // 가운데 값 출력
        System.out.println(blockCounts[N / 2]);
    }
}