//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int out=n;
        int count=1;
        for (int j=0; j<n-1; j++){
            if (array[j]==count){
                count++;
            }else{
                out=count;
                break;
            }
        }
        return out;
    }
    
}


// class Solution {
//     int MissingNumber(int array[], int n) {
//         // Your Code Here
//         int a=1,num=0;
//         while (a<n){
//         for (int i=0; i<n-1; i++){
//             if (array[i]!=a){
//                 num=a;
//             }
//             a++;
//         }
//         }
//         return num;
//     }
// }
