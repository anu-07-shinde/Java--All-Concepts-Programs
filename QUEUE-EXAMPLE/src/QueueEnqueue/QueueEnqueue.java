package QueueEnqueue;

class Queue
{
	static int front, rear, capacity;
	static int queue[];
	
	
	
	Queue(int size)
	{
		front=rear=0;
		capacity =size;
		queue = new int[capacity];
	}
	
	 void qEnueue(int item)
	{
		if(capacity == rear)
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			queue[rear] = item;
			rear++;
		}
		return;
	}
	
	
	
	 void display()
	{
		if(front==rear)
		{
			System.out.println("Queue is empty");
			return;
		}
		else
		{
			for(int i=front; i<rear; i++)
			{
				System.out.println(queue[i]);
			}
		}
		return;
	}
}

public class QueueEnqueue {

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		
		System.out.println("Initial Queue: ");
		q.display();
		
		q.qEnueue(1);
		q.qEnueue(2);
		q.qEnueue(3);
		q.qEnueue(4);
		q.qEnueue(5);
		
		System.out.println("After inserting item: ");
		q.display();
		
	}
		
		
	}
	
	
	
	
	
	
	
	

