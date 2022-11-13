package HW05;

import java.util.ArrayList;


public class Exam {
	
	private int maxValue;
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Question> questions = new ArrayList<>();
	private ArrayList<Professor> professors = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();
	
	
	public Exam(int maxValue) {
		this.maxValue = maxValue;
		questions.add(DefaultObjects.DEFAULT_QUESTION);
	}
	
	public void addQuestion(int id, String task, int value) {
		Question question = new Question(id, value, task);
		questions.add(question);
	}
	
	public void addStudent(Student student) {
		students.add(student);
		student.getExams().add(this);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		course.getExams().add(this);
	}
	
	public void addProfessor(Professor professor) {
		professors.add(professor);
		professor.getExams().add(this);	
	}
	
	public boolean isRegister(Student student) {
		for (Student student2 : students) {
			if (student.getId() == student2.getId()) {
				return true;
			}
		}
		return false;
	}
	
	
	//Getters&Setters

	public int getMaxValue() {
		return maxValue;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public ArrayList<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(ArrayList<Professor> professors) {
		this.professors = professors;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void setMaxValue(int max) {
		this.maxValue = max;
	}

}
