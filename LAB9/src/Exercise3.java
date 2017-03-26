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
		int[] n = new int[100];
		for(int i=0;i<100;i++){
			n[i]=input.nextInt();
		}
		//SORTS ARRAY
		Arrays.sort(n);
		
		//TO CREATE NEW TXT FILE, ORDERED VER. OF "NUMBERS.TXT"
		PrintWriter out = new PrintWriter(new FileWriter("ordered"));
		
		//WRITES SORTED ARRAY INTO NEW TXT DOC
		for(int i=0;i<n.length;i++){
			out.println(n[i]);
		}
		
		System.out.println("Successfully printed sorted numbers to \"ordered.txt\"");
		
		//close
		outputFile.close();
		out.close();
		kb.close();
		input.close();
		
	}
}
