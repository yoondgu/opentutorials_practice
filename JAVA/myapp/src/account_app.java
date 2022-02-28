
public class account_app {
	
	public static double valueOfsupply = 10000;
	public static double vatrate = 0.1;
	public static double expenseRate = 0.3;
	public static double[] dividend = {0.5, 0.3, 0.2};
	
	public static double getVAT() {
		return valueOfsupply * vatrate;
	}
	public static double getTotal() {
		return valueOfsupply + getVAT();
	}
	public static double getExpense() {
		return valueOfsupply * expenseRate;
	}
	public static double getIncome() {
		return valueOfsupply - getExpense();
	}
	public static double getDividend(int i) {
		return getIncome() * dividend[i];
	}

	public static void main(String[] args) {		
		System.out.println("Value of supply: " + valueOfsupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income: " + getIncome());
		System.out.println("Dividend1: " + getDividend(0));
		System.out.println("Dividend2: " + getDividend(1));
		System.out.println("Dividend3: " + getDividend(2));
	}

}
