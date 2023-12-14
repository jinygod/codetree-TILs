import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫번째 줄 입력 받기
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] second = new int[n];
        // 두번째 줄 입력 받기
        for(int i = 0; i < n; i++){
            second[i] = sc.nextInt();
        }

        // 세번째 줄부터 입력 받기
        for(int i = 0; i < q; i++){
            // 질문 입력받기 (1,2,3)
            int question = sc.nextInt();
            // 질문이 1일 경우
            if(question == 1){
                int first_num = sc.nextInt();
                System.out.print(second[first_num -1 ]);
            }
            // 질문이 2일 경우
            else if(question == 2){
                int second_num = sc.nextInt();
                int index = 0;
                for(int j = n-1; j >= 0; j--){
                    if(second_num == second[j]){
                        index = j+1;
                    }
                }
                System.out.print(index);
            }
            // 질문이 3일 경우
            else{
                int a = sc.nextInt();
                int b = sc.nextInt();

                for(int k = a; k <= b; k++){
                    System.out.print(second[k-1] + " ");
                }
            }
            System.out.println();
        }
    }
}