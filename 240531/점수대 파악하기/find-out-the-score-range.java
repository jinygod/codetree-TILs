import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[100];
        int leng = 0;
        int[] countArr = new int[10];

        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
            if(score[i] == 0){
                leng = i;
                break;
            }
        }

        for(int i = 0; i < leng; i++){
            if(score[i] == 100){
                countArr[0]++;
            }
            else if(score[i] < 10){
                continue;
            }
            else{
                 countArr[Math.abs((score[i] / 10 * 10 - 100) / 10)]++;
            }

        }

        for(int i = 0; i < countArr.length; i++){
            System.out.println(Math.abs(i * 10 - 100) + " - " + countArr[i]);
        }

    }
}