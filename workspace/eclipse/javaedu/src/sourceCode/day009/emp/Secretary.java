package sourceCode.day009.emp;


public class Secretary extends Employee implements Bonus {

	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return getSalary() * 0.1;
	}


	public void incentive(int pay) {
		int incen =  (int) Math.round(pay*0.8);
		setSalary(getSalary()+incen);
	}
}
