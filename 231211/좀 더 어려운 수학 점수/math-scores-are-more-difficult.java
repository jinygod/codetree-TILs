import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Amath = sc.nextInt();
        int AEng = sc.nextInt();

        int Bmath = sc.nextInt();
        int BEng = sc.nextInt();

        
        if(Amath > Bmath){
            System.out.print("A");
        }
        else if(Amath == Bmath){
            if(AEng > BEng){
                System.out.print("A");
            }
            else{
                System.out.print("B");
            }
        }
        else{
            System.out.print("B");
        }
        
    }
}