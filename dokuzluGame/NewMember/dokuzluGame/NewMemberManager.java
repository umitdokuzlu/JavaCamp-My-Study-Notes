package dokuzluGame;

public class NewMemberManager implements NewMemberService{
	
	ComfirmationService comfirmationManager;
	
	public NewMemberManager(ComfirmationService comfirmationManager) {
		this.comfirmationManager = comfirmationManager;
	}

	@Override
	public void newMember() {
		System.out.println("kay�t oldunuz. Ho�geldiniz.");
		comfirmationManager.comfirmation();
	}

	


	
}
