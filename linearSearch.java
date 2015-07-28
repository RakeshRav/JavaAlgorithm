package java_programs;

import java.util.Scanner;

public class linearSearch 
{
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
		linearSrch(n,element,arr);
	}

	public static void linearSrch(int n, int element, int[] arr) {

			int flag =1;
			for (int i = 0; i < arr.length; i++) {
				if(flag == 1)
				{
					if(element==arr[i])
					{
						flag = 0;
						System.out.println("Element found at position : "+ ++i);
					}
				}
			}
			if(flag == 1)
			{
				System.out.println("Element not found");
			}
	}
}
