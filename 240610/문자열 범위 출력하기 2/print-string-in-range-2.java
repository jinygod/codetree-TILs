import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        char[] charArr = str.toCharArray();

        for(int i = 0; i < n; i++){
            System.out.print(charArr[str.length()-i - 1]);
            if(str.length() > n){
                break;
            }
        }
    }
}