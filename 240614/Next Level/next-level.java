import java.util.*;

class Champ{
    String id;
    int level;

    public Champ(String id, int level){
        this.id = id;
        this.level = level;
    }

    public Champ(){
        this.id = "codetree";
        this.level = 10;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Champ champ1 = new Champ();
        Champ champ2 = new Champ(sc.next(), sc.nextInt());

        System.out.println("user " + champ1.id + " lv " + champ1.level);
        System.out.print("user " + champ2.id + " lv " + champ2.level);
    }
}