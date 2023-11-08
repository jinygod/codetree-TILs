import java.util.*;

class Goods{
    String name;
    int code;

    public Goods(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        Goods goods1 = new Goods("codetree", 50);
        Goods goods2 = new Goods(name, code);

        System.out.printf("product %d is %s\n", goods1.code, goods1.name);
        System.out.printf("product %d is %s\n", goods2.code, goods2.name);

    }
}