import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            if(n==1){
                list.add(n);
                break;
            }else{
                if(n%2==0){
                    list.add(n);
                    n /= 2;
                    
                }else{
                    list.add(n);
                    n = 3*n+1;
                    
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}