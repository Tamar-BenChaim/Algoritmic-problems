package aaa;

import java.util.Arrays;

public class Set {
	
	
	public static int set(int arr[])
	{
		int [] count = new int [arr.length];
		int max ;
		count[0]=1;
		for (int i = 0; i < arr.length; i++) 
		{
			max = 0;
			for (int j = 0; j < i; j++) 
			{
				if(arr[i] > arr[j] && count[j]>max) 
					max = count[j];		
			}
			
			count[i] = max+1;
		}
		System.out.println(Arrays.toString(count));
		max = 0;
		int imax = 0;
		for (int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				imax = i;
			}	
		}
		for (int i = imax ; i >= 0;) 
		{
			System.out.print(arr[i]+",");
			if(i == 0)
				break;
			for (int j = i; j >= 0; j--) 
			{
				if( arr[i] > arr[j] && count[j] == count[i]-1 ) {
					i = j;
					break;
				}
			}
		}
		System.out.println();
		return max;
	}

	public static void main(String[] args) 
	{
		int arr [] = {3,4,7,5,6,8,2,3,8,9,4,6};
		System.out.println(set(arr));

	}

}
