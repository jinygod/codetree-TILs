import java.util.Scanner;

public class Main {

    public static int[] arr = new int[50];

    public static void abs(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] *= -1;
            }        
        }
        return;
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        abs(arr);

        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }

    }
}