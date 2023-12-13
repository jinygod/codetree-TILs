import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public final static int month_28 = 2;
    public final static Integer[] month_30 = {4, 6, 9, 11};
    public final static Integer[] month_31 = {1, 3, 5, 7, 8, 10, 12};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (Arrays.asList(month_30).contains(month)) {
            System.out.print(30);
        } else if (Arrays.asList(month_31).contains(month)) {
            System.out.print(31);
        } else {
            System.out.print(28);
        }
        
    }
}