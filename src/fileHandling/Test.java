package fileHandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		try {
			Files.deleteIfExists(Paths.get("F://temp//testFile.txt"));
		}
		catch(NoSuchFileException e) {
			System.out.println("No such file/directory exists");
		}
		catch(DirectoryNotEmptyException e1) {
			System.out.println("Directory not empty");
		}
	catch(IOException e2) {
			System.out.println("Invalid permission");
		}
		System.out.println("Deletion successful");
	}

}
