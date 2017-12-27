//Name: Donovan Troshynski
//Class: 1620-002
//Program #: 1
//Due Date: 17 September 2015
//Honor Pledge: On my honor as a student of the University of Nebraska at Omaha, I have neither given nor recieved unauthorized help on this homework assignment.
//NAME: Donovan Troshynski
//Partners: NONE
//This program will create a simple class hierarchy built upon the Employee example used in class. It will create and output examples of employees including their name, unique ID number, gender, status, wage, hours worked, and any other info. It will also apply bonuses and raises to each employee according to their station at the "business".
import employeeType.employee.Employee;
import employeeType.subTypes.HourlyEmployee;
import employeeType.subTypes.SalaryEmployee;
import employeeType.subTypes.CommissionEmployee;
import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String args[])
    {
        //create references for our objects
        HourlyEmployee hourly;
        SalaryEmployee salary;
        CommissionEmployee commission;

        //the sum of all bonuses will be placed here
        double bonusPayout = 0;

        //create and print a new HourlyEmployee
        hourly = HourlyFactory();
        System.out.printf("\n%s\n", hourly);

        //create and print a new SalaryEmployee
        salary = SalaryFactory();
        System.out.printf("\n%s\n", salary);

        //create and print a new CommissionEmployee
        commission = CommissionFactory();
        System.out.printf("\n%s\n", commission);

        //alter some values of Hourly and Commission
        System.out.println("Increasing Hourly's hours worked by 50.");
        hourly.increaseHours(50);

        System.out.println("Increasing Commission's sales by 150,000.\n");
        commission.increaseSales(150000);

        //output weekly pay for each Employee
        System.out.printf("Hourly Payout: %.2f\n", hourly.calculateWeeklyPay());
        System.out.printf("Salary Payout: %.2f\n", salary.calculateWeeklyPay());
        System.out.printf("Commission Payout: %.2f\n\n", commission.calculateWeeklyPay());

        //find total bonus payout
        System.out.println("Finding total bonus payout...");
        bonusPayout += hourly.holidayBonus();
        bonusPayout += salary.holidayBonus();
        bonusPayout += commission.holidayBonus();

        System.out.printf("Bonus Payout is %.2f\n\n", bonusPayout);

        //reset the week and apply raises to all Employees
        System.out.println("Applying annual raises and resetting week...");
        hourly.resetWeek();
        hourly.annualRaise();
        salary.resetWeek();
        salary.annualRaise();
        commission.resetWeek();
        commission.annualRaise();

        //output Employees after changes
        System.out.printf("%s\n%s\n%s\n", hourly, salary, commission);
    }

    //retrieve input and create HourlyEmployee
    public static HourlyEmployee HourlyFactory()
    {
        System.out.println("Creating HourlyEmployee...");
        return new HourlyEmployee("Steve", "Rogers", 'A', 'M', 12345, true, 15.34);
    }

    //Retrieve input and create SalaryEmployee
    public static SalaryEmployee SalaryFactory()
    {
        System.out.println("Creating SalaryEmployee...");
        return new SalaryEmployee("Kitty", "Pryde", 'X', 'F', 54321, true, 75000);
    }

    //Retrieve input and create CommissionEmployee
    public static CommissionEmployee CommissionFactory()
    {
        System.out.println("Creating CommissionEmployee...");
        return new CommissionEmployee("Johnny", "Storm", 'F', 'L', 976499, false, 2.5);
    }
}
