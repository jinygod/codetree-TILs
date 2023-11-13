import java.util.Scanner;

public class Main {
    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        String B = reverse(A);

        if (B.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}