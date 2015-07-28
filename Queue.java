package java_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Queue
{
	int front=-1,rear=-1,size;
	static int arr[],ch;
	public static void main(String[] args)throws IOException {
		System.out.println("enter size of Queue : ");
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
	
		q.size = sc.nextInt();
		System.out.println(q.size);
		arr = new int[q.size];
		
		do
		{
			System.out.println("Enter Ur Choice : ");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Exit");
			
			ch = sc.nextInt(); 
			switch (ch)
			{
				case 1:
					System.out.println("Enter element to be inserted : ");
					int i = sc.nextInt();
					q.insert(i);
					break;
				case 2: 
					q.delete();
					break;
				default :
					break;
			}
		}while(ch!=3);
		
	}
	private void delete() 
	{
		if((front == -1) || (front >rear))
		{
			System.out.println("underflow");
		}
		else
		{
			front = front+1;
			for (int i = front; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}
	private void insert(int i) 
	{
		
		if(rear>=(size-1))
		{
			System.out.println("Overflow");
		}
		else
		{
			if ((rear == -1) && (front == -1))
		
				{
					front = front +1;
					arr[++rear] = i;
					System.out.println(arr[rear]);
					System.out.println("front = "+front);
					System.out.println("rear = "+rear);
				}
				else
				{
					arr[++rear] = i;
					System.out.println(arr[rear]);
					System.out.println(rear);
				}
		}
	}
	
	
	
}
