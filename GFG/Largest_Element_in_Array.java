//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n)
    {
        int l=0;
        for(int i=0; i<n; i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }
}
