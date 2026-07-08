class Solution {
    public String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();
        
        int left = s;
        int right = e;
        
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String answer = new String(arr);
        return answer;
    }
}