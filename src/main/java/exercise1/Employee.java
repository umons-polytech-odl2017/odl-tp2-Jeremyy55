package exercise1;

public abstract class Employee {
	private String name;

	public int computeSalary() {
		return 0;
	}

	public Employee(String name) {
		this.name = name;
	}

	public void sell() { }

	public void workOneHour() { }

	public String getName() {
		return name;
	}
}
