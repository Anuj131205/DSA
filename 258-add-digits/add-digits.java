class Solution {
    public int addDigits(int num) {
      /*  if(num == 0){
            return 0;
        }
        
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;  // Remove last digits
                num /= 10;  // Remove last digit
            }
            num = sum;
        }
        return num;
    }
}  */
        if (num == 0) {
            return 0;
        }

        return 1 + (num - 1) % 9;
    }
}