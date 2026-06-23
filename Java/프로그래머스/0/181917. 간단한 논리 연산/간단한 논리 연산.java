class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean front = true;
        boolean back = true;
        
        if(!(x1||x2)){
            front = false;
        }
        
        if(!(x3||x4)){
           back = false;
        }
        
        if(!(front && back)){
            answer = false;
        }
        return answer;
    }
}