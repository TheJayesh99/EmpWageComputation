package com.empwagecomputation;


public class App 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int PART_TIME = 4;
	public static final int FULL_DAY = 8;
	public static final int WAGE_PER_HOUR = 20;
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int TOTAL_WORKING_HOURS = 100;
			
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Computation" );
        int totalWage = 0;
        int dailyWage= 0;
        int workingHrs=0;
        int workingdays=0;
        
       while (workingHrs < TOTAL_WORKING_HOURS && workingdays < TOTAL_WORKING_DAYS )
       {
        double empCheck = Math.floor(Math.random() * 10 ) % 3;
        
        switch ((int)empCheck) {
        
        case IS_FULL_TIME : {
		dailyWage = FULL_DAY * WAGE_PER_HOUR;    
       	System.out.println("Employee is Present for Full Time ");
       	System.out.println("Daily wage is :"+ dailyWage);
       	workingHrs=workingHrs+FULL_DAY;
       	
       	break;			
        }
        
		case IS_PART_TIME: {
		dailyWage = PART_TIME * WAGE_PER_HOUR;    
       	System.out.println("Employee is Present for Part Time ");	
       	System.out.println("Daily wage is :"+ dailyWage);
       	workingHrs=workingHrs+PART_TIME;
       	
       	break;
		}
		
		default:
			dailyWage=0;
			System.out.println("Employee is Absent");
		}
        workingdays++;
        totalWage = totalWage + dailyWage;
       }
       
       System.out.println("Total salary :"+ totalWage);
       
      }
}
