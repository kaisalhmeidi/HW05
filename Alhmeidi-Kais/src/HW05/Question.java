package HW05;

public class Question {
	
	private int id;
	private int value;
	private String task;
	
	
	public Question(int id, int value, String task) {
		super();
		this.id = id;
		this.value = value;
		this.task = task;
	}

	
	
	
	//Getters&Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}
	
	
	
	
	

}
