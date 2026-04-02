import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            int reverse = 0;
            int temp = num;
            
            // 뒤집기
            while(temp > 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
            
            // 합
            int sum = num + reverse;
            
            // 합이 회문인지 확인
            String s = String.valueOf(sum);
            boolean isPalindrome = true;
            
            for(int j = 0; j < s.length() / 2; j++) {
                if(s.charAt(j) != s.charAt(s.length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            
            if(isPalindrome) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}