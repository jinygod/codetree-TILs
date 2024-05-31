import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int[] countArr = new int[9];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            countArr[num[i] - 1]++;
        }

        for(int i = 0; i < countArr.length; i++){
            System.out.println(countArr[i]);
        }
    }
}