 // Intervals -> a
 class Solution {
    public int[][] merge(int[][] a) {

        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

        int n = a.length;

        int start1 = a[0][0];
        int end1 = a[0][1];

        List<int[]> res = new ArrayList<>();

        for (int i = 1; i < n; i++) {

            int start2 = a[i][0];
            int end2 = a[i][1];

            // Overlap
            if (end1 >= start2) {

                end1 = Math.max(end1, end2);

                continue;
            }

            // No overlap
            res.add(new int[]{start1, end1});

            start1 = start2;
            end1 = end2;
        }

        // Last interval
        res.add(new int[]{start1, end1});

        return res.toArray(new int[res.size()][]);
    }
} 