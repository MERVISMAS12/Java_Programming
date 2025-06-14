package MyPackage;

public class SwitchCase {
	public static void main(String args[]) {
		int m =6;
		String month;
		switch(m) {
		case 1: 
			month = "JAN";
			break;
		case 2: 
			month = "FEB";
			break;
		case 3: 
			month = "MAR";
			break;
		case 4: 
			month = "APR";
			break;
		case 5: 
			month = "MAY";
			break;
		case 6: 
			month = "JUN";
			break;
		case 7: 
			month = "JUL";
			break;
		case 8: 
			month = "AUG";
			break;
		case 9: 
			month = "SEP";
			break;
		case 10: 
			month = "OCT";
			break;
		case 11: 
			month = "NOV";
			break;
		case 12: 
			month = "DEC";
			break;
		default:
			month = "Invalid Month";
			break;
		}
		System.out.println("Month: "+ month);
	}
}
