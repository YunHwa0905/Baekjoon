import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        
        System.out.println("Gnomes:");
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            
            for(int j=0; j<3; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            if(arr[0]>arr[1]){
                if(arr[1]>arr[2]){
                    System.out.println("Ordered");
                }else{
                    System.out.println("Unordered");
                }
            }else{
                if(arr[1]<arr[2]){
                    System.out.println("Ordered");
                }else{
                    System.out.println("Unordered");
                }
            }
        }
    }
}