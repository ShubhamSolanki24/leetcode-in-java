class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int pos=0;
        for (int[] row : mat){
            int low = 0, high = row.length; 
            while(low < high){
                int mid = (low + high) / 2;
                if (row[mid] != 0) low = mid + 1;
                else high = mid;
            }
            queue.add(new int[]{low, pos++});
        }
        
        int[] output = new int[k];
        for(int i = 0; i < k; i++)  output[i] = queue.remove()[1];
        return output;
    }
}