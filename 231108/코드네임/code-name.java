import java.util.Scanner;

class Agent{
    String id;
    int score;

    public Agent(String id, int score){
        this.id = id;
        this.score = score;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++){
            agents[i] = new Agent(sc.next(), sc.nextInt());
        }

        System.out.print(agents[0].id + " " + agents[0].score);

    }
}