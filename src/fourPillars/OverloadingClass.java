package fourPillars;

public class OverloadingClass {

	float floatVal;
	double doubleVal;

	public static String show() {
		return "This is a statement";
	}

	public static void testMethod1(float testFloat, double testDouble) {

		System.out.println(testFloat);
	}

	public static void testMethod2(double testDouble, float testFloat) {

	}
}

class OverloadingChild extends OverloadingClass {
	
	public static String show() {
		return "this method has been overriden";
	}

	public static void testMethod1(double testDouble, float testFloat) {

		System.out.println("overide" + testFloat);
	}

	public static void testMethod2(float testFloat, double testDouble) {

		System.out.println("overide" + testDouble);
	}
}
