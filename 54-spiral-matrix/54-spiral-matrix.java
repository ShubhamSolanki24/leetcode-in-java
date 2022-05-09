class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<Integer>();
        int row = matrix.length - 1, col = matrix[0].length - 1;
        int r = 0, c = 0;
        
        while (r <= row && c <= col) {
			// top row
            for (int i = c; i <= col; i++) arr.add(matrix[r][i]);
            r++;
            if (r > row) break;
            
			// right column
            for (int i = r; i <= row; i++) arr.add(matrix[i][col]);
            col--;
            if (c > col) break;
            
			// bottom row
            for (int i = col; i >= c; i--) arr.add(matrix[row][i]);
            row--;
            if (r > row) break;
            
			// left column
            for (int i = row; i >= r; i--) arr.add(matrix[i][c]);
            c++;            
        }
        
        return arr;
    
    }
}