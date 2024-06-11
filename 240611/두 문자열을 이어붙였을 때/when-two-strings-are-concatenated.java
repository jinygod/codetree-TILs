import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String asb = A+B;
        String bsa = B+A;

        if(asb.equals(bsa)){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}