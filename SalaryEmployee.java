//Name: Donovan Troshynski
//Class: 1620-002
//Program #: 1
//Due Date: 17 September 2015
//Honor Pledge: On my honor as a student of the University of Nebraska at Omaha,I have neither given nor received unauthorized help on this homework assignment.
//NAME: Donovan Troshynski


//Partners: NONE
//This program will create a simple class hierarchy built upon the Employee example used in class. It will create and output examples of an employee complete with their name, unique ID number, gender, employee status, wage, and hours/time worked.

package employeeType.subTypes;
import employeeType.employee.Employee;
public class SalaryEmployee extends Employee
{    
    private double salary;

    //Method Name: SalaryEmployee
    //Parameters: String fn, ln; char g; int en; double s
    //Return value(s): None
    //Partners: None
    //This method sets up the rest of the class by getting the variables from the superclass and initializing any other variables needed
    public SalaryEmployee(String fn, String ln, char m, char g, int empNum, boolean ft, double s)
    {
        super(fn, ln, m, g, empNum, ft);
        salary = s;
    }

    //Method Name: calculateWeeklyPay
    //Parameters: None
    //Return value(s): weekly pay amount, double
    //Partners: None
    //This method calculates the amount to be payed to SalaryEmployee for this week by dividing the yearly salary by the number of weeks in a year(52)
    public double calculateWeeklyPay()
    {
        return (salary/52);
    }

    //Method Name: annualRaise
    //Parameters: None
    //Return value(s): new salary, double
    //Partners: None
    //This method applies an annual raise of 6% to the SalaryEmployees's salary by multiplying the original salary by .06 then adding that value to the original salary
    public void annualRaise()
    {
        salary = (salary * 1.06);
    }

    //Method Name: holidayBonus
    //Parameters: None
    //Return value(s): the holiday bonus, double
    //Partners: None
    //This method applies a holiday bonus to the SalaryEmployee by returning 3% of the salary as the bonus(multiplying the salary by .03 then returning that amount)
    public double holidayBonus()
    {
        return (salary * 0.03);
    }

    //Method Name: resetWeek
    //Parameters: None
    //Return value(s): None
    //Partners: None
    //This method doesn't change anything about SalaryEmployee as there isn't any weekly values that need to be reset
    public void resetWeek()
    {
    }
    
    //Method Name: toString
    //Parameters: None
    //Return value(s): string
    //Partners: None
    //This method returns a string output for the SalaryEmployee with information including the employee number, last name, first name, gender, status, and salary
    @Override
    public String toString()
    {
        return String.format("%s%nSalary: %.2f%n", super.toString(), salary);
    }
}//end of class
