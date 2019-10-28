package Structure;

public class Glober {
	
	private String name;
	private double salary;
	private boolean assignProject;
	
	// CONSTRUCTOR
	public Glober(String name, double salary, boolean assignProject) {
		this.name = name;
		this.salary = salary;
		this.assignProject = assignProject;
	}
	
	//SETTERS	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setProject(boolean assignProject) {
		this.assignProject = assignProject;
	}
	
	public void setSalary(double newSalary) {
		
		salary = newSalary;
	}
	
	// Getters
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public boolean getProject() {
		return assignProject;
	}
	
	// Return all information
	
	public String globerInformation() {
		return "His/Her name is: "+name+" Salary per mounth: "+salary+" pesos"+" Assign to a project: "+assignProject;  
	}
	
	public String takeAcamicaCourse() {
		return "Taking the course";
	}
	
	
	
}
