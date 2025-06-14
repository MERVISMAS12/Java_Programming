package Calculator;

public class Sub implements Operator {

	@Override
	public double getResult(double... numbers) {
		Double sum = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			sum -= numbers[i];
		}
		
		return sum;
	}

}
