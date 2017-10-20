package exercise1;


public class FixedsalaryEmployee extends Employee{
	private int salary;

	public FixedsalaryEmployee(int salary,String name) {
		super(name);
		this.salary = salary;

	}
	public int computeSalary()
	{
		return salary;
	}
}
