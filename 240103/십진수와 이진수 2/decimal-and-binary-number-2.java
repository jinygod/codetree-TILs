import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int temp = 0;

        for(int i = 0; i < N.length(); i++){
            temp = temp * 2 + (N.charAt(i) - '0');
        }

        int temp2 = temp * 17;

        int[] digit = new int[20];
        int cnt = 0;

        while(true){
            if(temp2 < 2){
                digit[cnt++] = temp2;
                break;
            }

            digit[cnt++] = temp2 % 2;
            temp2 /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(digit[i]);
        }
    }
}