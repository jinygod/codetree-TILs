import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i < n; i++){
        if(isPrime(i)){
            cnt++;
        }
        }
        System.out.print(cnt);
    }
}