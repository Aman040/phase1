package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	public static void main(String[] args)throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIn_NIO();
	}
	private static void createFileUsingFileClass() throws IOException{
		//Create file
		File file=new File("F://temp//testFile1.txt");
		if(file.createNewFile()) {
			System.out.println("File is created !");
		}else {
			System.out.println("File already exists");
		}
		//Write content
		FileWriter writer=new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}
	private static void createFileUsingFileOutputStreamClass()throws IOException{
		String data="Test data";
		FileOutputStream fout=new FileOutputStream("F://temp//testFile3.txt");
		fout.write(data.getBytes());
		fout.close();
	}
	private static void createFileIn_NIO()throws IOException{
		String data="File using NIO";
		Files.write(Paths.get("F://temp//testFile4.txt"), data.getBytes());
		List<String> lines=Arrays.asList("1st Line","2nd Line");
		Files.write(Paths.get("F://temp//files6.txt"), lines, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}

}
