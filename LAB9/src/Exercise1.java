import java.util.*;
import java.io.*;
public class Exercise1 {
	public static void main(String[] args) throws IOException{
		String word,file,name;
		
		Scanner kb = new Scanner(System.in);
		//USER INPUTS FILENAME
		System.out.print("Enter the name of the file to read from: ");
			file = kb.nextLine();	
		//DECLARES FILE, DECLARES IT AS SCANNER
		File inFile = new File(file);
		Scanner input = new Scanner(inFile);
		
		//USER INPUTS STRING TO REMOVE
		System.out.print("Enter the String to remove: ");
			word = kb.nextLine();
		
		//USER INPUTS NEW FILENAME
		System.out.print("Enter the name of the file to write into: ");
			name = kb.nextLine();
		
		//SETS INPUT NAME AS NEW FILE
		PrintWriter outputFile = new PrintWriter(new FileWriter(name));
		//WRITES TO NEW FILE
		while(input.hasNext()){
			String line = input.nextLine();
			if(!line.equals(word))
				outputFile.println(line);
		}
		
		System.out.print("Successfully created file!");
		
		//close
		kb.close();
		outputFile.close();
		input.close();
	}
}
