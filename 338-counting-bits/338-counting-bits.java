class Solution {
    public int[] countBits(int num) {
        
        int a[] = new int[num+1];
        
        for(int i=1; i<=num; i++)
        {
            a[i] = (i%2) + a[i/2];
        }
        
        return a;
    }
}