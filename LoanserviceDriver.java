package com.cg.service;

import java.util.Scanner;

public class LoanServiceDriver {
	public static void main(String args[]) {
		String accountId;
		String amount;
		String tenure;
		String creditScore;
		String roi;
		String loanType;
		String loanStatus;
		
		Scanner sc = new Scanner(System.in);
		LoanServiceImplementation LSI= new LoanServiceImplementation();
		while(true) {
			System.out.println("Enter the AccountId");
			accountId = sc.next();
			boolean accountIdFlag=  Utilities.accountIdValidation(accountId);
			if(!accountIdFlag)
				System.out.println("Please enter valid account id ");
			else
				break;
		}
		while(true) {
			System.out.println("Enter the Loan Amount");
			amount = sc.next();
			boolean amountFlag = Utilities.amountValidation(amount);
			if(!amountFlag)
				System.out.println("Please enter amount in numeric");
			else if(Double.parseDouble(amount) < 1000 || Double.parseDouble(amount) > 10000000)
				System.out.println("Please enter the amount between 1000 to 10000000");
			    
			else
				break;
		}
		while(true) {
			System.out.println("Enter the Tenure");
			tenure = sc.next();
			boolean tenureFlag=  Utilities.tenureValidation(tenure);
			if(!tenureFlag)
				System.out.println("Please enter valid Tenure ");
			else if(Integer.parseInt(tenure)<12 || Integer.parseInt(tenure)>240)
				System.out.println("Please enter tenure between 12 to 240");
			else
				break;
			
		}
		while(true) {
			System.out.println("Enter the Credit score");
			creditScore = sc.next();
			boolean creditScoreFlag=  Utilities.creditScoreValidation(creditScore);
			if(!creditScoreFlag)
				System.out.println("Please enter valid Credit Score");
			else if(Integer.parseInt(creditScore)<100 || Integer.parseInt(creditScore)>999)
				System.out.println("Please enter tenure between 100 to 999");
			else
				break;
		}
		
		while(true) {
			System.out.println("Enter the rate of interest");
			roi = sc.next();
			boolean ROIFlag=  Utilities.roiValidation(roi);
			if(!ROIFlag)
				System.out.println("Please enter valid Rate of interest ");
			else if(Double.parseDouble(roi)<4 || Double.parseDouble(roi)>15)
				System.out.println("Please enter the roi between 4 to 15");
			else
				break;
		}
		while(true) {
			System.out.println("Enter the loan type");
		    loanType = sc.next();
			boolean loanTypeFlag=  Utilities.typeValidation(loanType);
			if(!loanTypeFlag)
				System.out.println("Please enter valid loan type ");
			else
				break;
			
		}
		while(true) {
			System.out.println("What is the loan status");
			loanStatus = sc.next();
			boolean loanStatusFlag=  Utilities.statusValidation(loanStatus);
			if(!loanStatusFlag)
				System.out.println("Please enter valid loan status ");
			else
				break;
		}
		
        LSI.setAccountId(accountId);	
		LSI.setAmount(Double.parseDouble(amount));
		LSI.setTenure(Integer.parseInt(tenure));
		LSI.setCreditScore(Integer.parseInt(creditScore));
		LSI.setRoi(Double.parseDouble(roi));
		LSI.setLoanType(loanType);
		LSI.setLoanStatus(loanStatus);
		System.out.println(LSI);
		sc.close();
		
	}

}

