import java.util.*;

/**
 * Binary Search on a Sorted Array
 * 
 * We are given an array of integers, nums, sorted in ascending order, and an integer value, target. 
 * If the target exists in the array, return its index. If the target does not exist, then return -1. 
 * The binary search divides the input array by half at every step. After every step, either we find 
 * the index we are looking for, or we discard half of the array.
 * 
 * @author Ahmad Ali
 */

class BinarySearch {

    public static void main(String[] args) {
		int[][] numsLists = {{}, {0, 1}, {1, 2, 3}, {-1, 0, 3, 5, 9, 12}, {-1, 0, 3, 5, 9, 12}};
		int[] targetList = {12, 1, 3, 9, 2};
		for (int i = 0; i < numsLists.length; i++) {
			int[] nums = numsLists[i];
			int target = targetList[i];
			int index = binarySearch(nums, target);
			System.out.println(i + 1 + ". Array to search: " + Arrays.toString(nums));
			System.out.println("   Target: " + targetList[i]);
			if (index != -1) {
				System.out.println("   " + target + " exists in the array and its index is " + index);
			} else {
				System.out.println("   " + target + " does not exist in the array so the return value is " + index);
			}
			System.out.println(
					"----------------------------------------------------------------------------------------------------\n");
		}
	}

	static int binarySearch(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len-1;
        
        while (start <= end) {
            int mid = start+((end - start)/2);

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
        }

        return -1;
    }
}