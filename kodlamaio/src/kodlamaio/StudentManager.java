package kodlamaio;

public class StudentManager extends BasePersonManager{
	@Override
	public void message(BasePerson person) {
		System.out.println("hoþgeldiniz öðrenci " + person.getFirstName() +" " +person.getLastName());
	}
}
