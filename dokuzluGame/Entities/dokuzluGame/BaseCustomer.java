package dokuzluGame;

public class BaseCustomer extends Gamer {
	private String gameName;
	
	public BaseCustomer() {
		
	}
	
	public BaseCustomer(int id, String gameName) {
		this.gameName = gameName;
	}


	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
