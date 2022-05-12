class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int n = A.length;
        int m = B.length;        
        if (n==0||m==0) return new int[0][0];      
        
        List<int[]> res = new ArrayList<>();
        int i = 0; int j = 0;
        int[] aHead = null;
        int[] bHead = null;
        while (i<n&&j<m)
        {
            aHead = A[i];
            bHead = B[j];
            
            int[] intersect = {Math.max(aHead[0],bHead[0]), Math.min(aHead[1],bHead[1])};
            if (intersect[0]<=intersect[1])
            {
                res.add(intersect);
            }
            
            if (aHead[1]<bHead[1])
            {
                i++; 
            }
            else if (aHead[1]==bHead[1])
            {
                i++; 
                j++; 
            }
            else
            {
                j++; 
            }
        }
        
        int dim = res.size();
        int[][] finalRes = new int[dim][2];
        for (i = 0; i < dim; i ++)
        {
            finalRes[i] = res.get(i);
        }
        return finalRes;
    }
}