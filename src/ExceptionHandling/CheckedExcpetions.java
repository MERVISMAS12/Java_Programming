package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExcpetions {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		FileReader f1 = new FileReader("c:\\test.c");
		BufferedReader fileInput = new BufferedReader(f1);
		
		for(int i=0; i<3; i++) {
			System.out.println(fileInput.readLine());
		}
		fileInput.close();
	}
	
	
}
