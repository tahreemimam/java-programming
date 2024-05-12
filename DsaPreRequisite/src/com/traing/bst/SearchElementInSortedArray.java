/**
 * link of question:
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

package com.traing.bst;

import java.util.Scanner;

public class SearchElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int []a = {5,7,7,8,8,10};
		Solution sol= new Solution();
		int res[]=sol.searchRange(a, 8);
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}

}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int firstOccurence = -1;
        int lastOccurence = -1;
        while(i<=j){       
            int mid = (i+j)/2;
            if(target<nums[mid]){
                j=mid-1;
            }
            else if(target==nums[mid]){
                firstOccurence = mid;
                j=mid-1;
            }else {
            	i=mid+1;
            }
        }

        int l=0;
        int r=nums.length-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(target<nums[mid]){
                r=mid-1;
            }
            else if(target==nums[mid]){
                lastOccurence = mid;
                l=mid+1;
            }else {
            	l=mid+1;
            }
        }
        int a[] ={firstOccurence,lastOccurence};
        return a;
    }
}
