package HW05;

import java.util.ArrayList;


public class Professor extends Employee {
	
	
	private ArrayList<Course> courses = new ArrayList<>();
	private ArrayList<Exam> exams = new ArrayList<>();

	public Professor(String name, int employeeId, Department department) {
		super(name, employeeId, department);
		this.courses.add(DefaultObjects.DEFAULT_COURSE);
	}

	public void addCourse(Course course) {
		courses.add(course);
		course.getProfessors().add(this);
	}
	
	public void addExam(Exam exam) {
		exams.add(exam);
		exam.getProfessors().add(this);
	}

	
	//Getters&Setters
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public ArrayList<Exam> getExams() {
		return exams;
	}

	public void setExams(ArrayList<Exam> exams) {
		this.exams = exams;
	}
	
	
	
	

}
