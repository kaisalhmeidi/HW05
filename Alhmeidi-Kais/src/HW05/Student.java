package HW05;

import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	private Project project;
	private ArrayList<Exam> exams = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();

	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		courses.add(DefaultObjects.DEFAULT_COURSE);
	}
	
	
	public void addExam(Exam exam) {
		exams.add(exam);
		exam.getStudents().add(this);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		course.getStudents().add(this);
	}
	
	//Getters&Setters
	

	public String getName() {
		return name;
	}


	public Project getProject() {
		return project;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	public ArrayList<Exam> getExams() {
		return exams;
	}


	public void setExams(ArrayList<Exam> exams) {
		this.exams = exams;
	}


	public ArrayList<Course> getCourses() {
		return courses;
	}


	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	

}
