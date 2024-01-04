import java.util.Scanner;

public class Main{
    public static int n;
    public static int[][] grid = new int[20][20];

    public static int getNumOfGold(int rowS, int colS, int rowE, int colE){
        int numOfGold = 0;

        for(int row = rowS; row <= rowE; row++){
            for(int col = colS; col <= colE; col++){
                numOfGold += grid[row][col];
            }
        }

        return numOfGold;
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int maxGold = 0;

            n = sc.nextInt();
            for(int row = 0; row < n; row++){
                for(int col = 0; col < n; col++){
                    grid[row][col] = sc.nextInt();
                }
            }

            for(int row = 0; row < n; row++){
                for(int col = 0; col < n; col++){
                    if(col + 2 >= n || row + 2 >= n){
                        continue;
                    }

                    int Gold = getNumOfGold(row, col, row+2, col+2);
                    maxGold = Math.max(maxGold, Gold);
                }
            }

            System.out.print(maxGold);
        }
}