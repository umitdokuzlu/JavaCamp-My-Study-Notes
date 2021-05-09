package kodlamaio;

public class InstructorManager extends BasePersonManager{
	@Override
	public void message(BasePerson person) {
		System.out.println("hoþgeldiniz eðitmen " + person.getFirstName() +" "+ person.getLastName());
	}
}
