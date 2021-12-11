package fourPillars;

public class Driver {

	public static void main(String[] args) {
		assignment3();
		assignment2();
	}

	public static void assignment2() {
		
		OverloadingClass parentObj = new OverloadingClass();
		System.out.println(parentObj.show());
		
		OverloadingChild childObj = new OverloadingChild();
		System.out.println(childObj.show());
	
	}
	public static void assignment3() {
		// dog implements Animal
		dog dogObj = new dog();
		dogObj.sleep();
		dogObj.wake();

		// chicken implements Animal, AnimalFood
		chicken chickObj = new chicken();
		chickObj.sleep();
		chickObj.wake();
		chickObj.food();
		chickObj.water();

		// from abstract class: employee extends abstractClass, which implements Food
		// interface
		employee empObj = new employee("Smith", "Daved", 33);
		System.out.println("\n" + empObj.toString());

		// Students implements Person interface which extends food interface
		Students studentObj = new Students();
		studentObj.setName("The big guy");
		studentObj.setAge(25);
		studentObj.setMarks(75.5);
		studentObj.setRollNo(15);
		studentObj.setSchoolName("School of hard rock");
		System.out.println(studentObj.toString());
		

	}
}
