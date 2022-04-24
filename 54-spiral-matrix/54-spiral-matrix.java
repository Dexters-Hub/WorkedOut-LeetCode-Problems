class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        
        if (matrix.length == 0) {
            return ans;
        }
        
        int n_row = matrix.length;
        int m_col = matrix[0].length;
        int total = n_row * m_col;
        int row = 0, col = 0, s_row = 0, s_col = 0, dir = 0;
                
        while (total > 0) {
            if (dir == 0) {
                if (col == m_col) {
                    ++dir;
                    --col;
                    row = ++s_row;
                    continue;
                }
                
                ans.add(matrix[row][col]);
                ++col;
                --total;          
            }
            
            else if (dir == 1) {
                if (row == n_row) {
                    ++dir;
                    --row;
                    col = --m_col - 1;
                    continue;
                }
                
                ans.add(matrix[row][col]);
                ++row;
                --total;
            }
            
            else if (dir == 2) {
                if (col == s_col - 1) {
                    ++dir;
                    ++col;
                    row = --n_row - 1;
                    continue;
                }
                
                ans.add(matrix[row][col]);
                --col;
                --total;
            }
            
            else {
                if (row == s_row - 1) {
                    dir = 0;
                    ++row;
                    col = ++s_col;
                    continue;
                }
                
                ans.add(matrix[row][col]);
                --row;
                --total;
            }     
        }
        return ans;
    }
}