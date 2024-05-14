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
		int[] a = { 5, 7, 7, 8, 8, 10 };
		Solution sol = new Solution();
		int res[] = sol.searchRange(a, 8);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}