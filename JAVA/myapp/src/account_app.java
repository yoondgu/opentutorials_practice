
public class account_app {

	public static void main(String[] args) {
		
		double valueOfsupply = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double expenseRate = 0.3;

		double vat = valueOfsupply * vatrate;
		double total = valueOfsupply + vat;
		double expense = valueOfsupply * expenseRate;
		double income = valueOfsupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		
		System.out.println("Value of supply: " + valueOfsupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total: " + total);
		System.out.println("Expense: " + expense);
		System.out.println("Income: " + income);
		System.out.println("Dividend: " + dividend1);
		System.out.println("Dividend: " + dividend2);
		System.out.println("Dividend: " + dividend3);
		
		
	}

}
