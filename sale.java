
import java.util.Scanner;


public class loanloop {

	public static void main(String[] args) {
		int months;
		double annualinterest;
		double monthlyinterest;
		double loanAmount;
		double balance;
		double interest;
		double principal;
		double monthlypayment;
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("Welcome to the Loan Amortization Program of XYZ Banking ");
		System.out.println("This program will help you determine the payment structure");
	    System.out.println("of your loan.");
	    System.out.println("Let us get started:");
	do
	{
	    System.out.println("Enter the loan amount you are requesting: ");
	    loanAmount=input.nextDouble();
		System.out.println("Enter the number of months for the loan:" );
		months=input.nextInt();
		System.out.println("Enter the APR you have been quoted:" );
		annualinterest=input.nextDouble();
		
		monthlyinterest= annualinterest/1200;
		monthlypayment= loanAmount*monthlyinterest/(1-1/Math.pow(1+ monthlyinterest, months*12));
		balance=loanAmount;
		double totalPayment = monthlypayment*months*12;
		System.out.println();
		System.out.println("The monthly payment will be: $ "
			+ (int)(monthlypayment *100)/100.0);
		System.out.println("The total paid (with interest) will be: $"
			+ (int)(totalPayment *100)/100.0);
		System.out.println("Payment#\t Interest\tPrincipal\tBalance"
				);
		int i;
		for (i=1; i<=months*12; i++)
		{
			interest = (int) (monthlyinterest * balance *100)/100;
			principal = (int) (monthlypayment-interest;
			balance= balance - principal;
			System.out.format(i+"\t\t" + "%.2f", interest ,"\t\t" + "%.2f", principal, "\t\t" + "%.2f", balance);
		}
	
			System.out.println();
		System.out.println("Would you like to calculate another loan (Y/N): ");	
	while (input.next().charAt(0)=='Y');
		System.out.println("Thank you for using the Loan Amortization Program of XYZ Banking.");	
		System.out.println("Goodbye");
	input.close();
	}
	
}
