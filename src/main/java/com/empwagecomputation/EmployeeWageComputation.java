package com.empwagecomputation;

public class EmployeeWageComputation 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int PART_TIME = 4;
	public static final int FULL_DAY = 8;
	public EmployeeWage[] companyEmployeeArray;
	private int numOfCompanies = 0 ;


	public EmployeeWageComputation()
	{
		super();
		this.companyEmployeeArray = new EmployeeWage[5];
	}

	public void addEmployee(int wagePerHour ,int numberOfWorkingDays,int workHrsPerMonth,String company) 
	{
		companyEmployeeArray[numOfCompanies] = new EmployeeWage(wagePerHour, numberOfWorkingDays, workHrsPerMonth, company);
		numOfCompanies++;
	}

	public void calculateEmpWage() 
	{
		for (int index = 0; index < companyEmployeeArray.length; index++) 
		{
			if(companyEmployeeArray[index] != null)
			{
				EmployeeWage companyEmployeeWage = companyEmployeeArray[index];
				int totalSalaray = this.calculateEmployeeSalary(companyEmployeeWage);
				companyEmployeeWage.setTotalEmpWAge(totalSalaray);
				System.out.println(companyEmployeeArray[index]);

			}
		}
	}

	private int calculateEmployeeSalary(EmployeeWage companyEmployeeWage)
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
		EmployeeWageComputation empWage = new EmployeeWageComputation();
		empWage.addEmployee(20,20,100,"Dmart");
		empWage.addEmployee(30,25,120,"Jio");	
		empWage.calculateEmpWage();
	}
}
