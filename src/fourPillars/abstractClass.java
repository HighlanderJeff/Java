package fourPillars;

public abstract class abstractClass implements Food{
	public String sirName;
	public String firstName;
	public int id;
	
	
	public abstractClass(String sirName, String firstName, int id){
	
	}
	
	
	
	public abstract String testMethod();

	public String getSirName() {
		return sirName;
	}

	public void setSirName(String sirName) {
		this.sirName = sirName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}


class employee extends abstractClass{

	
	
	public employee(String sirName, String firstName, int id) {
		super(sirName, firstName, id);
		this.sirName=sirName;
		this.firstName=firstName;
		this.id=id;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String testMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString() {
		
		return getFirstName()+" "+getSirName()+"\n"+getId();
	}
	
	
	@Override
	public void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void water() {
		// TODO Auto-generated method stub
		
	}
	
}

