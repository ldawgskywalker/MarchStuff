public class Node
{
	private User data;
	private Node next;
	public Node(User d, Node n)
	{
		data = d;
		next = n;
	}
	public User getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(User d)
	{
		data = d;
	}
	public void setNext(Node n)
	{
		next = n;
	}
	public String toString()
	{
		return data.getName()+" from "+data.getLocation() + "-->";
	}
}