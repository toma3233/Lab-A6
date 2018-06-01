/**
 * Taxes class - class used to calculate the federal, social security and state taxes
 * @author Tom Abraham
 * @period #1
 */
public class Taxes {
	//declare instance variables

	private double hoursWorked;
	private double hourlyRate;

	//declare constants

	final double FEDTAXRATE = 0.15;
	final double SOCSECURITYRATE = 0.0765;
	final double STATETAXRATE = 0.04;


	/**
	 * constructor Taxes - initializes the hoursWorked and hourlyRate
	 */
	public Taxes(double hours, double rate)
	{
		hoursWorked = hours;
		hourlyRate = rate;
		
	}// end constructor
	/**
	 * Accessor method to get hours worked
	 * @return the hours worked
	 */
	public double getHoursWorked()
	{

		return hoursWorked;

	}// end method
	/**
	 * Accessor method to get hourly rate
	 * @return the hourly rate
	 */	
	public double getHourlyRate()
	{

		return hourlyRate;

	}// end method
	/**
	 * Accessor method to get federal tax rate
	 * @return the federal tax rate
	 */	
	public double getFedTaxRate()
	{

		return FEDTAXRATE;

	}// end method
	/**
	 * Accessor method to get social security tax rate
	 * @return the social security tax rate
	 */	
	public double getSocSecurityRate()
	{

		return SOCSECURITYRATE;

	}// end method
	/**
	 * Accessor method to get state tax rate
	 * @return the state tax rate
	 */	
	public double getStateTaxRate()
	{

		return STATETAXRATE;

	}// end method
	/**
	 * Method to compute the gross pay - pay before taxes
	 * @return gross pay
	 */
	public double computeGrossPay()
	{

		return hoursWorked * hourlyRate;

	}// end method
	/**
	 * Method to compute the amount of federal tax
	 * @return federal tax
	 */
	public double computeFedTax()
	{

		return computeGrossPay() * FEDTAXRATE;

	}//end method
	/**
	 * Method to compute the amount of social security tax
	 * @return social security tax
	 */
	public double computeSocSecurity()
	{

		return computeGrossPay() * SOCSECURITYRATE;

	
	}//end method
	/**
	 * Method to compute the amount of state tax
	 * @return state tax
	 */
	public double computeStateTax()
	{

		return computeGrossPay() * STATETAXRATE;


	}//end method
	/**
	 * Method to compute the amount of total tax
	 * @return total tax
	 */
	private double computeTotalTax()
	{

		return computeFedTax() + computeSocSecurity() + computeStateTax();

	}//end method
	/**
	 * Method to compute the amount of net pay - pay after taxes
	 * @return net pay
	 */
	public double computeNetPay()
	{
		
		return computeGrossPay() - computeTotalTax();

	}//end method
	
}
