import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        // remainder 0 initially ek baar
        freq.put(0, 1);

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            int rem = sum % k;

            // Java mein negative remainder aa sakta hai
            if (rem < 0) {
                rem += k;
            }

            // Same remainder pehle kitni baar aaya?
            res += freq.getOrDefault(rem, 0);

            // Current remainder ki frequency badhao
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }

        return res;
    }
}


/* class Solution {
    public int subarraysDivByK(int[] a, int k) {

        int sum = 0;
        int res = 0;

        int[] f = new int[k];
        f[0] = 1;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            int rem = sum % k;

            if (rem < 0) {
                rem = rem + k;
            }

            res += f[rem];

            f[rem]++;
        }

        return res;
    }
}
*/