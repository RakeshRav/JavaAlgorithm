package java_programs;

import java.util.Scanner;

public class RadixSort 
{
	static int max1 = 0,max = 0,swap = 0;;
	static int n,len,i1=1;
	public static void main(String[] args) {
		
		
		int arr[][],arr1[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		n = sc.nextInt();
		arr1 = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			arr1[i]=sc.nextInt();
			
		}
		maxNo(arr1);
		arr = new int[n][max+1];
		for (int i = 0; i < n; i++) {
			arr[i][0] = arr1[i];
		}
		
		RadixSrt(arr);
	}

	private static void maxNo(int[] arr1)
	{
		for (int i = 0; i < n; i++) {
			
			max1 = (arr1[i]+"").length();
			if(max < max1)
			{
				max = max1;
			}
		}
		System.out.println(max);
	}

	private static void RadixSrt(int[][] arr) 
	{
		
			getDigit(arr);
			for (int i = max; i > 0; i--) {
				sort(arr,i);
			}

		
		
		
			for (int i = 0; i < n; i++)
			{
					for (int j = 0; j < max+1; j++) {
						System.out.print("\t"+arr[i][j]);
					}
					System.out.println();
				
			}
//		for (int i = 0; i < n; i++) {
//			arr[i][1] = arr[i][0]
//		}
	}
	
	private static void sort(int[][] arr, int ijk) {
		for (int i = 0; i < n-1; i++) 
		{
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j][ijk] > arr[j+1][ijk]) 
				{
					swap(j,arr);
				}
			}
		}

		for (int i = 0; i < n; i++)
		{
				for (int j = 0; j < max+1; j++) {
					System.out.print("\t"+arr[i][j]);
				}
				System.out.println();
			
		}
//	
		
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i][0]);
//		}
//			// TODO Auto-generated method stub

	}
	
	

	private static void swap(int j,int[][] arr)
	{
		swap = 0;
		while (swap < max+1) {
			
			int temp = arr[j][swap];
			arr[j][swap] = arr[j+1][swap];
			arr[j+1][swap] = temp;
			
			swap++;
		}
		

		for (int i = 0; i < n; i++)
		{
				for (int j1 = 0; j1 < max+1; j1++) {
					System.out.print("\t"+arr[i][j1]);
				}
				System.out.println();
			
		}
//	
	}

	private static void getDigit(int[][] arr) {
		
		String a,b;
		
		for (int i = 0; i < n; i++) {
		
			max1 = (arr[i][0]+"").length();
			
			if(max1 < max)
			{
				int d = max- max1;
				for (int j = 1; j <= d; j++) {
					arr[i][j] = 0;
				}
				int pos = max;
				while (d != pos)
				{
					a = arr[i][0]+"";
					b = a.charAt(--max1)+"";
					
					arr[i][pos--] =  Integer.parseInt(b);
					
				}
			}
			else
			{
				int pos = max;
				System.out.println(pos);
				while(max1 > 0) {
					a = arr[i][0]+"";
					b = a.charAt(--max1)+"";
					arr[i][pos--] = Integer.parseInt(b) ;
				}
				
			}
		}
		for (int i = 0; i < n; i++)
		{
				for (int j = 0; j < max+1; j++) {
					System.out.print("\t"+arr[i][j]);
				}
				System.out.println();
			
		}
	}
}
