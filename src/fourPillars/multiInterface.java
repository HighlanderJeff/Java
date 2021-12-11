package fourPillars;

public interface multiInterface extends Animal, Food {

}

class Animals implements multiInterface {

	public Animals(){
		
	}
	@Override
	public void wake() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

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