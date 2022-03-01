class accounting{
	//class 변수와 instance 변수 정의
	public double valueOfsupply;
	public double expenseRate;
	public static double vatrate = 0.1;
	public static double[] dividend = {0.5, 0.3, 0.2};
	
	//생성자 정의
	public accounting(double valueOfsupply, double expenseRate){
		this.valueOfsupply = valueOfsupply;
		this.expenseRate = expenseRate;
	}
	
	//메소드 정의
	public double getVAT() {
		return valueOfsupply * vatrate;
	}
	public double getTotal() {
		return valueOfsupply + getVAT();
	}
	public double getExpense() {
		return valueOfsupply * expenseRate;
	}
	public double getIncome() {
		return valueOfsupply - getExpense();
	}
	public double getDividend(int i) {
		return getIncome() * dividend[i];
	}
	
	public void print(String caseName) {
		System.out.println(caseName);
		System.out.println("Value of supply: " + valueOfsupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income: " + getIncome());
		System.out.println("Dividend1: " + getDividend(0));
		System.out.println("Dividend2: " + getDividend(1));
		System.out.println("Dividend3: " + getDividend(2));	
		System.out.println("\n");
	}
}


public class account_app {
	
	public static void main(String[] args) {		
		accounting a1 = new accounting(10000, 0.3);
		accounting a2 = new accounting(20000, 0.5);
		
		a1.print("* case 1");
		a2.print("* case 2");
				
	}

}
