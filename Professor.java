
public class Professor extends Person {

	private double salary; 

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void report() {
		System.out.println();
		System.out.printf("Professor Name: %s\nCourses: %s\nTelephone: %s\nAddress: %s\nSalary: %.2f\n", fullName(), printCourses(), getTelephone(), getAddress(), getSalary());
	}

	//*******Required Functions*******

	// recalculate professor salary
	public double getRaise(double ratio) {
		setSalary(salary + salary*ratio);
		return salary + salary*ratio;
	}

}
