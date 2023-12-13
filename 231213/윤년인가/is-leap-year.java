import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        String answer = "";

        if(y % 4 == 0){
            if(y % 100 == 0 && y % 400 == 0){
                answer = "true";
            }
            else if(y % 100 == 0){
                answer = "false";
            }
            else{
                answer = "true";
            }
        }
        else{
            answer = "false";
        }
        System.out.print(answer);
    }
}