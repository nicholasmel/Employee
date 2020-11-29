/*************************************************************************************************
 * Nicholas Mel
 * Description: PartTime is a subclass of Employee class.
 * It represents a part time employee in a company.
 ********************************************************************************************/

public class PartTime extends Employee {

    private double rate;
    private double hours;

    public PartTime(String fullFirst, String fullLast, String fullId, double fullRate, double fullHours) {
        super(fullFirst, fullLast, fullId);
        pay = 0;
        rate = fullRate;
        hours = fullHours;
    }

    public void computePay() {
        pay = rate * hours;
    }

    public String employeeInfo() {
        return "\nPartTime Employee:\t\t" + super.employeeInfo() + "\n" +
                "Rate:\t\t" + fmt.format(rate) + "\n" +
                "Hours:\t\t" + fmt.format(hours) + "\n";
    }

}
