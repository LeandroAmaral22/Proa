package entities;

public class BusinessAccount extends Account {

	private Integer qtdWithdraw;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Integer qtdWithdraw) {
		super(number, holder, balance);
		this.qtdWithdraw = qtdWithdraw;
	}

	public Integer getQtdWithdraw() {
		return qtdWithdraw;
	}

	public void setQtdWithdraw(Integer qtdWithdraw) {
		this.qtdWithdraw = qtdWithdraw;
	}
	
}
