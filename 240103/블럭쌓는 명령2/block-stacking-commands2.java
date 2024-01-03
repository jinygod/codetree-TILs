import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int K = sc.nextInt();
            int max = 0;

        for(int i = 0; i < K; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <= b; j++){
                arr[j] += 1;
                if(arr[j] >= max){
                    max = arr[j];
                }
            }
        }

        System.out.print(max);
    }
}