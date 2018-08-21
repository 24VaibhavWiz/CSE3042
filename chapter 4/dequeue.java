class dq {
	
	private int maxSize;;
	private long[] arr;
	private int n_items;
	private int left;
	private int right;
	
	public dq(int s)
	{
		maxSize = s;
		arr=new long[maxSize];
		n_items=0;
		left = 1;
		right=0;
	}
	public void insert(long j)
	{
		if(right == maxSize-1)
		right = -1;
		arr[++right] = j;
		n_items++;
	}
	public long peek_left()
	{
		return arr[left];
	}
	public long peek_right()
	{
		return arr[right];
	}
	public void insert_left(long value)
	{
		if(right==0 && left==maxSize-1)
		{
			System.out.println("The Queue is full....!!!");
		}
		else
		{
			System.out.println("After inserting in left...!!!");
			left--;
			if(left<0)
				left = maxSize-1;
			arr[left]=value;
			n_items++;
		}
	}
	public long remove_left()
	{
		if(right==0 && left==-1)
		{
			System.out.println("The Queue is empty....!!!");
			return -1;
		}
		
		else
		{
			System.out.println("After removing from left...!!!");
			long temp= arr[left];
			left++;
			if(left>=maxSize)left=0;
			n_items--;
			return temp;
		}

	}
	public void insert_rt(long value)
	{
		if(right==maxSize-1)
		{
			System.out.println("The Queue is full....!!!");
		}
		else 
		{
			System.out.println("After inserting in right...!!!");
			right++;
			if(right >= maxSize) right = 0;
			arr[right] = value;
			n_items++;
		}
			
	}
	public long remove_rt()
	{
		if(right==0 && left==-1)
		{
			System.out.println("The Queue is empty....!!!");
			return -1;
		}
		{
			System.out.println("After removing from right...!!!");
			long temp = arr[right];
			right--;
			if(right < 0) 
				right = maxSize-1;
			n_items--;
			return temp;
		}
	}

	public void display()
	{
		int index = left;
		for(int i = 0; i < n_items; i++)
		{
			if(index >= maxSize) 
				index = 0;
			System.out.print(arr[index] + " ");
			index++;
		}	
		System.out.println();
		System.out.println();
	}
}

public class dequeue {
	public static void main(String []args)
	{
		dq theQueue = new dq(5); 
		theQueue.insert_rt(10);
		theQueue.display();
		theQueue.insert_rt(20);
		theQueue.display();
		theQueue.insert_left(30);
		theQueue.display();
		theQueue.insert_left(40);
		theQueue.display();
		theQueue.remove_left();
		theQueue.display();
		theQueue.remove_rt();
		theQueue.display();
		theQueue.remove_left(); 
		theQueue.display();
		theQueue.insert_rt(99);
		theQueue.display();
		theQueue.insert_rt(50);
		theQueue.display();
		theQueue.insert_left(60);
		theQueue.display();
		theQueue.insert_left(70);
		theQueue.display();
		theQueue.insert_rt(80);
		theQueue.display();	
	}

}
