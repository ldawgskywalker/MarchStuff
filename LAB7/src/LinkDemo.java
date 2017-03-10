import java.util.Scanner;
public class LinkDemo {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String item = "";
		LinkedList list = new LinkedList();
		
		//user inputs linkedlist values
		System.out.println("Please input items for list. Input \"-1\" when finished");
			item = kb.nextLine();
		while(!item.equals("-1")){
			list.addToFront(item);
			item = kb.nextLine();
		}
		System.out.println("Number of nodes in the list: " + list.size());
		list.enumerate();
		
		//prints odd nodes
		list.enumerateOddNodes();
		
		//user inputs letter to see if words in list contain it
		System.out.print("Input letter: ");
			item = kb.nextLine();
		//prints indices which contain letter
		list.listAllNodesWith(item);
		
		kb.close();
	}
}