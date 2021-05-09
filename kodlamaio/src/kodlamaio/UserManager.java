package kodlamaio;

public class UserManager extends BasePersonManager{
	@Override
	public void message(BasePerson person) {
		System.out.println("hoþgeldiniz Kullanýcý " + person.getFirstName() +" "+ person.getLastName());
	}
}
