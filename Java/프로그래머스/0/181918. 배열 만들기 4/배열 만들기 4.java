import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            while(!al.isEmpty() && al.get(al.size()-1) >= arr[i]){
                al.remove(al.size()-1);
            }
            al.add(arr[i]);
        }
        int[] stk = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            stk[i] = al.get(i);
        }
        return stk;
    }
}