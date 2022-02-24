package First;
import java.util.Scanner;
public class Bank1 extends bank2 {
	Bank1(){
		System.out.println("A.) Create account \t B.) Deposite amount\nC.) Check Amount \t D.)Withdrwan Amount E.)Exit program.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Bank1  obj=new Bank1();
		String Case="";
		while(Case!="E") {
			Case=input.next().toUpperCase();
			obj.switchCase(Case);
			System.out.println("A.) Create account \t B.) Deposite amount\nC.) Check Amount \t D.)Withdrwan Amount E.)Exit program.");
		}
		
	}
	


	}


