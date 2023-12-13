import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first_cold = sc.next();
        int first_tem = sc.nextInt();
        String second_cold = sc.next();
        int second_tem = sc.nextInt();
        String third_cold = sc.next();
        int third_tem = sc.nextInt();

        int count = 0;

        if(first_cold.equals("Y") && first_tem >= 37){
            count++;
        }
        if(second_cold.equals("Y") && second_tem >= 37){
            count++;
        }
        if(third_cold.equals("Y") && third_tem >= 37){
            count++;
        }

        if(count >= 2){
            System.out.print("E");
        }
        else{
            System.out.print("N");
        }
    }
}