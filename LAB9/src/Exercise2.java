import java.util.Scanner;
import java.net.URL;
public class Exercise2 {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(System.in);
		String site, word;
		int count = 0;
		//USER INPUTS WEBSITE
		System.out.print("Input website you would like to access: ");
			site = kb.nextLine();
		URL url = new URL(site);
		
		//USER INPUTS WORD
		System.out.print("Choose a word: ");
			word = kb.nextLine();
			
		//SITE SET TO INPUT
		Scanner input = new Scanner(url.openStream());
		
		//GOES THROUGH SITE COUNTING GIVEN WORD
		while (input.hasNext()) {
			String line = input.nextLine();
				if(line.contains(word))
					count ++;
		}
		//DISPLAYS count TO USER
		System.out.println("The site contains the word \""+word+"\" "+count+" times");
		
		//CLOSE
		input.close();
		kb.close();
	}

}