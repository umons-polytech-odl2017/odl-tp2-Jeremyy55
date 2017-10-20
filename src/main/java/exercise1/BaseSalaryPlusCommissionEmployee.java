package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private int fixedSalary;
	private int commission;
	private int ventes=0;

	public BaseSalaryPlusCommissionEmployee(int fixedSalary, int commission) {
		this.fixedSalary = fixedSalary;
		this.commission = commission;

	}
	public int computeSalary()
	{
		return fixedSalary+commission*ventes;
	}

	public void sell() {
		ventes++;
	}

	public void workOneHour() { }

}
