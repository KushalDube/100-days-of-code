//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int isPalin(int n){
	    int num=n, pal=0, rem;
	    while(n!=0){
	        rem=n%10;
	        pal=pal*10+rem;
	        n=n/10;
	    }
	    if(num==pal){
	        return 1;
	    } else {
	        return 0;
	    }
	}
	
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0; i<n; i++){
                      if (isPalin(a[i])==0){
                          return 0;
                      }
                  }
                  return 1;
           }
}
