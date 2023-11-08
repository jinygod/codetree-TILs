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
        int minscore = 100;

        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++){
            agents[i] = new Agent(sc.next(), sc.nextInt());
        }


        for(int i = 0; i < 5; i++){
            if(agents[i].score < minscore){
                minscore = agents[i].score;
            }
        }

        for(int i = 0; i < 5; i++){
            if(agents[i].score == minscore){
                System.out.print(agents[i].id + " " + agents[0].score);
            }
        }


    }
}