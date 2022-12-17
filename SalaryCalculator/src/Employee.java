public class Employee {
    // Attributes of the class
    private String name;
    private double salary;
    private double oldSalary;
    private int workHours;
    private int hireYear;

    // Current year
    private static final int CURRENT_YEAR = 2022;

    // Tax threshold
    private static final double TAX_THRESHOLD = 1000.0;

    // Tax rate
    private static final double TAX_RATE = 0.03;

    // Bonus rate
    private static final int BONUS_RATE = 30;

    // Salary raise rates
    private static final double RAISE_RATE_1 = 0.05;
    private static final double RAISE_RATE_2 = 0.1;
    private static final double RAISE_RATE_3 = 0.15;

    // Constructor method
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Method to calculate the tax applied to the salary
    public double tax() {
        if (salary < TAX_THRESHOLD) {
            return 0.0;
        } else {
            return salary * TAX_RATE;
        }
    }

    // Method to calculate the bonus wages
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * BONUS_RATE;
        } else {
            return 0.0;
        }
    }

    // Method to calculate the salary increase
    public double raiseSalary() {
        int yearsWorked = CURRENT_YEAR - hireYear;
        oldSalary = salary;
        if (yearsWorked < 10) {
            salary += salary * RAISE_RATE_1;
        } else if (yearsWorked < 20) {
            salary += salary * RAISE_RATE_2;
        } else {
            salary += salary * RAISE_RATE_3;
        }
        
        return salary - oldSalary;
    }

    // Method to print the employee information to the screen
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Salary: " + salary + "\n" +
               "Work Hours: " + workHours + "\n" +
               "Hire Year: " + hireYear + "\n" +
               "Tax : " + tax() + "\n" +
               "Bonus : " + bonus() + "\n" +
               "Salary raise : " + raiseSalary() + "\n" + 
               "Net salary : " + this.salary;
    }
}
