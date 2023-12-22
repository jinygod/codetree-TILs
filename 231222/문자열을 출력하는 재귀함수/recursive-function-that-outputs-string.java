import java.util.Scanner;

public class Main {
    public static String print(int n){
        System.out.println("Coding is my favorite hobby!");
        if(n > 1){
        n--;
        return print(n);
        }
        else{
            return "0";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print(n);
    }
}