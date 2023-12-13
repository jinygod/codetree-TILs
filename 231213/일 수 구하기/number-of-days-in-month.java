import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year % 2 == 0){
            if(year == 2){
                System.out.print(28);
            }
            else{
                System.out.print(30);
            }
        }
        else{
            System.out.print(31);
        }
    }
}