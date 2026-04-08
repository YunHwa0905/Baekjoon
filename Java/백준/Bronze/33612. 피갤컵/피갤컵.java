import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int totalMon = 8 + (N - 1) * 7;
        
        int year = 2024 + (totalMon - 1) / 12;
        int month = (totalMon - 1) % 12 + 1;
        
        System.out.println(year + " " + month);
    }
}