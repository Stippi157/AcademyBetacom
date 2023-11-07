package betacom.utilities;

public class AccountBalance {
	
	private TransactionType type;
	private double amount;
	private double balanceAfterTransaction;
	public AccountBalance() {
		this.amount = 0;
		this.balanceAfterTransaction = 0; 
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalanceAfterTransaction() {
		return balanceAfterTransaction;
	}
	public void setBalanceAfterTransaction(double balanceAfterTransaction) {
		this.balanceAfterTransaction = balanceAfterTransaction;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	
}
