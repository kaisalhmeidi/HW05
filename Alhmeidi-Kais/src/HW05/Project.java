package HW05;

import java.util.HashSet;
import java.util.Set;

public class Project {
	
	private String name;
	private Set<Student> students= new HashSet<>();
	private Course course;
	
	
	public Project(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
		if (course == null) {
			this.course = DefaultObjects.DEFAULT_COURSE;
		}
	}

	
	public void addMembers(Student student) {
		students.add(student);
		student.setProject(this);
	}

	
	//Getters&Setters

	public Set<Student> getMembers(){
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	public Set<Student> getStudents() {
		return students;
	}
	
	

}
