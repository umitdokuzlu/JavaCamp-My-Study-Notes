package dokuzluGame;

public class NewMemberManager implements NewMemberService{
	
	ComfirmationService comfirmationManager;
	
	public NewMemberManager(ComfirmationService comfirmationManager) {
		this.comfirmationManager = comfirmationManager;
	}

	@Override
	public void newMember() {
		System.out.println("kayýt oldunuz. Hoþgeldiniz.");
		comfirmationManager.comfirmation();
	}

	


	
}
