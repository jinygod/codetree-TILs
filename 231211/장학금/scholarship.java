import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n > 90){
            if(m >= 95){
                System.out.print(100000);
            }
            else if(m >= 90){
                System.out.print(50000);
            }
        }
        else{
            System.out.print(0);
        }

    }
}