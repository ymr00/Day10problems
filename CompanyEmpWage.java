package empwage;

public class CompanyEmpWage {
	 final String COMPANY_NAME;
	    final int WAGE_PER_HR;
	    final int MAX_WORKING_DAYS;
	    final int MAX_WORKING_HRS;
	    // instance variable
	    int totalEmpWage;

	    //parameterized constructor to get and set the values
	    CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	    {
	        COMPANY_NAME = companyName;
	        WAGE_PER_HR = wagePerHr;
	        MAX_WORKING_DAYS = maxWorkingDays;
	        MAX_WORKING_HRS = maxWorkingHrs;
	        totalEmpWage = 0;
	    }

	    void setTotalEmployeeWage(int totalEmpWage) 
	    {
	        this.totalEmpWage = totalEmpWage;
	    }

	    @Override
	    public String toString() {
	        System.out.println("Details of " + COMPANY_NAME + " employee");
	        System.out.println("-----------------------------------------------------");
	        System.err.println("Wage per hour:" + WAGE_PER_HR);
	        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
	        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
	        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
	    }

}
