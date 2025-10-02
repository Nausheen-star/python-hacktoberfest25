class Solution {
    public int minJumps(int[] arr) {
         int n = arr.length;
    if(arr[0] == 0) return -1;
    
    int maxR = 0;
    int currR = 0;
    int jump =0;
    for(int i=0; i<n; i++){
        maxR = Math.max(maxR, i+arr[i]);
        
        if(maxR >= n-1){
            return jump + 1;
            
        }
     if(i == currR){
            if( i == maxR) return -1;
     
        
        else {
            jump++;
            currR = maxR;
        }
        
    }
    }
    return -1;
    }
}
