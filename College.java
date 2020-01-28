
//there is only one college to be instantiated
public class College {

//	private ArrayList<Department> listOfDepartments = new ArrayList<Department>();
	public Department [] departments = new Department[50];
	private int numberOfDepartments = 0;
	
//	private ArrayList<Student> listOfStudents = new ArrayList<Student>();
	public Student [] students = new Student[50];
	private int numberOfStudents = 0;
	
//	private ArrayList<Professor> listOfProfessors = new ArrayList<Professor>();
	public Professor [] professors = new Professor[50];
	private int numberOfProfessors = 0;
	
//	private ArrayList<Course> listOfCourses = new ArrayList<Course>();
	public Course [] courses = new Course[50];
	private int numberOfCourses = 0;

	public void addDepartment(Department dept) {
//		listOfDepartments.add(dept);
		departments[numberOfDepartments] = dept;
		numberOfDepartments++;
	}

	public void addCourse(Course course) {
//		listOfCourses.add(course);
		courses[numberOfCourses] = course;
		numberOfCourses++;
	}

	public void addProfessor(Professor prof) {
//		listOfProfessors.add(prof);
		professors[numberOfProfessors] = prof;
		numberOfProfessors++;
	}

	public void addStudent(Student stud) {
//		listOfStudents.add(stud);
		students[numberOfStudents] = stud;
		numberOfStudents++;
	}

	public void report() {
		System.out.println();
//		System.out.printf("Professors %d\nStudents %d\nDepartments %d\nCourses %d\n", listOfProfessors.size(), listOfStudents.size(), listOfDepartments.size(), listOfCourses.size());
		System.out.printf("Professors %d\nStudents %d\nDepartments %d\nCourses %d\n", this.numberOfProfessors, this.numberOfStudents, this.numberOfDepartments, this.numberOfCourses);
	}

	public void printListDepts() {
		if(this.numberOfDepartments==0) {
			System.out.println("no departments");
			return;
		}
		for (Department dept: departments) {	 
			dept.report();
		}
	}

	//*******Required Functions*******

	public int numberOfDepartments() {
//		return listOfDepartments.size();
		return this.numberOfDepartments;
	}

	public int numberOfCourses() {
//		return listOfCourses.size();
		return this.numberOfCourses;
	}

	public int numberOfProfessors() {
//		return listOfProfessors.size();
		return this.numberOfProfessors;
	}

	public int numberOfStudents() {
//		return listOfStudents.size();
		return this.numberOfStudents;
	}

	// find department with name
	public Department findDepartment(String name) {
		if(this.numberOfDepartments==0)
			return null;
		
		for (int i=0; i<this.numberOfDepartments; ++i) {
			if(departments[i].getName().equalsIgnoreCase(name))
				return departments[i];
		}
		return null;
	}
	
	public int getDepartmentIndex(String name) {
		if(this.numberOfDepartments==0)
			return -1;
		
		for (int i=0; i<this.numberOfDepartments; ++i) {
			if(departments[i].getName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}

	//find student by full name
	public Student findStudent(String name){
		if(this.numberOfStudents==0)
			return null;
		
		for (int i=0; i<this.numberOfStudents; ++i) {
			if (students[i].fullName().equalsIgnoreCase(name))
				return students[i];
		}
		return null;
	}
	
	//find student by full name
		public int getStudentIndex(String name){
			if(this.numberOfStudents==0)
				return -1;
			
			for (int i=0; i<this.numberOfStudents; ++i) {
				if (students[i].fullName().equalsIgnoreCase(name))
					return i;
			}
			return -1;
		}

	//find professor by full name
	public Professor findProfessor(String name) {
		
		if(this.numberOfProfessors==0)
			return null;
		
		for (int i=0; i<this.numberOfProfessors; ++i) {
			if(professors[i].fullName().equalsIgnoreCase(name))
				return professors[i];
		}
		return null;
	}
	
	//find professor by full name
	public int getProfessorIndex(String name) {
		
		if(this.numberOfProfessors==0)
			return -1;
		
		for (int i=0; i<this.numberOfProfessors; ++i) {
			if(professors[i].fullName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}

	//find course by its name 
	public Course findCourse (String name) {
		
		if(this.numberOfCourses==0)
			return null;
		
		for (int i=0; i<this.numberOfCourses; ++i) {
			if(courses[i].getName().equalsIgnoreCase(name))
				return courses[i];
		}
		return null;
	}
	
	//find course by its name 
	public int getCourseIndex (String name) {
			
		if(this.numberOfCourses==0)
			return -1;

		for (int i=0; i<this.numberOfCourses; ++i) {
			if(courses[i].getName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}
}
