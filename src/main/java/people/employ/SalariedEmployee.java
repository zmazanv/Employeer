package people.employ;

import java.text.DecimalFormat;

public class SalariedEmployee extends people.Employee {

    // Instance variables
    private double yearlySalary;

    // Constructors
    public SalariedEmployee(String firstName, String lastName, double yearlySalary) {
        super(firstName, lastName);
        DecimalFormat two = new DecimalFormat("#.##");
        this.yearlySalary = Double.parseDouble(two.format(yearlySalary));
    }

    // Getters
    public double getYearlySalary() {
        return this.yearlySalary;
    }

    // Setters
    public void setYearlySalary(float yearlySalary) {
        DecimalFormat two = new DecimalFormat("#.##");
        this.yearlySalary = Float.parseFloat(two.format(yearlySalary));
    }

    // Instance methods
    @Override
    public double calculatePay() {
        double weeklySalary = yearlySalary / (365 / 7);
        DecimalFormat two = new DecimalFormat("#.##");
        weeklySalary = Double.parseDouble(two.format(weeklySalary));
        return weeklySalary;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[Employee Name]: " + this.getFullName() + '\n');
        description.append("[Identification Number]: " + this.getIdentificationNumber() + '\n');
        description.append("\t[Yearly Salary]: $" + this.getYearlySalary() + '\n');
        description.append("\t[Weekly Salary]: $" + this.calculatePay());
        return description.toString();
    }
}
