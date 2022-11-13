package HW05;

import java.util.ArrayList;

public class Course {
	
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private ArrayList<Project> projects = new ArrayList<>();
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Exam> exams = new ArrayList<>();
	private ArrayList<Professor> professors = new ArrayList<>();
	private Department department;
	
	
	public Course(int id, String name, int maxCapacity, boolean isFull,Department department) {
		super();
		this.id = id;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.isFull = isFull;
		this.department = department;
	}
	
	public void enroll(Student student) {
		students.add(student);
		student.getCourses().add(this);	
	}
	
	public void addProfessor(Professor professor) {
		if (professors.size() < 3) {
			professors.add(professor);
			professor.getCourses().add(this);
		}
	}
	
	public void addExam(Exam exam) {
		exams.add(exam);
		exam.getCourses().add(this);
	}
	
	public void addProject(Project project) {
		projects.add(project);
		project.setCourse(this);
	}
	
	
	
	
	
	//Getters&Setters
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Exam> getExams() {
		return exams;
	}

	public void setExams(ArrayList<Exam> exams) {
		this.exams = exams;
	}

	public ArrayList<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(ArrayList<Professor> professors) {
		this.professors = professors;
	}
	
	

}
