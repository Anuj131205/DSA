class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length, n = arr[0].length;
        int firstRow = 0;
        int lastRow = m - 1;

        int firstCol = 0;
        int lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {
            // Right
            for (int j = firstRow; j <= lastCol; j++) 
                result.add(arr[firstRow][j]);
                firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;
            // Down
            for (int i = firstRow; i <= lastRow; i++) 
                result.add(arr[i][lastCol]);
                lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            // left
            for (int j = lastCol; j >= firstCol; j--) 
                result.add(arr[lastRow][j]);
                lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            // Up
            for (int i = lastRow; i >= firstRow; i--)
                result.add(arr[i][firstCol]);
                firstCol++;
        }
        return result;
    }
}
