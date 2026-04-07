import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String day = br.readLine();
int count = 0;
String[] cars = br.readLine().split(" ");  // 또는 StringTokenizer 사용
for(int i=0; i<5; i++){
    String car = cars[i];  // 배열 사용
    if(car.equals(day.substring(day.length()-1))){
        count++;
    }
}
         System.out.println(count);
    }
}