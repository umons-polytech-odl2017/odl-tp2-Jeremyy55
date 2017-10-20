package exercise1;


public class FixedsalaryEmployee extends Employee{
	private int salary;
	public FixedsalaryEmployee(int salary) {
		this.salary = salary;
	}
	public int computeSalary()
	{
		return salary;
	}
}
