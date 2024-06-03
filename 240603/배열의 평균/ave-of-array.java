import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        float rSum = 0;
        float cSum = 0;
        float tSum = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                rSum += arr[i][j];
            }
           System.out.print(rSum / 4);
            System.out.print(" ");
            rSum = 0;
        }

        System.out.println();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                cSum += arr[j][i];
            }
           System.out.print(cSum / 2);
            System.out.print(" ");
            cSum = 0;
        }

        System.out.println();

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                tSum += arr[i][j];
                
            }
        }
        System.out.printf("%.1f", (tSum / 8));
    }
}