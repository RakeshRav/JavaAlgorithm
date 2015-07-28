package java_programs;

import java.util.Scanner;

public class InsertionSort {
	
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
		//insertionSrt(n,arr);
		bubble(n,arr);
	}

	private static void bubble(int n, int[] arr) {

		for (int i = 0; i < n-1; i++) 
		{
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void insertionSrt(int n, int[] arr) {

		int j,key;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j=i-1;
			System.out.println("for");
			while ((j>=0) && (arr[j] > key)) {
				arr[j+1] = arr[j];
				j=j-1;
				System.out.println("while "+j);
				
			}
			arr[j+1]=key;
			System.out.print("pass "+i);
			for (int x = 0; x < arr.length; x++) {
				System.out.print(arr[x]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
