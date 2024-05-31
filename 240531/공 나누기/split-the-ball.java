import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 공의 개수
        int k = scanner.nextInt(); // 박스의 개수

        if (n < k || n % k != 0) {
            // 공을 나눠 담을 수 없는 경우
            System.out.println(-1);
        } else {
            // 각 박스에 담길 최대 공의 개수 계산
            int maxPerBox = n / k;

            // 가장 많이 담긴 박스와 가장 적게 담긴 박스의 공의 개수 차이 계산
            int maxDifference = (maxPerBox + 1) * (n % k); // 가장 적게 담긴 박스에 공을 하나씩 추가한 경우
            int minDifference = maxPerBox * (k - (n % k)); // 가장 많이 담긴 박스에서 공을 하나씩 빼는 경우

            // 최소 공의 개수 차이 출력
            System.out.println(Math.min(maxDifference, minDifference));
        }
    }
}