import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력 받기, 격자선언
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        // N크기의 격자 입력받기
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;

        for(int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
                if(col > 3 || row > 3){
                    continue;
                }

                if(arr[row][col] == 1){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);

        
    }
}