import java.util.*;
public class Exercise1 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		//initialize word
		String word = "";
		
		System.out.print("Input words for first ArrayList. End with -1 when done: ");
		
		//make list1
		while(!word.equals("-1")){
			word = kb.next();
			if(!word.equals("-1"))
				list1.add(word);
		}
		
		//reset word
		word = "";
		
		//make list2
		while(!word.equals("-1")){
			word = kb.next();
			if(!word.equals("-1"))
				list2.add(word);
		}
		
		//print lists
		System.out.println(list1);
		System.out.println(list2);
		
		//remove all items from list1 not in list2
		list1.retainAll(list2);
		
		//print revised list
		System.out.println(list1);
		
		
		
		kb.close();
	}
}
