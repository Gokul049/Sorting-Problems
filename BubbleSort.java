package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("Original Array :");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println();
		
		int i,j;
		for(i=arr.length-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])//if first element lessthan second element swap it.
				{
					int safe = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = safe;
				}
			
			}
		}
		System.out.println("Array After Bubble Sort:");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}

		/*
		 Time complexcity is O(n^2) because of nested loop.
		 */

	}

}
