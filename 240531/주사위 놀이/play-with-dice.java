import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dice = new int[10];
        int[] countArr = new int[6];

        for(int i = 0; i < dice.length; i++){
            dice[i] = sc.nextInt();
        }

        for(int i = 0; i < dice.length; i++){
            countArr[dice[i] - 1]++;
        }

        for(int i = 1; i < countArr.length+1; i++){
            System.out.println(i + " - " + countArr[i-1]);
        }

    }
}