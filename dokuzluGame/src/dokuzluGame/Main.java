package dokuzluGame;

public class Main {

	public static void main(String[] args) {
		
		NewMemberManager member= new NewMemberManager(new ComfirmationManager());
		member.newMember();
		
		Customer customer = new Customer();
		customer.setFirstName("ümit");
		
		GameSalesManager gameSaled=new GameSalesManager(new CounterGame());
		gameSaled.Saled(customer);
		
		Campaign campaignName=new Campaign();
		campaignName.setCampaignName("süper indirim");
		Campaign campaignName2=new Campaign();
		campaignName2.setCampaignName("süper daw");
		
		
		CampaignManager campaign=new CampaignManager();
		campaign.add(campaignName);
		campaign.update(campaignName);
		campaign.delete(campaignName);

	}
	


}
