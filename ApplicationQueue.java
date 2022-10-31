package CS;

public class ApplicationQueue {

	public static void main(String[] args) 
	{
		Queue<String> Customers = new Queue<>();
		Customers.enqueue("Bill");
		Customers.enqueue("Alice");
		Customers.enqueue("Bob");
		System.out.print(Customers.toString());
		Customers.dequeue();
		System.out.println("\nA customer is served.");
		System.out.print("\n" + Customers.toString());
		Customers.enqueue("Jane");
		Customers.enqueue("Hamad");
		System.out.print("\n" + Customers.toString());
		Customers.dequeue();
		Customers.dequeue();
		System.out.println("\n2 customers are served");
		System.out.print("\n" + Customers.toString());
		Customers.enqueue("Jim");
		System.out.print("\n" + Customers.toString());
		Customers.dequeue();
		Customers.dequeue();
		System.out.println("\n2 customers are served");
		System.out.print("\n" + Customers.toString());
		
	}

}
