import java.util.*;
class priority
{
	static Node head;
	static int count3=0;
	static int count4=0;
	static int count5=0;
	static class Node
	{
		int data;
		int p1;
		Node next;
		Node(int d,int p2)
		{
			data=d;
			p1=p2;
			next=null;
		}
	}
	static priority add(int d,int p3,priority p)
	{
		int count=0;
		int count1=0;
		Node new_node =new Node(d,p3);
		if(p.head==null)
		{
			p.head=new_node;
		}
		else
		{
			Node last=p.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return p;
	}
		public static void peek(priority p)
		{
			count3=0;
			Node rt=p.head;
			if(p.head==null)
			{
					System.out.println("Priority queue cannot be empty");
			}
			else
			{
			while(rt!=null)
			{
				++count3;
			}
			int brr[]=new int[count3];
			--count3;
			Arrays.sort(brr);
			rt=p.head;
			while(rt!=null)
			{
				if(rt.p1==brr[count3])
				{
					System.out.println("Element with highest priority "+rt.data);
					break;
				}
				rt=rt.next;
			}
			}
		}
		public static void display(priority p)
		{
			Node qw=p.head;
			if(p.head==null)
			{
				System.out.println("Priority queue found empty");
			}
			while(qw!=null)
			{
				++count3;
				qw=qw.next;
			}
			int arr[]=new int[count3];
			qw=p.head;
			count3=0;
			while(qw!=null)
			{
				arr[count3]=qw.p1;
				qw=qw.next;
				++count3;
			}
			Arrays.sort(arr);
			--count3;
			qw=p.head;
			Node as=p.head;
			while(qw!=null)
			{
				while(as!=null)
				{
					if(arr[count3]==as.p1)
					{
						System.out.print("Priority "+as.p1+" ");
						System.out.println("data " +as.data);
						--count3;
					}
					as=as.next;
				}
				if(count3<0)
				{
					break;
				}
				else
				{
					qw=qw.next;
					as=p.head;
				}
			}
		}
		/*public static void poll(priority p)
		{
			count3=0;
			int a=0;
			Node ty=p.head;
			if(p.head==null)
			{
				System.out.println("ERROR !");
				System.out.println("Priority queue found empty");
			}
			else
			{
			while(ty!=null)
			{
				if(ty==p.head)
				{
					a=ty.p1;
				}
				else
				{
					if(ty.p1>a)
					{
						a=ty.p1;
					}
				}
				ty=ty.next;
			}
			ty=p.head;
			Node u=null;
			while(u!=null)
			{
				if(count3==a)
				{
					System.out.println("Element "+u.next.data+ " has the highest priority and has been deleted ");
					u.next=ty.next;
					break;
				}
				else
				{
					++count3;
					u=ty;
					ty=ty.next;
				}
			}
			}
		}*/
		public static void main(String []args)
		{
		priority p=new priority();
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you wish to enter the app(y/n)");
		char c=sc.next().charAt(0);
		while(c!='n')
		{
			System.out.println("Select any one of the following");
			System.out.println("1.Addition in priority queue");
			System.out.println("2.Peek");
			System.out.println("3.Display");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter the element you want to add");
				int y=sc.nextInt();
				System.out.println("Enter it's priority");
					int z=sc.nextInt();
					p.add(y,z,p);
			}
			if(n==2)
			{
				p.peek(p);
			}
			if(n==3)
			{
				p.display(p);
			}
			System.out.println("Do you still wish to continue");
			c=sc.next().charAt(0);
		}
		}
		}