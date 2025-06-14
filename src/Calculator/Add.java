package Calculator;

public class Add implements Operator{

	@Override
	public double getResult(double... numbers) {
		double sum = 0.0;
		
		for(double i: numbers) {
			sum+=i;
		}
		return sum;
	}

}
