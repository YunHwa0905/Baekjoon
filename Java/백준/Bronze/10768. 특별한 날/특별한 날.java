import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int mon = sc.nextInt();
        int day = sc.nextInt();
        
        if(mon<2){
            System.out.println("Before");
        }else if(mon == 2){
            if(day < 18){
                System.out.println("Before");
            }else if(day == 18){
                System.out.println("Special");
            }else{
                System.out.println("After");
            }
        }else{
            System.out.println("After");
        }
    }
}