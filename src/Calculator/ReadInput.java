package Calculator;

import java.util.Scanner;

public class ReadInput {
	public static String read() {
		Scanner input = new Scanner(System.in);
		String inp = input.nextLine();
		input.close();
		return inp;
	}
}
