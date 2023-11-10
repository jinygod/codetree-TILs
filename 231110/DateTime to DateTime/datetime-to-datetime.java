import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int date = 11;
        int hour = 11;
        int min = 11;
        int elapsedtime = 0;
        while(true){
        if(c < 11){
            if(b < 11){
                if(a < 11){
                    elapsedtime = -1;
                    break;
                }
            }
        }
        if(date == a && hour == b && min == c){
            break;
        }

        elapsedtime++;
        min++;

            if(min == 60){
                hour++;
                min = 0;
            }
            if(hour == 24){
                date++;
                hour = 0;
            }
        }

        System.out.print(elapsedtime);
    }
}