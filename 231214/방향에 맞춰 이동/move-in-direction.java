import java.util.Scanner;

public class Main {
    public static int x = 0;
    public static int y = 0;


    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            int dir;
            if(direction == 'E'){
                dir = 0;
            }
            else if(direction == 'W'){
                dir = 1;
            }
            else if(direction == 'S'){
                dir = 2;
            }
            else{
                dir = 3;
            }

            x += dx[dir] * distance;
            y += dy[dir] * distance;

        }
        System.out.print(x + " " + y);
    }
}