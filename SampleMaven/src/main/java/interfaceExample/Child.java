package interfaceExample;

public class Child implements Parent{

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.print();	
	}

	@Override
	public void display() {
		System.out.println("hello");
		
	}

	@Override
	public void print() {
		System.out.println("heyy");
	}
		
	}
	
