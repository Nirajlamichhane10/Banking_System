package First;
import java.util.Hashtable;
import java.util.Scanner;
public class bank2 {
	String user_name;
	float user_amount;
	String choice;
	Hashtable<String,Float> data=new Hashtable<String, Float>(); 

	Scanner input=new Scanner(System.in);
	bank2(){
		System.out.println("Herald Bank.");
	}

	boolean check_account(String name) {
		boolean checked=false;
	for(String i : data.keySet()) {
		if (name.equals(i)) {
			checked= true;
		}
	}
	return checked;
	}




	void create_account(String name,float amount) {
		if (check_account(name)==true) {
			System.out.println("account exists");
		}
		else {
		data.put(name, amount);
		System.out.println("account created.\n acc Holder name="+name+"\n total amount="+amount);
		}

	}



	void depositamount(String name,float deposite_amount ) {
		
		if(check_account(name)) {
			float previous_amount=data.get(name);
			data.replace(name, previous_amount+deposite_amount);
		}
		else {
			System.out.println("user not exist");
		}
	}
	float check_amount(String name){
		if (check_account(name)) {
			return data.get(name);
		}
		else {
			System.out.println("user not exist");
			return 0.0f;
		}
		}
	void withdrawn_amount(String name, float withdrawn_amount) {
		if (check_account(name)) {
			if(check_amount(name)>=withdrawn_amount) {
					data.replace(name,data.get(name)-withdrawn_amount);
					System.out.println("Transaction successfull. \nThank you for banking with us.");
			}
			else {
				System.out.println("Not enough balance");
			}
		}
	}

	private void quit_program() {
	System.exit(0);

	}
	void switchCase(String Case) {
		switch (Case){
			case "A":
				System.out.println("Enter the account holder name");
				String user_name=input.next();
				System.out.println("Enter the ammount to deposite");
				user_amount=input.nextFloat();
				create_account(user_name,user_amount);
				break;
			case "B":
				System.out.println("Enter the account holder name");
				String name=input.next();
				System.out.println("Enter the ammount to deposite");
				user_amount=input.nextFloat();
				depositamount(name,user_amount);
				break;
			case "C":
				System.out.println("Enter the account holder name");
				String holder_name=input.next();
				System.out.println (check_amount(holder_name));
				break;
			case "D":
				System.out.println("Enter the account holder name");
				String username=input.next();
				System.out.println("Enter the ammount to withdraw");
				user_amount=input.nextFloat();
				withdrawn_amount(username,user_amount);
				break;
				
		case "E":
			
			quit_program();
			break;
		}
		}
	}



