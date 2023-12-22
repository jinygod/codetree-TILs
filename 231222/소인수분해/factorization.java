import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n == 1){
            System.out.print(-1);
        }
        else{
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    System.out.println(i);
                    n /= i;
                    if(isPrime(n)){
                        System.out.print(n);
                    }
                }
            }
        }
    }
}