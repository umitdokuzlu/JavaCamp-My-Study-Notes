package kodlamaio;

public class PersonManager {
	public PersonManager() {
		
	}
	public void register(BasePerson person) {
		System.out.println("giriş yaptınız");
	}
	public void register(BasePerson person,BasePersonManager basePersonManager) {
		System.out.println("giriş yaptınız ");
		basePersonManager.message(person);
	}
	public void registerMulti(BasePerson[] persons, BasePersonManager basePersonManager) {
		for(BasePerson person:persons) {
			register(person);
			basePersonManager.message(person);
		}
	}
}
