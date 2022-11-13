package HW05;

import java.util.HashSet;
import java.util.Set;

public class Department {
	
	private String name;
	
	private Set<Employee> employees= new HashSet<>();
	private Set<Course> courses = new HashSet<>();
	
	
	public Department(String name) {
		super();
		this.name = name;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		employee.setDepartment(this);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		course.setDepartment(this);
	}
	
	
	
	
	//Getters&Setters

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
}
