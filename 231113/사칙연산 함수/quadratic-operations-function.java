import java.util.Scanner;

public class Main {
    public static int calculate(int a, int c, String o){
        if(o.equals("+")){
            return a+c;
        }
        else if(o.equals("-")){
            return a-c;
        }
        else if(o.equals("*")){
            return a*c;
        }
        else if(o.equals("/")){
            return a/c;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        if(calculate(a,c,o) == -1){
            System.out.print("False");
        }else
        System.out.printf("%d %s %d = %d", a, o, c, calculate(a,c,o));
    }
}