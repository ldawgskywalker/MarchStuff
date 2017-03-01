import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();

		//initialize word
		String word = "";
		
		System.out.print("Input words for ArrayList. End with -1 when done: ");
		
		//make list
		while(!word.equals("-1")){
			word = kb.next();
			//if word is set to -1, or list contains set word do not add to list 
			if(!word.equals("-1") && !list1.contains(word))
				list1.add(word);
		}

		
		//print list
		System.out.println(list1);

		
		
		
		kb.close();
	}
}
