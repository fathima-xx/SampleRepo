package inheritancePackage;

public class HierarchicalChild2 extends HierarchicalChild1{
	public void display()
	{
		System.out.println("world");
	}
		public static void main(String[] args) {
			HierarchicalChild2 obj = new HierarchicalChild2();
			obj.print();
			obj.show();
			obj.display();
		}
}
