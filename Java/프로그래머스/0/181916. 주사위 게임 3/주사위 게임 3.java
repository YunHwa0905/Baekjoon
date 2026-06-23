class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] count = new int[7];
        
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        
        int max = 0;
        for(int i=1; i<=6; i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        
        int maxCount = 0;
        for(int i=1; i<=6; i++){
            if(count[i] == max){
                maxCount++;
            }
        }
        
        if(max == 4){
            answer = 1111 * a;
        }else if(max == 3){
            int triple = 0;  
            int single = 0;
            
            for(int i=1; i<=6; i++){
                if(count[i] == 3){
                    triple = i;
                }
                if(count[i] == 1){
                    single = i;
                }
            }
            
            answer = (10*triple+single)*(10*triple+single);
            
        }else if(max == 2 && maxCount == 2){
            int p = 0, q = 0;
            int found = 0;

            for(int i=1; i<=6; i++){
                if(count[i] == 2){
                    if(found == 0){
                        p = i;
                        found++;
                    } else {
                        q = i;
                    }
                }
            }

            answer = (p+q) * Math.abs(p-q);
        }else if(max == 2 && maxCount == 1){
            int p = 0, q = 0, r = 0;
            int found = 0; 

            for(int i=1; i<=6; i++){
                if(count[i] == 2){
                    p = i;
                } else if(count[i] == 1){
                    if(found == 0){
                        q = i;
                        found++;
                    } else {
                        r = i;
                    }
                }
            }

            answer = q * r;
        }else{
            answer = Math.min(Math.min(a,b),Math.min(c,d));
        }
        
        return answer;
    }
}