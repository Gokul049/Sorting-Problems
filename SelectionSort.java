package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {8,10,3,9,4,7,12};
		
		System.out.println("Original Array :");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println();
		
		int i,j;
		int min_ind;
		for(i=0;i<arr.length;i++)
		{
			min_ind = i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[min_ind]>arr[j])
				{
					min_ind = j;
				}
			}
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Array After Selection  Sort:");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}


	}

}
