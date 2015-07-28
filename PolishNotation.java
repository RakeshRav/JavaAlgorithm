package java_programs;

import java.util.Scanner;

public class PolishNotation
{
	String in,output="";
	char stackOperator[] = new char[5];
	
	char out;
	int top,i;
	public static void main(String[] args) {
		PolishNotation pn = new PolishNotation();
		pn.input();
		pn.stackOperator = new char[pn.in.length()];
		pn.postfix();
	}
	
	private void postfix() {
		char ch;
		int type;
		while (i < in.length()) {
			ch = getChar();
			type = getType(ch);
			switch (type) {
			case 1:
				push(ch,type);
				break;
			case 2:
				pop();
				break;
			case 3:
				push(ch,type);
				break;
			case 4:
				outputString(ch);
				break;

			}
		}
		System.out.println(output);
	}

	private void pop() 
	{
		top--;
		while(!(stackOperator[top]=='('))
		{
			outputString(stackOperator[top--]);
		}
	}

	private void outputString(char ch) {
		output = output+ch;
	}
	private void showStack() {
		int j;
		System.out.println("\n Stack");
		for(j=top-1;j>=0;j--)
		{
			System.out.println(stackOperator[j]);
		}
	}

	private void push(char ch, int type) {
		
		int precedence,prevPrec;
		if(type == 1)
		{
			stackOperator[top++]=ch;
			showStack();
		}
		else if(type==3)
		{
			if(stackOperator[top-1]=='(')
			{
				stackOperator[top++]=ch;
				showStack();
			}
			else
			{
				precedence = getPrecedence(ch);
				prevPrec = getPrecedence(stackOperator[top-1]);
				if(prevPrec > precedence)
				{
					outputString(stackOperator[top-1]);
					top--;
					stackOperator[top++]=ch;
					
					showStack();
				}
				else
				{
					stackOperator[top++]=ch;
					showStack();
				}
			}
			
		}
		
	}

	private int getPrecedence(char ch) 
	{
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '^':
			return 3;
		}
		return 0;
	}

	public char getChar()
	{
		
		return in.charAt(i++);
	}
	
	public int getType(char ch)
	{
		switch(ch)
		{
			case '(':
				return  1;
			case ')':
				return  2;	
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				return 3;
				
			default :
				return  4;
				
		}
		
	}
	
	private void input() {
		System.out.println("Enter string : ");
		Scanner sc = new Scanner(System.in);
		in = sc.nextLine();
		in = "("+in+")";
		
	}
}
