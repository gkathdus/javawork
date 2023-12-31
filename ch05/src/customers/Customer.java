package customers;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	// 보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return price;
	}
	
	// 정보 출력
	public String showCustomerInfo() {
		return customerName + "의 등급" + customerGrade +
				"이며" + " 보너스 포인트: " + bonusPoint;
	}

}
