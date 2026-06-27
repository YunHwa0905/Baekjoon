import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            al.add(arr[i]);
        }
        
        for(int i=0; i<delete_list.length; i++){
            al.remove(Integer.valueOf(delete_list[i]));
        }
        int[] answer = new int[al.size()];
        
        for(int i=0; i<al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}