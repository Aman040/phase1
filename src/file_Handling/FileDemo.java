package file_Handling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
public class FileDemo {
 static	Scanner sc=new Scanner(System.in);
 
	public static void createFile()throws IOException {
		List<String> list;
		String s;
		while(true) {
			System.out.println("Add text to file");
		list=Arrays.asList(sc.nextLine());
		Files.write(Paths.get("F://temp//project_File_Handling1.txt"), list,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		sc.nextLine();
		System.out.println("\nContinue.. Yes/No");
		s=sc.next();
		if(s.equalsIgnoreCase("No")) {
			System.out.println("End of Insertion to file\n");
			break;
		}
	}
		}
	public static List<String> readFile(String filename) {
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(filename),StandardCharsets.UTF_8);
		}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		return lines;
	}
	public static void appendFile(String filename,String oldText,String newText)throws FileNotFoundException,IOException {
		File file=new File(filename);
		String oldContent="";
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line=br.readLine();
		while(line!=null) {
			oldContent=oldContent+line+System.lineSeparator();
			line=br.readLine();
		}
		String append=oldContent.replaceAll(oldText, newText);
		FileWriter writer=new FileWriter(file);
		writer.write(append);
		br.close();
		writer.close();
	}
	public static void main(String[] args)throws IOException {
		String choice;
		while(true) {
		System.out.println("Enter option \nAdd \nRead \nAppend \t");
		String option=sc.next();
		switch(option) {
		case "Add":createFile();
		break;
		case "Read":List<String> l=readFile("F://temp//project_File_Handling1.txt");
		Iterator<String> itr=l.iterator();
		System.out.println("File contents are");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		break;
		case "Append":System.out.println("Enter the old text to be appended");
		sc.nextLine();
			String s1=sc.nextLine();
			System.out.println("Enter the new text");
			String s2=sc.nextLine();
			appendFile("F://temp//project_File_Handling.txt",s1,s2);
		}
		System.out.println("\nConitnue.. yes/No");
		choice=sc.next();
		if(choice.equalsIgnoreCase("No")) {
				break;
		}
	}
	}
}
