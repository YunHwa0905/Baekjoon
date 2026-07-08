class Solution {
    public String solution(String my_string, int m, int c) {
        char[] arr = my_string.toCharArray();
        String answer = "";
        
        for(int i=c; i<=my_string.length(); i+=m){
            answer += arr[i-1];
        }
        
        
        return answer;
    }
}