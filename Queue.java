
public class Queue<T> implements QueueInterface<T>
{
	GenLinkedList<T> list = new GenLinkedList<T>();
	
	public void enqueue(T data) 
	{
		list.addNode(data);
	}

	public T dequeue() 
	{
		T front = (T) list.head.getData();
		list.head = list.head.getNextNode();
		
		return front;
	}

	public Object getFront() 
	{
		if(isEmpty())
			throw new EmptyQueueException("Empty Queue");
		else
			return list.getList();
	}

	public boolean isEmpty() 
	{
		if(list.getList() == null)
			return true;
		return false;
	}

	public void clear() 
	{
		list.head = null;
		list.tail = null;
		list.length = 0;
	}
	
	public String toString()
	{
		String string = "";
		GenNode<T> current = list.head;
		
		 while(current != null)
		 {
             string += current.getData();
             current = current.getNextNode();
             if(current != null)
             {
                  string += ", ";
             }
		 }
		return string;
	}

}
