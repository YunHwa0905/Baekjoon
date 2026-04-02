import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum = sc.nextInt();
        int minus = sc.nextInt();
        
        if((sum + minus) % 2 != 0 || sum < minus){
            System.out.println(-1);
        }else{
            int a = (sum + minus) / 2;  // 큰 점수
            int b = (sum - minus) / 2;  // 작은 점수
            System.out.println(a + " " + b);
        }
    }
}