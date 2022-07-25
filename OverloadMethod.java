package mypack0;

public class OverloadMethod {

	// overload method is having same name but different arguments;
	
	public void area(int b, int h) {
		System.out.println("Area of Traingle is "+(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("Area of circle is "+(3.14*r*r));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OverloadMethod ob = new OverloadMethod();
			ob.area(20, 10);
			ob.area(5);
	}

}
