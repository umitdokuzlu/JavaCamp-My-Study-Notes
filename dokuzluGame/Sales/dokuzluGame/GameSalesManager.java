package dokuzluGame;

public class GameSalesManager implements GameSales{
	
	private Game game;
	
	public GameSalesManager(Game game) {
		this.game = game;
	}

	@Override
	public void Saled(Gamer gamer) {
		game.gameName();
		System.out.println("satýn aldýn : " + gamer.getFirstName());
	}
	
}
