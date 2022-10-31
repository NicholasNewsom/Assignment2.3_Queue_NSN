

public class EmptyQueueException extends RuntimeException
{
	public EmptyQueueException(String collection)
	{
		super ("The queue: "+ collection+ "is empty.");
	}
	
}
