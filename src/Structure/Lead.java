package Structure;

public class Lead extends Glober {

	public Lead(String name, double salary, boolean assignProject) {
		super(name, salary, assignProject);
	}
	
	public String LeadPeople() {
		return getName()+" is Leading people";
	}
	
	public String giveFeedBack() {
		return getName()+" is giving a feed-back";
	}

}
