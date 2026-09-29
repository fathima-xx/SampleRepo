package execptionhandling;

public class CustomExecption {

	public static void main(String[] args) throws VotingException {
		int age = 10;
		if(age>=18)
		{
			System.out.println(" eligible fot voting");
		
		}
		else
		{
			throw new VotingException("age under 18/ ");
		}


	}

}
