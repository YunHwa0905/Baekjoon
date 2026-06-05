class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        int[] answer = new int[sum];
        
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<= arr[i]; j++){
                answer[count++] = arr[i];
            }
        }
        
        return answer;
    }
}