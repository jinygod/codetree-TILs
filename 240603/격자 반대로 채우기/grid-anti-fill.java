import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][n];
        boolean b=true;
        int cnt=1;

        for(int i=n-1;i>=0;i--){
            if(b==true){
                for(int j=n-1;j>=0;j--){
                    a[j][i]=cnt;
                    cnt++;
                }
                b=false;
            }else{
                for(int j=0;j<n;j++){
                    a[j][i]=cnt;
                    cnt++;
                }
                b=true;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }
}