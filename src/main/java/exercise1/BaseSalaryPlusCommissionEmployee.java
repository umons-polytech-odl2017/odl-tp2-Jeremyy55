package exercise1;

public class BaseSalaryPlusCommissionEmployee {
	private int fixedSalary;
	private int commission;
	private int ventes;

	public BaseSalaryPlusCommissionEmployee(int fixedSalary, int commission, int ventes) {
		this.fixedSalary = fixedSalary;
		this.commission = commission;
		this.ventes = ventes;
	}
	public int computeSalary()
	{
		return fixedSalary+commission*ventes;
	}

}
