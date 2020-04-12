package com.cg.service;

public class LoanServiceImplementation implements loanService {
	private String accountId;
	private double amount;
	private int tenure;
	private int creditScore;
	private double roi;
	private String loanType;
	private String loanStatus;

	public int loanId=0;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}


	@Override
	public void createLoanRequest() {
		// TODO Auto-generated method stub
		
		//We need to check the accountId from the customer table whether accountId is exist or not
	
		if(accountId != null) {
			loanId= loanId+1;
		}
	}

	@Override
	public void addLoanDetails() {
		// TODO Auto-generated method stub
		
			}

	@Override
	public void loanDisburse() {
		// TODO Auto-generated method stub
		if(creditScore>=670) {
			loanStatus = "Accepted";
		}
		else {
			loanStatus = "Rejected";
		}
		
	}

	@Override
	public String toString() {
		return "LoanServiceImplementation [accountId=" + accountId + ", amount=" + amount + ", tenure=" + tenure
				+ ", creditScore=" + creditScore + ", roi=" + roi + ", loanType=" + loanType + ", loanStatus="
				+ loanStatus + ", loanId=" + loanId + "]";
	}
	
	

}
