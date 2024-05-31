import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] devArr = new int[n +2 ];
        int ball = 1;

        for(int i = 0; i < n; i++){
            devArr[i] = sc.nextInt();
        }

        Arrays.sort(devArr);

        for(int i = 2; i < n; i++){
            if(devArr[i + 1] - devArr[i] > devArr[i + 2] - devArr[i + 1]){
            } 
            else if(devArr[i + 1] - devArr[i] < devArr[i + 2] - devArr[i + 1]){
            //    System.out.println(devArr[i]);
                ball++;
                if(devArr[i + 1] - devArr[i] == devArr[i + 2] - devArr[i + 1]){
                    
                }
            }

        }

        System.out.print(ball);
    }
}