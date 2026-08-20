class Solution {
    public boolean checkIfExist(int[] arr) {
        // Hashset Best Approch 
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.contains(2 * num) || set.contains(num / 2) && num % 2 == 0){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
       /*   Brute Force
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) 
                return true;
            }
        }
        return false;
    }
}
*/