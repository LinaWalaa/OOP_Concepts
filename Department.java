
public class Department {
	private String name; 
	private String description; 

	private int max_number_of_students;  
	
	private Student []students = new Student[50];
	private int numberOfStudents = 0;
	
	private Course []courses = new Course[50];
	private int numberOfCourses = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMax_number_of_students() {
		return max_number_of_students;
	}

	public void setMax_number_of_students(int max_number_of_students) {
		this.max_number_of_students = max_number_of_students;
	}

	public void addCourse(Course  course) {
		courses[numberOfCourses] = course;
		numberOfCourses++;
	}

	public void report() {
		System.out.println();
		String status = (this.numberOfStudents==getMax_number_of_students())? "Full" : "Not Full";
		System.out.printf("Department Name: %s\nDescription: %s\nMax Students: %d\nStudents: %d\nStatus: %s\nCourses: %d\n", getName(), getDescription(), getMax_number_of_students(), this.numberOfStudents, status, this.numberOfCourses);
	}

	//*******Required Functions*******

	public int numberOfCourses() {
		return this.numberOfCourses;
	}

	public int numberOfStudents() {
		return this.numberOfStudents;
	}

	public Course findCourse (String name) {
		for(Course course: courses) {
			if(course.getName().equals(name))
				return course;
		}
		return null;
	}

	//return true if number of students equals max number of students
	public boolean isFull() {
		return this.numberOfStudents==getMax_number_of_students();
	}

	//assign student to this department. Student can’t be
	//enrolled to department if the department is full
	public boolean enroll(Student s) {
		if(!isFull()) {
			students[numberOfStudents] = s;
			numberOfStudents++;
			return true;
		}
		return false;
	}
}
