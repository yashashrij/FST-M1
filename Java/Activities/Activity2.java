package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int arr[] = {10, 77, 10, 54, -11, 10};
		System.out.println(Arrays.toString(arr));
		
		int tempSum =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==10)
			{
				tempSum += arr[i];
				
			}
			if(tempSum>30)
				break;
			}
		if(tempSum==30)
			System.out.println("Condition satisfied");
		
		
		}
}
