import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] words = new String[n];
        ArrayList<String> group = new ArrayList<>();

        for(int i = 0; i < n; i++){
            words[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            if(words[i].startsWith(t)){
                group.add(words[i]);
            }
        }

        Collections.sort(group);

        System.out.print(group.get(k-1));

    }
}