package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		System.out.println("Salut,; nous voila dans le fixedSalaryEmployee");
		FixedsalaryEmployee thierry = new FixedsalaryEmployee(fixedSalary, name);
		System.out.print(thierry.computeSalary());
		return null;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		return null;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {
		return null;
	}
}

