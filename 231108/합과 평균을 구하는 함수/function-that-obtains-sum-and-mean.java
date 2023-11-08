import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        long answer = Math.round(a)+Math.round(b)+Math.round(c);

        System.out.println(answer);
        System.out.println(Math.round(answer/3));
    }
}