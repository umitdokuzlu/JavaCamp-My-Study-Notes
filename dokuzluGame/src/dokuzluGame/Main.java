package dokuzluGame;

public class Main {

	public static void main(String[] args) {
		
		NewMemberManager member= new NewMemberManager(new ComfirmationManager());
		member.newMember();
		
		Customer customer = new Customer();
		customer.setFirstName("�mit");
		
		GameSalesManager gameSaled=new GameSalesManager(new CounterGame());
		gameSaled.Saled(customer);
		
		Campaign campaignName=new Campaign();
		campaignName.setCampaignName("s�per indirim");
		Campaign campaignName2=new Campaign();
		campaignName2.setCampaignName("s�per daw");
		
		
		CampaignManager campaign=new CampaignManager();
		campaign.add(campaignName);
		campaign.update(campaignName);
		campaign.delete(campaignName);

	}
	


}
