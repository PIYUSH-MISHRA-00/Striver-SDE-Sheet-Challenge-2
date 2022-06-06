class Solution {
    public void setZeroes(int[][] matrix) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<matrix.length; i++) 
            for(int j=0; j<matrix[0].length; j++) 
                if(matrix[i][j] == 0) {
                    st.push(i);
                    st.push(j);
                }
        while(st.size() > 0)
            alter(matrix, st.pop(), st.pop());            
    }
    void alter(int[][] matrix, int c, int r) {
        for(int i=0; i<matrix.length; i++) 
            matrix[i][c]=0;
        for(int i=0; i<matrix[0].length; i++) 
            matrix[r][i]=0;
    }
}