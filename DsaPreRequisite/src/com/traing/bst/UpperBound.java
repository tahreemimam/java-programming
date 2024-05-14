package com.traing.bst;

public class UpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,5,8,9,10,12};
		int i=0;
		int j = a.length-1;
		int upperBoundOf = 12;
		int ans=-1;
		while(i<=j) {
			int mid = (i+j)/2;
			if(a[mid]>upperBoundOf) {
				ans=mid;
				j=mid-1;
			} 
			else {
				i=mid+1;
			}
		}
		if(ans!=-1) {
			System.out.println("upper bound of "+upperBoundOf+ " is "+ans);
		}else {
			System.out.println("No Upper bound of " +upperBoundOf+ " is found");
		}
		
	}

}
