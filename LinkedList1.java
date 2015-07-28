package java_programs;

import java.util.Scanner;


public class LinkedList1 
{
	public class Node
	{
		int data;
		Node link;
			
		public Node() {
			data = 0;
			link = null;
		}
		
		public Node(int i,Node l) {
			data = i;
			link = l;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLink() {
			return link;
		}

		public void setLink(Node link) {
			this.link = link;
		}
		
		
		
	}
	


	public class LinkedList 
	{
		Node start;
		Node end;
		int size;
		
		public LinkedList() {

			start = null;
			end = null;
			size = 0;
		}
		
		public void insertAtBegining(int data) {
			Node nprt = new Node(data, null);
			size++;
			if (start == null) 
			{
				start = nprt;
				end = start;
				
			}
			else
			{
				nprt.setLink(start);
				start = nprt;
			}
		}
		
		public void insertAtEnd(int data) {
			Node nprt = new Node(data, null);
			size++;
			if (start == null) 
			{
				start = nprt;
				end = start;
			}
			else
			{
				end.setLink(nprt);
				end = nprt;
			}
		}
		
		public void insertAtPos(int data,int pos) {
			
			if (pos == 1)
			{
				insertAtBegining(data);
			}
			else
			{
				Node nprt = new Node(data, null);
				Node prt = start;
				for (int i = 1; i <size; i++)
				{
					if(i == pos-1)
					{
						Node temp = prt.getLink();
						prt.setLink(nprt);
						nprt.setLink(temp);
						size++;
						break;
					}
					prt = prt.getLink();
				}
			}
		}
		
		public void deletion(int pos) {
			if(pos == 1)
			{
				start = start.getLink();
				size--;
			}
			else if(pos == size)
			{
				
				Node s = start;
				Node t = start;
				while (s!=end) 
				{
					t = s;
					s = s.getLink();
				}
				end = t;
				end.setLink(null);
				size--;
				
			}
			else
			{	Node ptr = start;
				for (int i = 1; i <size; i++) {
					if(i == pos-1)
					{
						Node temp = ptr.getLink();
						ptr.setLink(temp.getLink());
						break;
					}
					ptr = ptr.getLink();
				}
				size--;
			}
			
		}
		public void display() 
		{
			if (size ==0)
			{
				System.out.println("Size : "+size);
				System.out.println("Empty List");
			}
			else if(start.getLink() == null)
			{
				System.out.println("Size : "+size);
				System.out.println(start.getData());
			}
			else {
				System.out.println("Size : "+size);
				Node ptr = start.getLink();
				System.out.print(start.getData());
				while (ptr.getLink()!=null)
				{
					System.out.print("->"+ptr.getData());
					ptr = ptr.getLink();
				}
				System.out.print("->"+ptr.getData());
				
			}
		}
	}
	
	public static void main(String[] args) {
		char ch1;
		int ch;
		LinkedList1 l = new LinkedList1();
		LinkedList list = l.new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter Ur Choice : \n1. in at beg\n2. in at end\n3. in at pos\n4. delete");
			ch = sc.nextInt();
			switch (ch)
			{
			case 1:
				System.out.println("Enter element to insert in list : ");
				list.insertAtBegining(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter element to insert in list : ");
				list.insertAtEnd(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter element to insert in list : ");
				int e = sc.nextInt();
				System.out.println("enter position : ");
				int p = sc.nextInt();
				if(p<1 || p>list.size)
				{
					System.out.println("invalid location");
				}
				else
				{
					list.insertAtPos(e, p);
				}
				break;
			case 4:
				System.out.println("Enter Position: ");
				int n = sc.nextInt();
				if((n<1) || (n>list.size))
				{
					System.out.println("invalid input");
				}
				else
				{
					list.deletion(n);
				}
				break;

			default:
				break;
			}
			
			list.display();
			System.out.println("\nwant to continue : ");
			 ch1 = sc.next().charAt(0);

		} while (ch1=='Y' || ch1=='y');		
	}


}



