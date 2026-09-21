package superKeyword;

public class SuperMethodChild extends SuperMethodParent{
	public void print()
	{
		super.display();
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.print();

	}

}
