import java.util.*;
import java.io.*;
public class Exercise1 {
	public static void main(String[] args) throws IOException{
		String word,file,name;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the name of the file to read from: ");
			file = kb.nextLine();		
		File inFile = new File(file);
		Scanner input = new Scanner(inFile);
		
		System.out.print("Enter the String to remove: ");
			word = kb.nextLine();
			
		System.out.print("Enter the name of the file to write into: ");
			name = kb.nextLine();
		
		PrintWriter outputFile = new PrintWriter(new FileWriter(name));
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
