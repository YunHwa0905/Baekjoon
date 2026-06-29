import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s+l)); ;
            
            if(num > k){
                al.add(num);
            }
        }
        int[] answer = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}