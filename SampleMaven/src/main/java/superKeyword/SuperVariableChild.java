package superKeyword;

public class SuperVariableChild extends SuperVariableParent {
	String name = "Nizam";
	public void print()
	{
		System.out.println("Super.name");
		System.out.println("name");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild ();
		obj.print();

	}

}
