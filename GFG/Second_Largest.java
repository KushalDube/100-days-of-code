class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int l=arr[0],l2=-1;
        for(int i=1; i<n; i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        for(int i=1; i<n; i++){
            if(arr[i]<l && arr[i]>l2){
                l2=arr[i];
            }
        }
        return l2;
    }
}
