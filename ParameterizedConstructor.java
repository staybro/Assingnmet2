package mypack0;

public class ParameterizedConstructor {

	int id;
	String name;
	
	public ParameterizedConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor obj1 = new ParameterizedConstructor(2, "Alex");
		ParameterizedConstructor obj2 = new ParameterizedConstructor(3, "John");
		obj1.display();
		obj2.display();
	}

}
