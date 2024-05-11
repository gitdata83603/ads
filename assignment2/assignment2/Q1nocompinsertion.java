package assignment2;

import java.util.Arrays;

public class Q1nocompinsertion {

	public static void insertionSortascending(int arr[], int N)
	{
		int comp=0;
		int flag;
		for(int i = 1 ; i < N ; i++) 
		{
			flag=0;
		
			int temp = arr[i];
			
			int j = i - 1;
			
			
			while(j >= 0 && arr[j] > temp) 
			{							
				arr[j + 1] = arr[j];
				j--;
				comp++;
		        flag=1;
			}
			if(flag==0)
			{
			    comp++;
			}
			arr[j + 1] = temp;
		}
		
		System.out.println("NO of comparisons="+comp);
	}

	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//int arr[] = {55, 44, 22, 66, 11, 33};
		int arr[] = {22,11,33,44};
		
		System.out.println("Before sort array : " + Arrays.toString(arr));
		//insertionSortascending(arr, arr.length);
		insertionSortascending(arr, arr.length);
		System.out.println("After sort array : " + Arrays.toString(arr));
	}

}
