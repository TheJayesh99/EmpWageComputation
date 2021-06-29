package com.empwagecomputation;


public class EmployeeWageComputation 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int PART_TIME = 4;
	public static final int FULL_DAY = 8;
	public int wagePerHour ;
	public int numberOfWorkingDays;
	public int workHrsPerMonth;
	public String company;
	public int totalEmpWAge;

	public EmployeeWageComputation[]  companyEmployeeArray;
	private int numOfCompanies = 0 ;

	public EmployeeWageComputation(int wagePerHour, int numberOfWorkingDays, int workHrsPerMonth, String company) {
		super();
		this.wagePerHour = wagePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.workHrsPerMonth = workHrsPerMonth;
		this.company = company;
		this.companyEmployeeArray = new EmployeeWageComputation[5];
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


	public void addEmployee() 
	{
		companyEmployeeArray[numOfCompanies] = new EmployeeWageComputation(wagePerHour, numberOfWorkingDays, workHrsPerMonth, company);
		numOfCompanies++;
	}

	public void calculateEmpWage() 
	{
		for (int index = 0; index < companyEmployeeArray.length; index++) 
		{
			if(companyEmployeeArray[index] != null)
			{
				EmployeeWageComputation companyEmployeeWage = companyEmployeeArray[index];
				int totalSalaray = this.calculateEmployeeSalary(companyEmployeeWage);
				companyEmployeeWage.setTotalEmpWAge(totalSalaray);
				System.out.println(companyEmployeeArray[index]);

			}
		}
	}

	private int calculateEmployeeSalary(EmployeeWageComputation companyEmployeeWage)
	{
		int totalWage = 0;
		int workingHrs=0;
		int workingdays=0;
		int dailyWage = 0;
		while (workingHrs < companyEmployeeWage.workHrsPerMonth && workingdays < companyEmployeeWage.numberOfWorkingDays )
		{
			double empCheck = Math.floor(Math.random() * 10 ) % 3;
			switch ((int)empCheck) {
			case IS_FULL_TIME : {
				dailyWage = FULL_DAY * companyEmployeeWage.wagePerHour;    
				workingHrs=workingHrs+FULL_DAY;
				break;			
			}
			case IS_PART_TIME: {
				dailyWage = PART_TIME * companyEmployeeWage.wagePerHour;    
				workingHrs=workingHrs+PART_TIME;
				break;
			}
			default:
				dailyWage=0;
			}
			workingdays++;
			totalWage = totalWage + dailyWage;
		}
		return totalWage;
	}

	public static void main( String[] args )
	{
		System.out.println( "Welcome to Employee Wage Computation" );
		EmployeeWageComputation empWageForDmart = new EmployeeWageComputation(20,20,100,"Dmart");
		EmployeeWageComputation empWageForRelience = new EmployeeWageComputation(30,25,120,"Jio");
		empWageForDmart.addEmployee();
		empWageForRelience.addEmployee();	
		empWageForDmart.calculateEmpWage();
		empWageForRelience.calculateEmpWage();
		
	}
}
