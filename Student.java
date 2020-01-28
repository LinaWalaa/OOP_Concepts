
public class Student extends Person {
	private int age; 
	private Department department;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void report() {
		System.out.println();
		System.out.printf("Student Name: %s\nCourses: %s\nTelephone: %s\nAddress: %s\nAge: %d\n", fullName(), printCourses(), getTelephone(), getAddress(), getAge());
	}

}
