package mypack0;

public class DefaultConstructor {

	int id;
	String name;
	//Contructor created by jvm on runtime
	void display() {
		System.out.println(id + " "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor obj1 = new DefaultConstructor();
		DefaultConstructor obj2 = new DefaultConstructor();
		obj1.display();
		obj2.display();
	}

}
