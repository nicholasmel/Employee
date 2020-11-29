/*************************************************************************************************
 * Nicholas Mel
 * Description: FullTime is a subclass of Employee class.
 * It represents a full time employee that can also receive bonus in addition to salary.
 ********************************************************************************************/

public class FullTime extends Employee {

    private double rate;
    private double bonus;

    public FullTime(String fullFirst, String fullLast, String fullId, double fullRate, double fullBonus) {
        super(fullFirst, fullLast, fullId);
        pay = 0;
        rate = fullRate;
        bonus = fullBonus;
    }

    public void computePay() {
        pay = rate + bonus;
    }

    public String employeeInfo() {
        return "\nFullTime Employee:\t" + super.firstName + "\n" +
                "Rate:\t\t" + fmt.format(rate) + "\n" +
                "Bonus:\t\t" + fmt.format(bonus) + "\n";
    }
}
