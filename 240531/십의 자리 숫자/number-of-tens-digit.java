import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[100];
        int[] countArr = new int[9];
        int leng = 0;

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
            if(input[i] == 0){
                leng = i;
                break;
            }
        }

        for(int i = 0; i < leng; i++){
            if(input[i] < 10){
                continue;
            }
            countArr[(input[i] / 10)-1]++;
        }

        for(int i = 1; i <= countArr.length; i++){
            System.out.println(i + " - " + countArr[i - 1]);
        }
    }
}