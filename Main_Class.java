import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Class {

	
	public static void main(String[] args) {
		
		//Menu
		System.out.println("Welcome to our university!");
		System.out.println("Operations: ");
//		*************************************************
		System.out.println("1- College");
		System.out.println("\ta) Number of Departments");
		System.out.println("\tb) Number of Courses");
		System.out.println("\tc) Number of Professors");
		System.out.println("\td) Number of Students");
		System.out.println("\te) Report");
//		*************************************************
		System.out.println("2- Department");
		System.out.println("\ta) New");
		System.out.println("\tb) Number of Courses");
		System.out.println("\tc) Number of Students");
		System.out.println("\td) Is Full");
		System.out.println("\te) Enroll");
		System.out.println("\tf) Report");
//		*************************************************
		System.out.println("3- Course");
		System.out.println("\ta) New");
		System.out.println("\tb) Number of Students");
		System.out.println("\tc) Assign");
		System.out.println("\td) Is assigned");
		System.out.println("\te) Professor Name");
		System.out.println("\tf) Is Full");
		System.out.println("\tg) Enroll");
		System.out.println("\th) Report");
//		*************************************************
		System.out.println("4- Professor");
		System.out.println("\ta) New");
		System.out.println("\tb) Display Salary");
		System.out.println("\tc) Get Raise");
		System.out.println("\td) Report");
//		*************************************************
		System.out.println("5- Student");
		System.out.println("\ta) New");
		System.out.println("\tb) Report");
//		*************************************************
		System.out.println("6- Quit");
//		*************************************************
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String choice;
		College college = new College();
		
		while(true) {
			System.out.println("================ \nEnter Operation \n================");
			choice = input.next();
			switch(choice) {
			
			//1- College
			case "1a":
				System.out.print("Number Of Departments: ");
				collegeOperations(college, choice);
				break;
			case "1b":
				System.out.print("Number Of Courses: ");
				collegeOperations(college, choice);
				break;
			case "1c":
				System.out.print("Number Of Professors: ");
				collegeOperations(college, choice);
				break;
			case "1d":
				System.out.print("Number Of Students: ");
				collegeOperations(college, choice);
				break;
			case "1e":
				System.out.print("College Report: ");
				collegeOperations(college, choice);
				break;
//			*************************************************
			//2- Department	
			case "2a":
				System.out.println("Add a new Department: ");
				college = departmentOperations(college, choice);
				break;
			case "2b":
				System.out.println("Number Of Courses in a certain Department: ");
				departmentOperations(college, choice);
				break;
			case "2c":
				System.out.println("Number Of Students in a certain Department: ");
				departmentOperations(college, choice);
				break;
			case "2d":
				System.out.println("Is Department Full? ");
				departmentOperations(college, choice);
				break;
			case "2e":
				System.out.println("Enroll a Student in a Department: ");
				departmentOperations(college, choice);
				break;
			case "2f":
				System.out.println("Department Report: ");
				departmentOperations(college, choice);
				break;
//			*************************************************	
			//3- Course
			case "3a":
				System.out.println("Add a new Course: ");
				college = courseOperations(college, choice);
				break;
			case "3b":
				System.out.println("Number Of Students enrolled in a certain course: ");
				courseOperations(college, choice);
				break;
			case "3c":
				System.out.println("Assign a Professor to a Course: ");
				college = courseOperations(college, choice);
				break;
			case "3d":
				System.out.println("Does this Course have a assigned Professor: ");
				courseOperations(college, choice);
				break;
			case "3e":
				System.out.println("Professor Name assigned to this Course: ");
				courseOperations(college, choice);
				break;
			case "3f":
				System.out.println("Check if Course is Full: ");
				courseOperations(college, choice);
				break;
			case "3g":
				System.out.println("Enroll a student in Course: ");
				college = courseOperations(college, choice);
				break;
			case "3h":
				System.out.println("Course Report: ");
				courseOperations(college, choice);
				break;
//			*************************************************	
			//4- Professor	
			case "4a":
				System.out.println("Add a new Professor: ");
				college = professorOperations(college, choice);
				break;
			case "4b":
				System.out.println("Professor Salary: ");
				professorOperations(college, choice);
				break;
			case "4c":
				System.out.println("Professor Raise in Salary: ");
				college = professorOperations(college, choice);
				break;
			case "4d":
				System.out.println("Professor Report: ");
				professorOperations(college, choice);
				break;
//			*************************************************	
			//5- Student
			case "5a":
				System.out.println("Add a new Student: ");
				college = studentOperations(college, choice);
				break;
			case "5b":
				System.out.println("Student Report: ");
				studentOperations(college, choice);
				break;
//			*************************************************				
			//6- Quit
			case "6":
				System.out.println("You've requested to exit the Menu!");
				break;
			default:
				System.out.printf("The choice '%s' you entered is not valid!\n", choice);
			input.reset();
			}
			
		}

	}

	public static void validateIntegerInput(String input) {
		
		try {
			Integer.parseInt(input);
		}catch(NumberFormatException e) {
//			menu;
		}
	}
	
	private static void collegeOperations(College college, String choice) {
		
		switch(choice) {
		case "1a":
			System.out.println(college.numberOfDepartments());
			break;
		case "1b":
			System.out.println(college.numberOfProfessors());
			break;
		case "1c":
			System.out.println(college.numberOfProfessors());
			break;
		case "1d":
			System.out.println(college.numberOfStudents());
			break;
		case "1e":
			college.report();
			break;
		}
		
	}

	private static College departmentOperations(College college, String choice) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Department dept;
		
		switch(choice) {
		
		//Adding a new Department
		case "2a":
			dept = new Department();
			
			System.out.print("Department Name: ");
			dept.setName(input.nextLine());
			input.reset();
			
			System.out.print("Department Description: ");
			dept.setDescription(input.nextLine());
			input.reset();
			
			while(true) {
				System.out.print("Department Max Number of Students: ");
				try {
					dept.setMax_number_of_students(input.nextInt());	
					input.reset();
					break;
				}catch(InputMismatchException e) {
					System.err.println("You need to enter an integer value!");
				}
				input = new Scanner(System.in);
			}
			
			if(college.findDepartment(dept.getName())==null){
				college.addDepartment(dept);
			}else {
				System.out.println("Department Already Exists!\n Your Entry wasn't added!");
			}
			break;
		
		//Number Of Courses in a certain department	
		case "2b":
			dept = new Department();
			
			System.out.print("Department Name: ");
			dept = college.findDepartment(input.nextLine());
			input.reset();
			
			if(dept==null) {
				System.out.println("No such department");
			}else {
				System.out.printf("Number Of Courses in %s is: %d\n", dept.getName(), dept.numberOfCourses());
			}
			break;
		
		//Number Of Students in a certain department	
		case "2c":
			dept = new Department();
			
			System.out.print("Department Name: ");
			dept = college.findDepartment(input.nextLine());
			input.reset();
			
			if(dept==null) {
				System.out.println("No such department");
			}else {
				System.out.printf("Number Of Students in %s is: %d\n", dept.getName(), dept.numberOfStudents());
			}
			break;
			
		//Is Department Full? 	
		case "2d":
			dept = new Department();
			
			System.out.print("Department Name: ");
			dept = college.findDepartment(input.nextLine());
			input.reset();
			
			if(dept==null) {
				System.out.println("No such department");
			}else {
				System.out.printf("Is Department '%s' full?\n%b\n", dept.getName(), dept.isFull());
			}
			break;
			
		//enroll a student	
		case "2e":
			dept = new Department();
			
			System.out.print("Department Name: ");
			dept = college.findDepartment(input.nextLine());
			input.reset();
			
			if(dept==null) {
				System.out.println("No such department");
			}else {
				Student stud = new Student();
				
				System.out.print("Student Name: ");
				stud = college.findStudent(input.nextLine());
				input.reset();
				
				if(stud==null) {
					System.out.println("No such student");
				}else {
					int index = college.getDepartmentIndex(dept.getName());
					boolean enrolled = college.departments[index].enroll(stud);
					
					if(enrolled) {
						System.out.printf("Student %s was enrolled successfuly in Deprtment %s\n", stud.fullName(), dept.getName());
					}else {
						System.out.printf("Deprtment %s is full, Student %s wasn't enrolled!\n", dept.getName(), stud.fullName());
					}
				}
			}
			break;
		
		//department report	
		case "2f":
			dept = new Department();
			
			System.out.print("Department Name: ");
			dept = college.findDepartment(input.nextLine());
			input.reset();
			
			if(dept==null) {
				System.out.println("No such department");
			}else {
				dept.report();
			}
			break;
		}
		return college;
	}

	private static College courseOperations(College college, String choice) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Course course;
		
		switch(choice){
		
//		Add a new Course
		case "3a":
			course = new Course();
			
			System.out.print("Course Name: ");
			course.setName(input.nextLine());
			input.reset();
			
			System.out.print("Course Description: ");
			course.setDescription(input.nextLine());
			input.reset();
			
			while(true) {
				System.out.print("Course Max number of Students: ");
				try {
					course.setMax_number_of_students(input.nextInt());
					input.reset();
					break;
				}catch(InputMismatchException e) {
					System.err.println("You need to enter an integer value!");
				}
				input = new Scanner(System.in);
			}
			
			System.out.print("Course number of Lectures: ");
			course.setNumber_of_lectures(input.nextInt());
			input.reset();
			
			//bec it doesn't give me a space when I try to take a new line
			input = new Scanner(System.in);
			
			if(college.findCourse(course.getName())!=null) {
				System.out.printf("Course '%s' already exits no changes were made!\n", course.getName());
			}else {
				System.out.print("Department Name: ");
				Department dept = college.findDepartment(input.nextLine());
				input.reset();
				
				if(dept==null) {
					System.out.println("No Such Department");
				}else {
					course.setDepartment(dept);
					college.addCourse(course);
					
					int index = college.getDepartmentIndex(dept.getName());
					college.departments[index].addCourse(course);
				}
			}
			break;
			
		//Number of Students taking this course	
		case "3b":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				System.out.printf("Number of Students enrolled in '%s' is: %d\n", course.getName(), course.numberOfStudents());
			}
			break;
			
		case "3c":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				if(!course.isAssigned()) {
					System.out.print("Professor Name: ");
					Professor prof = college.findProfessor(input.nextLine()); 
					input.reset();
					
					if(prof==null) {
						System.out.printf("No such Professor! \nNobody got assigned to the %s course!\n", course.getName());
					}else {
						int index = college.getProfessorIndex(prof.fullName());
						college.professors[index].addCourse(course);
						
						index = college.getCourseIndex(course.getName());
						college.courses[index].assignProfessor(prof);
						
						System.out.printf("Professor %s got assigned to the %s Course!\n", prof.fullName(), course.getName());
					}
				}else {
					System.out.printf("Course %s already has an assigned Professor!\n", course.getName());;
				}
			}
			break;
		
		//Is Assigned	
		case "3d":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				if(course.isAssigned()) {
					System.out.printf("Course %s has an assigned Professor!\n", course.getName());
				}else {
					System.out.printf("No professor assigned to the %s course!", course.getName());
				}
			}
			break;
		
		//Professor Name	
		case "3e":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				if(course.isAssigned()) {
					Professor prof = course.getProfessor();
					System.out.printf("Professor %s is assigned to course %s!\n", prof.fullName(), course.getName());
				}else {
					System.out.printf("No professor assigned to the %s course!", course.getName());
				}
			}
			break;
			
		//is course full	
		case "3f":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				System.out.printf("Is course '%s' full? \n%b \n", course.getName(), course.isFull());
			}
			break;
			
		//enroll a student in course
		case "3g":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				Student stud = new Student();
				
				System.out.print("Student Name: ");
				stud = college.findStudent(input.nextLine());
				input.reset();
				
				if(stud==null) {
					System.out.println("No such student");
				}else {
					int index = college.getCourseIndex(course.getName());
					boolean enrolled = college.courses[index].enroll(stud);
					
					if(enrolled) {
						index = college.getStudentIndex(stud.fullName());
						college.students[index].addCourse(course);
						System.out.printf("Student %s was enrolled successfuly in Course %s\n", stud.fullName(), course.getName());
					}else {
						System.out.printf("Course %s is full, Student %s wasn't enrolled!\n", course.getName(), stud.fullName());
					}
				}
			}
			break;
			
		//Course Report	
		case "3h":
			course = new Course();
			
			System.out.print("Course Name: ");
			course = college.findCourse(input.nextLine());
			input.reset();
			
			if(course==null) {
				System.out.println("No such course!");
			}else {
				course.report();
			}
			break;
		}

		return college;
	}
	
	private static College professorOperations(College college, String choice) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Professor prof;
		
		switch(choice) {
		
		//"Add a new Professor
		case "4a":
			prof = new Professor();
			
			System.out.print("Professor First Name: ");
			prof.setFirstName(input.next());
			input.reset();
			
			System.out.print("Professor Last Name: ");
			prof.setLastName(input.next());
			input.reset();
			
			System.out.print("Professor Telephone: ");
			prof.setTelephone(input.next());
			input.reset();
			
			//to be able to take a full new line I had to re-initialize input
			input = new Scanner(System.in);
			
			System.out.print("Professor Address: ");
			prof.setAddress(input.nextLine());
			input.reset();
			
			while(true) {
				System.out.print("Professor Salary: ");
				try {
					prof.setSalary(input.nextDouble());
					input.reset();
					break;
				}catch(InputMismatchException e) {
					System.err.println("You need to enter an integer/double value!");
				}
				input = new Scanner(System.in);
			}
			
			if(college.findProfessor(prof.fullName())!=null) {
				System.out.printf("Professor '%s' already exists, no entry added!\n", prof.fullName());
			}else {
				college.addProfessor(prof);
			}
			break;
			
		//display salary	
		case "4b":
			prof = new Professor();
			
			System.out.print("Professor Name: ");
			prof = college.findProfessor(input.nextLine());
			input.reset();
			
			if(prof==null) {
				System.out.println("No such Professor!");
			}else {
				System.out.printf("Professor %s's salary is %.2f\n", prof.fullName(), prof.getSalary());
			}
			break;
		
		//raise salary	
		case "4c":
			prof = new Professor();
			
			System.out.print("Professor Name: ");
			prof = college.findProfessor(input.nextLine());
			input.reset();
			
			if(prof==null) {
				System.out.println("No such Professor!");
			}else {
				int index = college.getProfessorIndex(prof.fullName());
				
				while(true) {
					System.out.print("Raise: ");
					try {
						college.professors[index].getRaise(input.nextDouble());
						input.reset();
						
						System.out.printf("Professor %s's salary after raise is %.2f\n", college.professors[index].fullName(), college.professors[index].getSalary());
						break;
					}catch(InputMismatchException e) {
						System.err.println("You need to enter an integer/double value!");
					}
					input = new Scanner(System.in);
				}	
			}
			break;
		
		//display report	
		case "4d":
			prof = new Professor();
			
			System.out.print("Professor Name: ");
			prof = college.findProfessor(input.nextLine());
			input.reset();
			
			if(prof==null) {
				System.out.println("No such Professor!");
			}else {
				prof.report();
			}
			break;
		}
		
		return college;
	}
	
	private static College studentOperations(College college, String choice) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Student stud;
		
		switch(choice) {
		
		//Add a new Student
		case "5a":

			stud = new Student();
			
			System.out.print("Student First Name: ");
			stud.setFirstName(input.next());
			input.reset();
			
			System.out.print("Student Last Name: ");
			stud.setLastName(input.next());
			input.reset();
			
			System.out.print("Student Telephone: ");
			stud.setTelephone(input.next());
			input.reset();
			
			//to be able to take a full new line I had to re-initialize input
			input = new Scanner(System.in);
			
			System.out.print("Student Address: ");
			stud.setAddress(input.nextLine());
			input.reset();
			
			while(true) {
				System.out.print("Student Age: ");
				try {
					stud.setAge(input.nextInt());
					input.reset();
					break;
				}catch(InputMismatchException e) {
					System.out.println("You need to enter an integer value!");
				}
				input = new Scanner(System.in);
			}
			
			if(college.findStudent(stud.fullName())!=null) {
				System.err.printf("Student '%s' already exists, no entry added!\n", stud.fullName());
			}else {
				college.addStudent(stud);
			}
			break;
		
		//student report	
		case "5b":
			stud = new Student();
			
			System.out.print("Student Name: ");
			stud = college.findStudent(input.nextLine());
			input.reset();
			
			if(stud==null) {
				System.out.println("No such Student!");
			}else {
				stud.report();
			}
			break;
		}
		
		return college;
	}
}
