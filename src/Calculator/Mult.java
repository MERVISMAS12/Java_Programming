package Calculator;

public class Mult implements Operator{

	@Override
	public double getResult(double... numbers) {
		double sum = 1.0;
		
		for(double i: numbers) {
			sum*=i;
		}
		return sum;
	}
	
}
