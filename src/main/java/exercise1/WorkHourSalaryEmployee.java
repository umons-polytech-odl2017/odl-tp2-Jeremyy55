package exercise1;

public class WorkHourSalaryEmployee {
	private int hour;
	private int hourRate;

	public WorkHourSalaryEmployee(int hour, int fixedSalary, int hourRate) {
		this.hour = hour;
		this.hourRate = hourRate;

	}
	public int computeSalary()
	{
		return hour*hourRate;
	}
}
