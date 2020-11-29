/*************************************************************************************************
 * Nicholas Mel
 * Description: Volunteer is a subclass of Employee class.
 * It represents a volunteer that works without any pay.
 ********************************************************************************************/

public class Volunteer extends Employee {

    private int hours;

    public Volunteer(String fullFirst, String fullLast, String fullId, int fullHours) {
        super(fullFirst, fullLast, fullId);
        pay = 0;
        hours = fullHours;
    }

    public void computePay() {
        pay = 0;
    }

    public String employeeInfo() {
        return "\nVolunteer Employee:\t\t" + super.employeeInfo() + "\n" +
                "Hours:\t\t" + fmt.format(hours) + "\n";
    }

}
