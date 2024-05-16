package Q5;

import java.util.Arrays;
import java.util.Scanner;

//4. Calculate the mode of an array. The mode is the element occurred maximum time in the array.

public class maxinarray
{

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
        System.out.println("enter 5 elements in the array");		
		for(int i=0;i<5;i++)
		{
		  arr[i]=sc.nextInt();	
		}
		
		System.out.print("array is :  ");
		System.out.print(Arrays.toString(arr));
		System.out.println();
	
	// [3, 2, 3, 2, 2]
		int count,ele=0,max=0;
        for (int i = 0; i < arr.length; i++) 
        {
           count=0;
		  for(int j=i+1;j<arr.length;j++)
		  {
			if(arr[i]==arr[j])
			{
			  count++;	
			}
		  }
		  if(count>max)
		  {
			max=count;  
			ele=arr[i];
		  }
		}
        
        System.out.println("mode of the array is :"+ele);
	}

}
