import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2*n];
        int[] group = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < group.length; i++){
            group[i] = arr[i] + arr[arr.length - i - 1];
        }

        Arrays.sort(group);

        System.out.print(group[n - 1]);
    }
}