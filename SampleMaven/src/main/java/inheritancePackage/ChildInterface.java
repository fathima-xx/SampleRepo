package inheritancePackage;

public class ChildInterface implements MultipleParent1,MultipleParent2{

	

	public static void main(String[] args) {
		ChildInterface 	obj = new ChildInterface();
		obj.display();
		obj.show();
		
	}

	@Override
	public void show() {
		System.out.println("hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("heyy");
		// TODO Auto-generated method stub
		
	}
	
	}
