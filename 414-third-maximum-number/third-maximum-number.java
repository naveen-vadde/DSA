class Solution {
    public int thirdMax(int[] nums) {

        Long max = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            long n = num;

    
            if ((max != null && n == max) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (max == null || n > max) {
                third = second;
                second = max;
                max = n;
            }
            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            else if (third == null || n > third) {
                third = n;
            }
        }

        
        if (third == null) {
            return max.intValue();
        }

        return third.intValue();
    }
}