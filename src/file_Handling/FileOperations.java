package file_Handling;

import java.io.*;
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
		Scanner sc = new Scanner(System.in);
		Path path = Paths.get(p);
		System.out.println("Enter text");
		List<String> list = Arrays.asList(sc.nextLine());
		try {
			Files.write(path, list, StandardOpenOption.CREATE_NEW);
			System.out.println("File Created");
		} catch (IOException e) {
			try {
				Files.write(path, list, StandardOpenOption.APPEND);
				System.out.println("File appended");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		sc.close();
	}

	public static List<String> readFile(String p) throws FileNotFoundException {
		List<String> l = new ArrayList<>();
		try {
			l = Files.readAllLines(Paths.get(p), StandardCharsets.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	public static void updateFile(String path, String oldValue, String newValue) throws FileNotFoundException {
		try {
			List<String> newList=new ArrayList<String>();
			List<String> list=Files.readAllLines(Paths.get(path));
			for(String line:list) {
				String modifiedLine=line.replaceAll(oldValue, newValue);
				newList.add(modifiedLine);
			}
			Files.write(Paths.get(path),newList, StandardCharsets.UTF_8);
			System.out.println("File modified");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option\n 1:Create File or Append\n 2:Read Content\n 3:Update file");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			createAndAppendFile("F:\\temp\\test1.txt");
			break;
		case 2:
			List<String> list = readFile("F:\\temp\\test1.txt");
			Iterator<String> itr = list.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			break;
		case 3:
			System.out.println("Enter word to be replaced");
			String word = sc.next();
			System.out.println("Enter new word");
			String newWord = sc.next();
			updateFile("F:\\temp\\test1.txt", word, newWord);
			break;
		default:
			System.out.println("Wrong choice Entered");
		}
		sc.close();
	}
}
