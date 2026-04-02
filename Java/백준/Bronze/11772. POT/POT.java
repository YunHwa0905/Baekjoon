import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            int p = num / 10;
            int multi = num%10;
            
            result += (int)Math.pow(p,multi);
        }
        System.out.println(result);
    }
}