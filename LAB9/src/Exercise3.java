import java.util.*;
import java.io.*;
public class Exercise3 {
	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);
	
		//CREATE TXT DOC CALLED "NUMBERS"
		PrintWriter outputFile = new PrintWriter(new FileWriter("numbers"));
		
		//WRITES 100 RANDOM NUMBERS TO "NUMBERS.TXT"
		for(int i=0;i<100;i++){
			outputFile.println((int)(Math.random()*1000+1));
		}
		System.out.println("Successfully written to \"numbers.txt\"!");
		
		//SET NUMBERS.TXT AS SCANNER
		Scanner input = new Scanner(new File("numbers"));
		
		//WRITES TXT DOCUMENT INTO ARRAY
		LinkedList o = new LinkedList();
		while(input.hasNext()){
		//I don't understand why this part will
		//not work. the "input.nextInt()" seems 
		//to not take anything in as a value
			long test=input.nextLong();
			o.add(test);
		}
		//SORTS ARRAY
		Collections.sort(o);
		
		
		//TO CREATE NEW TXT FILE, ORDERED VER. OF "NUMBERS.TXT"
		PrintWriter out = new PrintWriter(new FileWriter("ordered"));
		
		//WRITES SORTED ARRAY INTO NEW TXT DOC
		for(int i=0;i<o.size();i++){
			out.println(o.get(i));
		}
		
		System.out.println("Successfully printed sorted numbers to \"ordered.txt\"");
		
		//close
		outputFile.close();
		out.close();
		kb.close();
		input.close();
		
	}
}
