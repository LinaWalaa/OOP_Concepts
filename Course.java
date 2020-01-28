
public class Course {
	private String name; 
	private String description; 
	private int number_of_lectures;

	private int max_number_of_students; 
	
	//not initialized with max_number_of_students bec it gives ArrayIndexOutOfBoundsException
	private Student []students = new Student[50];
	private int numberOfStudents = 0;

	private Department department;
	private Professor professor;

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

	public int getNumber_of_lectures() {
		return number_of_lectures;
	}

	public void setNumber_of_lectures(int number_of_lectures) {
		this.number_of_lectures = number_of_lectures;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getMax_number_of_students() {
		return max_number_of_students;
	}

	public void setMax_number_of_students(int max_number_of_students) {
		this.max_number_of_students = max_number_of_students;
	}

	public void report() {
		System.out.println();
		String status = (this.numberOfStudents==getMax_number_of_students())? "Full" : "Not Full";
		System.out.printf("Course Name: %s\nDescription: %s\nDepartment: %s\nLectures: %d\nMax Students: %d\nStudents: %d\nStatus: %s\nProfessor: %s\n", getName(),getDescription(), department.getName(), getNumber_of_lectures(), getMax_number_of_students(), this.numberOfStudents, status, professor.fullName());
	}	 

	//*******Required Functions*******

	public int numberOfStudents() {
//		return listOfStudents.size();
		return this.numberOfStudents;
	}

	// assign professor to course. Course can
	//have only one professor.
	public boolean assignProfessor(Professor professor) {
		if (this.professor==null) {
			setProfessor(professor);
			return true;
		}
		return false;
	}
	// unassign professor from course.
	public void unassignProfessor(Professor professor) {
		if(getProfessor()==professor) {
			setProfessor(null);
		}
	}

	// return true if course is assigned to a professor.
	public boolean isAssigned() {
		if (this.professor!=null) {
			return true;
		}
		return false;
	}

	// return professor full name
	public String professorName() {
		return this.professor.fullName();
	}

	// return true if number of students equals max number of students
	public boolean isFull() {
		return this.numberOfStudents==getMax_number_of_students();
	}

	// assign student to this course. Student can’t be enrolled
	//		to a course if the course is full. Student can’t be 
	//		enrolled to a course if he isn’t
	//		enrolled in its department.

	public boolean enroll(Student s) {
		if(!isFull()) {
			students[numberOfStudents] = s;
			numberOfStudents++;
			return true;
		}
		return false;
	}
}