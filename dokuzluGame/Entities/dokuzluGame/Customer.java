package dokuzluGame;

public class Customer extends Gamer {

	private String nationality;
	private String dateOfBirthDay;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, String nationality, String dateOfBirthDay) {
		this.nationality = nationality;
		this.dateOfBirthDay = dateOfBirthDay;
	}



	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public void setDateOfBirthDay(String dateOfBirthDay) {
		this.dateOfBirthDay = dateOfBirthDay;
	}
}
