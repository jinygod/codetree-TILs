import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int checkpoint = 0;

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                checkpoint = i;
                break;
            }
        }

        System.out.print(arr[checkpoint-3] + arr[checkpoint -2] + arr[checkpoint -1]);
    }
}