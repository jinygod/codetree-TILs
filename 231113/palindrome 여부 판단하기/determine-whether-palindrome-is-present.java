import java.util.Scanner;

public class Main {
    public static String palindrome(String s){
        String newS = "";
        for(int i = 0; i < s.length(); i++){
            newS += s.indexOf(s.length() - 1 + i);
        }

        return newS;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        String B = palindrome(A);

        if(B.equals(A)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}