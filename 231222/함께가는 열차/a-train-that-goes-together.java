import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int train = sc.nextInt();
        int[] position = new int[train];
        int[] velocity = new int[train];

        for(int i = 0; i < train; i++){
            position[i] = sc.nextInt();
            velocity[i] = sc.nextInt();
        }

        // 초기화
        int connectedTrains = 1; // 첫 번째 열차 덩어리는 항상 존재
        int leaderPosition = position[train - 1];
        int leaderVelocity = velocity[train - 1];

        // 뒤에서부터 역순으로 열차를 검사
        for (int i = train - 2; i >= 0; i--) {
            int currentPosition = position[i];
            int currentVelocity = velocity[i];

            // 현재 열차가 현재 리더보다 왼쪽에 위치하면 새로운 리더로 업데이트
            if (currentPosition < leaderPosition) {
                leaderPosition = currentPosition;
                leaderVelocity = currentVelocity;
            }

            // 현재 리더의 속도로 현재 열차가 따라가는 경우
            if (currentVelocity >= leaderVelocity) {
                connectedTrains++;
            }
        }

        System.out.println(connectedTrains);
    }
}