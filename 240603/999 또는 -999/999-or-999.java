import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int flag = 0;

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == -1 * 999 || arr[i] == 999){
                flag = i;
                break;
            }
        }

        int[] newArr = new int[flag];
        for(int i = 0; i < flag; i++){
            newArr[i] = arr[i];
        }

        int max = -1000;
        int min = 1000;

        for(int i = 0; i < flag; i++){
            if(newArr[i] > max){
                max = newArr[i];
            }
        }

        
        for(int i = 0; i < flag; i++){
            if(newArr[i] < min){
                min = newArr[i];
            }
        }

        System.out.print(max + " " + min);
    }
}