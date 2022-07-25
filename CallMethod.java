package mypack0;

//call by value
public class CallMethod {
int val = 5000;
int operation(int val) {
	val = val*10/100;
	return val;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethod d = new CallMethod();
		System.out.println("Befor operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
	}

}
