package gameSimulation;

public class SalesManager implements ISalesService{

	@Override
	public void Sales(Member member, Game game) {
	 System.out.println(member.getFirstName() +" "+ member.getLastName() + " oyuncusu " + game.getGameName() + " oyununu satın aldı");
		
	}

	@Override
	public void SalesWithCampaing(Member member, Game game, Campaign campaign) {
		System.out.println(member.getFirstName() +" "+ member.getLastName() + " oyuncusu " + game.getGameName() + " oyununu " 
	+ campaign.getCampaignName() + " kampanyasıyla " + campaign.getDiscount() + " % indirimle satın aldı");
		
	}
	

}
