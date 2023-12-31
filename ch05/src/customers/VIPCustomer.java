package customers;

public class VIPCustomer extends Customer {
	private int agentId;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	// 구매 가격 = 가격 - (가격 * 구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;

	}


	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 ID는 "
		+ agentId + "입니다.";
	}
	

}
