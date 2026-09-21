package polymorphism;

public class Child  extends Parent{
public void print(int a,int b)
{
	super.display(3,5);
	int c = a-b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print(5,2);

	}

}
