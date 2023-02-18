package gameSimulation;

public class Main {
	  public static void main(String[] args) {
	
    Game game1 = new Game(1,"Sims4",450);
    Game game2 = new Game(2, "Minecraft",300);
    Game game3 = new Game(3, "GTA",500);
    
    Member member1 = new Member(1,"Ece","Çabukçu",1234567,2001);
    Member member2 = new Member(2,"Melisa","Çabukçu",7654321,2006);
    
    Campaign campaign1 =new Campaign("Öğrenci",50);
    Campaign campaign2 =new Campaign("Aile",20);
    
    MemberManager memberManager =new MemberManager();
    GameManager gameManager=new GameManager();
    CampaignManager campaignManager =new CampaignManager();
    SalesManager salesManager =new SalesManager();

    memberManager.add(member1);
    gameManager.add(game1);
    campaignManager.update(campaign1);
    salesManager.Sales(member2,game3);
    salesManager.SalesWithCampaing(member2,game2,campaign2);
   
	  }
}
