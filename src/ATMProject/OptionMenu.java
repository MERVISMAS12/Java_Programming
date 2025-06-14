package ATMProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	
	HashMap<Integer, Integer> data = new HashMap<>();
	
	public void getLogin() throws IOException {
		int x=1;
		
		do {
			try {
				data.put(202101034, 1234);
				data.put(202101033, 4321);
				
				System.out.println("Welcome to ATM Project");
				System.out.println("Enter cutomer number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter PIN: ");
				setPinNumber(menuInput.nextInt());

			}catch(Exception e) {
				System.out.println("\n Invalid Characters \n ");
				x=2;
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			
			if(data.containsKey(cn) && data.get(cn) == pn) {
				accountType();
			}else {
				System.out.println("\n Invalid Customer Number or PIN. \n");
			}
		}while(x==1);
	}
	
	public void accountType() {
		System.out.println("Select the Account type: ");
		System.out.println("Type 1: Checking Account");
		System.out.println("Type 2: Saving Account");
		System.out.println("Type 3: Exit");

		int select = menuInput.nextInt();
		
		switch(select) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using the ATM");
			break;
		default:
			System.out.println("\n Invaild Choice \n");
			accountType();
		}
	}

	private void getSaving() {
		System.out.println("Saving Account");
		System.out.println("Type 1: View Balance");
		System.out.println("Type 2: Withdraw funds");
		System.out.println("Type 3: Deposit funds");
		System.out.println("Type 4: Exit");

		int select = menuInput.nextInt();
		
		switch(select){
		case 1:
			System.out.println("Checking Acount Balance: " + getSavingBalance());
			break;
		case 2:
			getSavingWithdraw();
			accountType();
			break;
		case 3:
			getSavingDeposit();
			accountType();
			break;
		case 4:
			System.out.println("Thank you for using the ATM");
			break;
		default:
			System.out.println("\n Invaild Choice \n");
			accountType();
		}
		
	}

	private void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1: View Balance");
		System.out.println("Type 2: Withdraw funds");
		System.out.println("Type 3: Deposit funds");
		System.out.println("Type 4: Exit");

		int select = menuInput.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Checking Acount Balance: " + getCheckingBalance());
			break;
		case 2:
			getCheckingWithdraw();
			accountType();
			break;
		case 3:
			getCheckingDeposit();
			accountType();
			break;
		case 4:
			System.out.println("Thank you for using the ATM");
			break;
		default:
			System.out.println("\n Invaild Choice \n");
			accountType();
		}
		
	}
}
