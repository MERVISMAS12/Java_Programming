package Calculator;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;


public class MainApp {
	public static void main(String args[]) {
		System.out.println("Enter Expression: ");
		String exp = ReadInput.read();
		System.out.print("Answer for '"+exp+"' : ");
		String numArr[] = exp.split("[-+*/]");
		String opsArr[] = exp.split("[0-9]+");
		
		Queue<String> num;
		Queue<String> ops;
				
		num = new LinkedList<String>(Arrays.asList(numArr));
		ops = new LinkedList<String>(Arrays.asList(opsArr));
		
		double res = Double.parseDouble(num.poll());

		
		while(!num.isEmpty()) {
			String opr = ops.poll();
			
			Operator operator;
			switch(opr) {
			case "+":
				operator = new Add();
				break;
			case "-":
				operator = new Sub();
				break;
			case "*":
				operator = new Mult();
				break;
			case "/":
				operator = new Div();
				break;
			default:
				continue;
			}
			
			double n = Double.parseDouble(num.poll());
			
			res = operator.getResult(res, n);
			
		}
		System.out.println(res);

	}
}
