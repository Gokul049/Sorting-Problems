package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {7,3,2,8,4,5,1};
		
		System.out.println("Original Array :");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println();
		
		int i,j;
		for(i=1;i<arr.length;i++) 
		{
			for(j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				
			}
		}
		
		System.out.println("Array After Insertion  Sort:");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}

	}

}
