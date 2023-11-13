import java.util.Scanner;

public class Main {
    public static int[] date = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public static boolean isExist(int M, int D){
        if(M > 12){
            return false;
        }
        if(D <= date[M]){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isExist(M,D)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }


    }
}