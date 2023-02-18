package gameSimulation;

public class Campaign {
	
	private String campaignName;
	private int discount;
	
	public Campaign(String campaignName, int discount) {
		super();
		this.campaignName = campaignName;
		this.discount = discount;
		
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	

}
