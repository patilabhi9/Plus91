package com.app.weight;

import java.util.Arrays;

public class MaximumWeightDifference {

	public static void main(String[] args) {

		//Case 1
		int[] arr = {8, 4, 5, 2, 10};
		int k = 2;
		
		//Case 2
		//int[] arr = {1,1,1,1,1,1,1,1};
		//int k = 3;
		
		System.out.println(maxWeightDiff(arr, k));
		
	}
	
	public static int maxWeightDiff(int[] arr, int k)
	{
		Arrays.sort(arr);
		int childWeight = 0;
		int totalWeight = 0;
		int maxPossWeightDiff;
		int chefWeight;
		
		for(int i=0; i<k ; i++)
		{
			childWeight = childWeight + arr[i];
		}
		
		for(int i=0; i<arr.length; i++)
		{
			totalWeight = totalWeight + arr[i];
		}
		
		chefWeight = totalWeight - childWeight;
		maxPossWeightDiff = chefWeight - childWeight;
		return maxPossWeightDiff;
	}

}
