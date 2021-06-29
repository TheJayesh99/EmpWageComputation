package com.empwagecomputation;

public class EmployeeWage 
{
	public int wagePerHour ;
	public int numberOfWorkingDays;
	public int workHrsPerMonth;
	public String company;
	public int totalEmpWAge;
	public EmployeeWage(int wagePerHour, int numberOfWorkingDays, int workHrsPerMonth, String company) 
	{
		super();
		this.wagePerHour = wagePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.workHrsPerMonth = workHrsPerMonth;
		this.company = company;	
	}
	
	@Override
	public String toString() 
	{
		return "Total EmployeeWage for company = " + company + ",having wagePerHour = " + wagePerHour + ", numberOfWorkingDays = " + numberOfWorkingDays
				+ ", workHrsPerMonth = " + workHrsPerMonth + " totalEmpWAge = " + totalEmpWAge;
	}


	public void setTotalEmpWAge(int totalEmpWAge)  
	{
		this.totalEmpWAge = totalEmpWAge;
	}
	
	
	

}
