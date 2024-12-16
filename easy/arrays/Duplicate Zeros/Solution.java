class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
            
                for(int j=i;j<arr.length-1;j++){
                    arr = swap(arr,i,j+1);
                }
                arr[i] = 0;
                i++;
                
                
            }
        }
    }
    
    int[] swap(int arr[],int i,int j){
        int t = arr[j];
        arr[j]=arr[i];
        arr[i] = t;
        return arr;
    }
}
