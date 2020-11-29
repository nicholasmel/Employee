/*************************************************************************************************
 * Nicholas Mel
 * Description: The Menu class displays a menu of choices to a user
 * and performs the chosen task. It will keep asking a user to
 * enter the next choice until the choice of 'Q' (Quit) is entered.
 ********************************************************************************************/


public class EmployeeParser {

    public static Employee parseStringToEmployee(String lineToParse) {
        Employee e = null;
        String[] token = lineToParse.split("/");
        double rate = 0.0;
        double bonus = 0.0;
        int hours = 0;

        String type = token[0];
        String firstName = token[1];
        String lastName = token[2];
        String employeeId = token[3];

        if (type.equals("FullTime")) {
            return new FullTime(firstName, lastName, employeeId, rate, bonus);
        }

        if (type.equals("PartTime")) {
            rate = Double.parseDouble(token[4]);
            hours = Integer.parseInt(token[5]);
            return new PartTime(firstName, lastName, employeeId, rate, hours);
        }

        if (type.equals("Volunteer")) {
            return new Volunteer(firstName, lastName, employeeId, hours);
        }

        else {
            return e;
        }
    }
}
