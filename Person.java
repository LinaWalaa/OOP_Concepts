
public abstract class Person {
	protected String firstName, lastName, telephone, address; 

	protected Course [] courses = new Course[50];
	protected int numberOfCourses = 0;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addCourse(Course  course) {
		courses[numberOfCourses] = course;
		numberOfCourses++;
	}
	
	public String printCourses() {
		String list = "";
		for(int i=0; i<numberOfCourses; ++i) {
			list+=courses[i].getName();
			if(i!=numberOfCourses-1)
				list+=", ";
		}
		return list;
	}
	
	//*******Required Functions*******

	// return “firstName lastName”
	public String fullName() {
		return firstName + " " + lastName;
	}

}
