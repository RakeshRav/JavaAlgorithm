package java_programs;

import java.util.Scanner;

public class BinarySearch
{
	static int h,l,mid;

	public static void main(String[] args) 
	{
		int n,element;
		int arr[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter element to be searched : ");
		element = sc.nextInt();
		h = n;
		l = 0;
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < n-i; j++) {
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("Sorted list : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		binarySrch(n,h,l,element,arr);
	}

	private static void binarySrch(int n,int high,int low, int element, int[] arr) {

		mid = (high+low)/2;
		
		//System.out.println(mid);
		if(element>arr[mid])
		{
			if(high==low)
			{
				System.out.println("element not found");
			}
			else
			{
			binarySrch(n,high,mid+1,element,arr);
			}
		}
		else if(element<arr[mid])
		{
			if(high==low)
			{
				System.out.println("element not found");
			}
			else
			{
				binarySrch(n,mid-1,low,element,arr);	
			}
			
		}
		else if(element == arr[mid])
		{
			System.out.println("element found at position : "+ ++mid);
			return;
		}

		
	}
}
