import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_age = sc.nextInt();
        String first_sex = sc.next();

        int second_age = sc.nextInt();
        String second_sex = sc.next();

        if((first_age >= 19 && first_sex.equals("M")) || (second_age >= 19 && second_sex.equals("M"))){
            System.out.print(1);
        }
        else
            System.out.print(0);
    }
}