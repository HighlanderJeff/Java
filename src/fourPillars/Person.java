package fourPillars;

public interface Person extends Food {
	public   String name = "The Dude";
	public   int age = 50;
	
	public abstract int getAge();
	public abstract String getName();
	
	public abstract void setAge(int age);
	public abstract void setName(String name);
	
	

}
