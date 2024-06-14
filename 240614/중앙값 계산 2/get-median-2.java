import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();


        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            arr.add(nums[i]);

            if(i % 2 == 0){
                Collections.sort(arr);
                System.out.print(arr.get(i/2) + " ");
            }
        }

        
    }
}