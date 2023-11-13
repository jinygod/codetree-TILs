import java.util.Scanner;

public class Main {
    public static int[] date = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int[] dateL = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeapYear(int y){
        if(y % 4 == 0){
            return true;
        }
        if(y % 4 == 0 && y % 100 == 0 && y % 400 != 0){
            return false;
        }
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0){
            return true;
        }
        return false;
    }

    public static String weather(int y, int m, int d){
        if(isLeapYear(y)){
            if(m == 3 || m == 4 || m == 5 && d <= dateL[m]){
                return "Spring";
            }
            else if(m == 6 || m == 7 || m == 8 && d <= dateL[m]){
                return "Summer";
            }
            else if(m == 9 || m == 10 || m == 11 && d <= dateL[m]){
                return "Fall";
            }
            else if((m == 12 || m == 1 || m == 2) && d <= dateL[m]){
                return "Winter";
            }
            else{
                return "-1";
            }
        }
        else{
            if(m == 3 || m == 4 || m == 5 && d <= date[m]){
                return "Spring";
            }
            else if(m == 6 || m == 7 || m == 8 && d <= date[m]){
                return "Summer";
            }
            else if((m == 9 || m == 10 || m == 11) && d <= date[m]){
                return "Fall";
            }
            else if((m == 12 || m == 1 || m == 2) && d <= date[m]){
                return "Winter";
            }
            else{
                return "-1";
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(weather(y,m,d));
    }
}