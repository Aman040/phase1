package fileHandling;

import java.util.Collections;
import java.util.Iterator;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class ReadFileIntoList {
	public static List<String> readFileInList(String fileName){
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lines;
	}
	public static void main(String[] args) {
		List<String> l=readFileInList("F://temp//testFile3.txt");
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
