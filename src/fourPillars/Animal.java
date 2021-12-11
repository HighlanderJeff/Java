package fourPillars;

public interface Animal {

	String textAwake=" is awake";
	String textSleep=" is asleep";
	public void wake();

	public void sleep();

}

class dog implements Animal {
	@Override
	public void wake() {
		// TODO Auto-generated method stub
		System.out.println("Dog"+textAwake);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog"+textSleep);
	}
}




class chicken implements Animal, Food {
	@Override
	public void wake() {
		// TODO Auto-generated method stub
		System.out.println("chicken"+textAwake);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("chicken"+textSleep);
	}

	public void food() {
		System.out.println("chicken"+textFood);

	}

	public void water() {
		System.out.println("chicken"+textWater);

	}

}