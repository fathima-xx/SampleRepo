package execptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age = 10;
		if(age>=18)
		{
			System.out.println(" eligible fot voting");
		
		}
		else
		{
			throw new NumberFormatException("age under 18/ ");
		}

	}

}
