import java.util.Scanner;

class account{
    String id;
    int level;

    public account(){
        this.id = "codetree";
        this.level = 10;
    }
    public account(String id, int level){
        this.id = id;
        this.level = level;
    }
};

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        account account1 = new account();
        account account2 = new account(id, level);

        System.out.println("user " + account1.id + " lv " + account1.level);
        System.out.println("user " + account2.id + " lv " + account2.level);
    }
}