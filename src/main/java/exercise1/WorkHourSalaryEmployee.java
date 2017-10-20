package exercise1;

public class WorkHourSalaryEmployee extends Employee{

	private int hourRate;
	private int hour=0;

	public WorkHourSalaryEmployee(int hour, int hourRate) {
		this.hour = hour;
		this.hourRate = hourRate;

	}


	public void workOneHour() {
		hour++;
	}

	public int computeSalary()
	{
		return hour*hourRate;
	}
}
