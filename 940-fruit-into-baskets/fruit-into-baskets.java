class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit
            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 fruit types
            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Valid window
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
/*
class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        // T: O(n square)  S: O(1) Constant 
        for(int i = 0; i < fruits.length; i++) {
            Set<Integer> set = new HashSet<>();
        
        for(int j = i; j < fruits.length; j++) {
            set.add(fruits[j]);

            if(set.size() > 2){
                break;
            }

            max = Math.max(max, j - i + 1);
        }
        }
        return max;
    }  
}
*/