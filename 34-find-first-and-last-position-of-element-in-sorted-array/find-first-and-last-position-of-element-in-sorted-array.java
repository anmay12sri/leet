class Solution {
    public int[] searchRange(int[] nums, int target) {
       int arr[] = new int[2];
       arr[0] = first(nums, target);
       arr[1] = second(nums, target);
       return arr;
    }
    
    public int first(int[] nums, int target) {
        int ind = -1;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            if (nums[mid] == target) ind = mid;
        }
        return ind;
    }
    
    public int second(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ind = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            if (nums[mid] == target) ind = mid;
        }
        return ind;
    }
}
