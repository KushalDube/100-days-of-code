class Solution {
    public String frequencySort(String s) {
        
        int arr[][]=new int[300][2];
        for(int i=0; i<300; i++){
            arr[i][1]=i;
        }

        char str[]=s.toCharArray();

        for (char c:str){
            arr[(int)c][0]++;
        }

        Arrays.sort(arr, (a,b) -> (b[0]-a[0]));
        int i=0;
        for(int[] a:arr){
            while(a[0]>0){
                a[0]--;
                str[i++]=(char)(a[1]);
            }
        }
        // for(char c:str){
        //     System.out.print(c+", ");
        // }
        // Arrays.sort(str);
        String nstr=new String(str);

        return nstr;
    }
}