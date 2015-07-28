package java_programs;

import java.util.Scanner;

public class QuickSort
{
	static int pivot = 0,first,last;
	public static void main(String[] args) {
		
		int n;
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		first = 0;
		last = arr.length-1;
		System.out.println(last);
		quickSrt(arr,first,last);
	}

	public static void quickSrt(int[] arr, int beg, int end) {

		
		if(beg<end)
		{
			partition(arr,beg,end,0);
			
			quickSrt(arr, beg, pivot-1);
			
		}
		else if(beg>end)
		{
			quickSrt(arr, pivot+1, end);
		}
		else
		{
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
		}
	}

	private static void partition(int[] arr, int beg, int end, int pivot1) {

		int temp;
		if (beg==pivot1) 
		{
			if (arr[pivot1]>arr[end])
			{
				temp = arr[pivot1];
				arr[pivot1] = arr[end];
				arr[end] = temp;
				pivot1 = end;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				
				}
				System.out.println();
				partition(arr, first, end, pivot1);
			}
			else
			{
				if (pivot1 == end) {
					pivot = pivot1;
					System.out.println(pivot);
				}
				else
				{
				end = end-1;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				
				}
				System.out.println();
				pivot = pivot1;
				partition(arr, beg, end, pivot1);
				}
			}
		}
		else if (end==pivot1) 
		{
			if (arr[pivot1]<arr[beg])
			{
				temp = arr[pivot1];
				arr[pivot1] = arr[beg];
				arr[beg] = temp;
				pivot1 = beg;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				
				}
				System.out.println();
				partition(arr, beg, last, pivot1);
			}
			else
			{
				if (pivot1 == beg) {
					pivot = pivot1;
					System.out.println(pivot);
				}
				else
				{
				
				beg = beg+1;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				
				}
				System.out.println();
				
				partition(arr, beg, end, pivot1);
				
				}
			}
		}	
	}
}
