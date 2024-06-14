import java.util.Scanner;

class A007 {
    String code;
    char point;
    int time;

    public A007(String code, char point, int time){
        this.code = code;
        this.point = point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        A007 a008 = new A007(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.println("secret code : " + a008.code);
        System.out.println("meeting point : " + a008.point);
        System.out.println("time : " + a008.time);


    }
}