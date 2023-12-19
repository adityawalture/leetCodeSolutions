class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] avg = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 1;
                int sum = img[i][j];
                if (i-1 >= 0) { 
                    sum += img[i-1][j]; 
                    count++;
                    if (j-1 >= 0) {sum += img[i-1][j-1]; count++;}
                    if (j+1 < m) {sum += img[i-1][j+1]; count++;}
                };
                if (i+1 < n) {
                    sum += img[i+1][j];
                    count++;
                    if (j+1 < m) {sum += img[i+1][j+1]; count++;}
                    if (j-1 >= 0) {sum += img[i+1][j-1]; count++;}
                }
                if (j-1 >= 0) {sum += img[i][j-1]; count++;}
                if (j+1 < m) {sum += img[i][j+1]; count++;}
                avg[i][j] = sum / count;
            }
        }
        return avg;
    }
}