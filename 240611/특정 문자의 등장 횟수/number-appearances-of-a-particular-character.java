import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int ee = 0;
        int eb = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i,i+2).equals("ee")){
                ee++;
            }
             if(str.substring(i,i+2).equals("eb")){
                eb++;
            }  
        }

        System.out.print(ee + " " + eb);
    }
}