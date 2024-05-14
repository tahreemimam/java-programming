package com.traing.bst;

class Solution {
	public int[] searchRange(int[] nums, int target) {
		int i = 0;
		int j = nums.length - 1;
		int firstOccurence = -1;
		int lastOccurence = -1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (target < nums[mid]) {
				j = mid - 1;
			} else if (target == nums[mid]) {
				firstOccurence = mid;
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}

		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (target < nums[mid]) {
				r = mid - 1;
			} else if (target == nums[mid]) {
				lastOccurence = mid;
				l = mid + 1;
			} else {
				l = mid + 1;
			}
		}
		int a[] = { firstOccurence, lastOccurence };
		return a;
	}

	public int search(int[] nums, int target) {
		int i = 0;
		int j = nums.length - 1;
		int ans = -1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (target == nums[mid]) {
				ans = mid;
				break;
			} else if (nums[i] <= nums[mid]) {
				if (target >= nums[i] && target < nums[mid]) {
					j = mid - 1;
				} else {
					i = mid + 1;
				}
			} else if (nums[mid] <= nums[j]) {
				if (target > nums[mid] && target <= nums[j]) {
					i = mid + 1;
				} else {
					j = mid - 1;
				}
			}
		}
		return ans;
	}
}
