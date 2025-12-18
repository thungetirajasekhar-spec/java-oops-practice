import java.util.Scanner;

/* -------- Custom Exceptions -------- */

class CountryNotValidException extends Exception {
    public CountryNotValidException(String msg) {
        super(msg);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String msg) {
        super(msg);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String msg) {
        super(msg);
    }
}

/* -------- Tax Calculator -------- */

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        // Validation 1: Country
        if (!isIndian) {
            throw new CountryNotValidException(
                "The employee should be an Indian citizen for calculating tax"
            );
        }

        // Validation 2: Name
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException(
                "The employee name cannot be empty"
            );
        }

        // Tax calculation
        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException(
                "The employee does not need to pay tax"
            );
        }
    }
}

/* -------- Main Class -------- */

public class CalculatorSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaxCalculator tc = new TaxCalculator();

        try {
            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Is Employee Indian? (true/false): ");
            boolean isIndian = sc.nextBoolean();

            System.out.print("Enter Employee Salary: ");
            double empSal = sc.nextDouble();

            double tax = tc.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);
        }
        catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        }
        catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }
        catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
