/*************************************************************************************************
 * Nicholas Mel
 * Description: The Menu class displays a menu of choices (add volunteers, full time employees,
 * or part time employees, compute their pay, search an employee, list employees, quit, display menu)
 * to a user. Then it performs the chosen task. It will keep asking a user to enter the next choice until
 * the choice of 'Q' (Quit) is entered.
 ********************************************************************************************/

import java.io.*;
import java.util.*;

public class Menu {

    public static void main(String[] args) {
        String line = new String();
        String inputInfo = new String();
        char input;
        boolean op = false;

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(isr);

            do {
                System.out.println("Perform action");
                printMenu();
                line = stdin.readLine().trim();
                input = line.charAt(0);
                input = Character.toUpperCase(input);

                if (line.length() == 1) {
                    switch(input) {
                        case 'A':
                            System.out.println("Example Entry: FullTime FirstName LastName EmployeeID\n" +
                                    "Please enter information to add:\n");
                            inputInfo = stdin.readLine().trim();
                            employeeList.add(EmployeeParser.parseStringToEmployee(inputInfo));
                            break;
                        case 'C':
                            for (int i = 0; i < employeeList.size(); i++) {
                                System.out.println(employeeList.get(i).employeeInfo());
                                System.out.println("Pay Calculated");
                                break;
                            }
                        case 'S':
                            System.out.println("Search Employee:\n");
                            inputInfo = stdin.readLine().trim();
                            for (int i = 0; i < employeeList.size(); i++) {
                                if (employeeList.get(i).employeeId.equals(inputInfo)) {
                                    op = true;
                                    break;
                                } else {
                                    op = false;
                                }
                            }
                            if (op) {
                                System.out.println("Employee found\n");
                                break;
                            } else {
                                System.out.println("Employee not found\n");
                                break;
                            }
                        case 'D':
                            System.out.println("Delete Employee:\n");
                            inputInfo = stdin.readLine().trim();
                            for (int i = 0; i < employeeList.size(); i++) {
                                if (employeeList.get(i).employeeId.equals(inputInfo)) {
                                    employeeList.remove(i);
                                    op = true;
                                    break;
                                } else {
                                    op = false;
                                }
                            }
                            if (op) {
                                System.out.println("Employee deleted\n");
                                break;
                            } else {
                                System.out.println("Employee not deleted\n");
                                break;
                            }
                        case 'L':
                            if (employeeList.isEmpty()) {
                                System.out.println("No Employees");
                            } else {
                                for (int i = 0; i < employeeList.size(); i++) {
                                    System.out.println(employeeList.get(i).employeeInfo());
                                }
                            }
                            break;
                        case 'Q':
                            System.out.println("Quitting Program...\n");
                            break;
                        case '?':
                            printMenu();
                        default:
                            System.out.println("Unknown Input\n");
                            break;
                    }
                } else {
                    System.out.print("Unknown");
                }
            }
            while (input != 'Q');
            }
        catch (IOException exception) {
                System.out.print("Exception");
        }
    }

    public static void printMenu() {
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd Employee\n" +
                "C\t\tCompute Pay\n" +
                "S\t\tSearch for Employee\n" +
                "D\t\tDelete Employee\n" +
                "L\t\tList Employees\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Help\n\n");
    }

}
