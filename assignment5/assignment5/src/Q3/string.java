package Q3;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class string
{

	public static void main(String[] args) 
	{
		 Hashtable<String, Integer> numbers= new Hashtable<String, Integer>();
		
		String str="avdhut and avdhut avdhut";//The passengers and crew went through Customs and left
		String arr[]=str.split(" ");
		System.out.println("Line is : "+str);
		
		int count;
		for(int i=0;i<arr.length;i++)
		{ 
			count=1;
			
			if(numbers.containsKey(arr[i]))
			{
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
			
			  if(arr[i].compareTo(arr[j])==0)
			  {
				count++; 
			  }
			
			}		
			numbers.put(arr[i], count);	
		}
		System.out.println();
		System.out.println();
		System.out.println("word count : ");
		
		
		Set<Map.Entry<String,Integer>> s= numbers.entrySet();
		for (Entry<String, Integer> entry : s)
		{
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}

}
