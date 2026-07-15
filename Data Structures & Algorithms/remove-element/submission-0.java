class Solution {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length]; // new array
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {   // ✅ fixed condition
                temp[k] = nums[i];  // store valid element
                k++;
            }
        }

        // copy back to original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }
}