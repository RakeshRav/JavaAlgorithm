package java_programs;

import java.util.Scanner;

public class Stack 
{
	
	int arr[];
	int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	private void push(int i) {
		
		if((arr.length-1) > top)
		{
			top++;
			arr[top] = i;
			System.out.println("\nStack");
			for (int j = top; j >= 0; j--)
			{
				System.out.println(""+arr[j]);
			}
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
	
	private void pop() {

		top--;

		System.out.println("\nStack");
		for (int j = top; j >= 0; j--)
		{
			System.out.println(""+arr[j]);
		}
	}
	
	private void display() {
		System.out.println("\nStack");
		for (int i = top; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of stack");
		size =  sc.nextInt();
		Stack st = new Stack(size);
		
		st.push(24);
		st.push(12);
		st.push(6);
		st.push(3);
		st.push(1);
		st.push(0);
		st.push(24);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		st.display();
		
		st.push(2455);
		st.push(1255);
		st.push(6554);
		st.push(3445);
		st.push(155);
		st.push(05);
		st.push(24);
		
	}
}
