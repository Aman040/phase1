package file_Handling;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class FileOperations {
	public static void createAndAppendFile(String p) {
		Scanner sc=new Scanner(System.in);
		Path path=Paths.get(p);
		List<String> list=Arrays.asList(sc.nextLine());
		try {
			Files.write(path, list, StandardOpenOption.CREATE_NEW);
			System.out.println("File Created");
		} catch (IOException e) {
			try {
			Files.write(path,list,StandardOpenOption.APPEND);
			System.out.println("File appended");
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}	
		sc.close();
	}
	public static List<String> readFile(String p)throws FileNotFoundException {
		List<String> l=new ArrayList<>();
		try {
			l=Files.readAllLines(Paths.get(p),StandardCharsets.UTF_8);
		}catch(Exception e){
			e.printStackTrace();
		}
		return l;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option\n 1:Create File or Append\n 2:Read Content");
		int n=sc.nextInt();
		switch(n) {
		case 1:createAndAppendFile("F:\\temp\\test1.txt");
			break;
		case 2:List<String> list=readFile("F:\\temp\\test1.txt");
				Iterator<String> itr=list.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			break;
		default:System.out.println("Wrong choice Entered");
	}
		sc.close();
	}
}
