package fourPillars;

public class Students implements Person {
	int rollNo = 0;
	double marks = 0;
	String schoolName = "";

	public Students() {
		super();
	}

	public String toString() {
		return name + "\n" + age + "\n" + rollNo + "\n" + marks + "\n" + schoolName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub

	}

	@Override
	public void water() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}
