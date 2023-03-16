package day9.ex.emp;

class Secretary extends Employee implements Bonus {
	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	public double tax() {
		return (double)(getSalary() * 0.1);
	}
	public void incentive(int pay) {
		setSalary((int)(getSalary()+(pay*0.8)));
	}

}


