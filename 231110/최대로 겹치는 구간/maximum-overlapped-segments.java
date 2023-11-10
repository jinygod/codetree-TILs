import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++){
            arr[i] += 100;
        }

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j = x1; j <= x2-1; j++){
                arr[j]++;
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print(max - 100);



    }
}