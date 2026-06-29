import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i=0; i<queries.length; i++){
            int from = queries[i][0];
            int to = queries[i][1];
            
            String sub =answer.substring(from, to+1);
            String reversedSub = new StringBuilder(sub).reverse().toString();
            
            answer = answer.substring(0, from) + reversedSub + answer.substring(to + 1);
        }
        
        return answer;
    }
}