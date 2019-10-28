package Structure;

public class Junior extends Glober {
	
	public Junior(String name, double salary, boolean assignProject) {
		super(name, salary, assignProject);
	}
	
	public String askfeedBack() {
		return getName()+" is asking for an evaluation";
	}
	
}
