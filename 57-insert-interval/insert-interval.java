// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
        
//     }
// }    
  // a - > GivenIntervals , b - > newInterval
class Solution {
    public int[][] insert(int[][] a, int[] b) {

        int n = a.length;

        int start1 = b[0];
        int end1 = b[1];

        boolean insert = false;

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int start2 = a[i][0];
            int end2 = a[i][1];

            // Current interval is before new interval
            if (start1 > end2) {

                res.add(new int[]{start2, end2});

                continue;
            }

            // Overlap
            if (end1 >= start2) {

                start1 = Math.min(start1, start2);
                end1 = Math.max(end1, end2);

                continue;
            }

            // New interval insert
            if (insert == false) {

                res.add(new int[]{start1, end1});

                insert = true;
            }

            // Current interval
            res.add(new int[]{start2, end2});
        }

        // If new interval is not inserted
        if (insert == false) {

            res.add(new int[]{start1, end1});
        }

        return res.toArray(new int[res.size()][]);
    }
}