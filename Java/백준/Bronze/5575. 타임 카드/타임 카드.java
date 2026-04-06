import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            
            int total = h*3600+m*60+s;
            int total2 = h2*3600+m2*60+s2;
            
            int result_h = (total2-total)/3600;
            int result_m = ((total2-total)%3600)/60;
            int result_s = ((total2-total)%3600)%60;
            
            System.out.println(result_h + " " + result_m + " " + result_s);
        }
    }
}