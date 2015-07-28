package java_programs;

import java.util.Scanner;

public class CircularQueue
{
	static int size;
	int arr[];
	int front = -1, rear = -1;
	
	public static void main(String[] args) {
		System.out.println("enter size of queue :");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		CircularQueue cq = new CircularQueue();
		cq.arr = new int[size];
		cq.delete();
		cq.insert(10);
		cq.insert(20);
		cq.insert(30);
		cq.insert(40);
		cq.insert(50);
		cq.insert(60);
		cq.delete();
		cq.delete();
		cq.delete();
		cq.delete();
		cq.insert(60);
		cq.delete();
		cq.display();
		
	}

	private void display() {
System.out.println("front : "+front+"   rear :"+rear);		
	}

	private void delete() {

		if((front == -1) && (rear == -1))
		{
			System.out.println("underflow");
		}
		else if (front == rear) {
			front = -1;
			rear = -1;
		}
		else if(front == size-1)
		{
			front = 0;
		}
		else
		{
			front = front+1;
		}
	}

	private void insert(int i)
	{
		if(front ==-1 && rear == -1)
		{
			front++;
			rear++;
			arr[rear] = i;
		}
		else if (((front == 0) && (rear >=size-1)) || (rear+1 == front)) {
			System.out.println("overflow");
		}
		else if ((rear >= size-1) && (front!=0)) {
			rear = 0;
			arr[rear] = i;
		}
		else
		{
			arr[++rear] = i;
		}
	}
}
