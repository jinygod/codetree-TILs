import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println((int)a+(int)b+(int)c);
        // System.out.println("(%.0f+%.0f+%.0f)/3\n", a,b,c);
    }
}