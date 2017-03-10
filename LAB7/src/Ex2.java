import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		// declare scanner
		Scanner kb = new Scanner(System.in);
		// create ArrayList
		ArrayList<String> list = new ArrayList<String>();

		// initialize word
		String word = "";

		System.out.print("Input words for ArrayList. End with -1 when done: ");

		// make list
		while (!word.equals("-1")) {
			word = kb.next();
			// if word is set to -1, or list contains set word do not add to
			// list
			if (!word.equals("-1"))
				list.add(word);
		}

		// sorts list
		Collections.sort(list);

		// prints list
		System.out.println(list);
		// close scanner
		kb.close();

	}
}
