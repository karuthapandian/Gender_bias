public class maximize {

    public static int maximize(int[] nums) {
        int maxOnes = 0; 
        int windowOnes = 0; 
        int left = 0; 

       
        for (int right = 0; right < nums.length; right++) {
            // Update the count of 1s within the current window
            if (nums[right] == 1) {
                windowOnes++;
            }

            // Shrink the window if the count of 1s exceeds the allowed flips
            while (right - left + 1 - windowOnes > 1) {
                if (nums[left] == 1) {
                    windowOnes--;
                }
                left++;
            }

            // Update the maximum count of 1s
            maxOnes = Math.max(maxOnes, right - left + 1);
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1, 1, 0, 0, 1, 1};
        int result = maximize(nums);
        System.out.println("Maximum count of 1s: " + result);
    }
}
