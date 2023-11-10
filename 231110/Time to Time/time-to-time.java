import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int elapsedtime = 0;
        int hour = a;
        int min = b;

        while(true){
        if(hour == c && min == d){
            break;
        }
        
        elapsedtime++;
        min++;

            if(min == 60){
                hour++;
                min = 0;
            }
        }

        System.out.print(elapsedtime);

    }
}