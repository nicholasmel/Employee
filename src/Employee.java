/*************************************************************************************************
 * Nicholas Mel
 * Description: The Employee Class is an abstract class, which represents the basic attributes
 * of any employee in a company. It is used as the root of the company employee hierarchy.
 * It has the following attributes (should be protected):
 ********************************************************************************************/

import java.text.NumberFormat;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String employeeId;
    protected double pay;
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public Employee(String employeeFirst, String employeeLast, String employeeId) {
        this.firstName = employeeFirst;
        this.lastName = employeeLast;
        this.employeeId = employeeId;
        pay = 0.0;
    }

    public String getEmployee() {
        return employeeId;
    }

    public String employeeInfo() {
        return "\nFirst name:\t\t" + firstName + "\n" +
                "Last name:\t\t" + lastName + "\n" +
                "Employee ID:\t" + employeeId + "\n" +
                "Pay:\t\t\t" + fmt.format(pay) + "\n";
    }

}
