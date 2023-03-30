package people.employ;

import java.text.DecimalFormat;

public class HourlyEmployee extends people.Employee {

    // Instance variables
    private double hourlyRate;
    private double weeklyHoursWorked;

    // Constructors
    public HourlyEmployee(String firstName, String lastName, double hourlyRate, double weeklyHoursWorked) {
        super(firstName, lastName);
        DecimalFormat two = new DecimalFormat("#.##");
        this.hourlyRate = Double.parseDouble(two.format(hourlyRate));
        this.weeklyHoursWorked = Double.parseDouble(two.format(weeklyHoursWorked));
    }

    // Getters
    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public double getWeeklyHoursWorked() {
        return this.weeklyHoursWorked;
    }

    // Setters
    public void setHourlyRate(double hourlyRate) {
        DecimalFormat two = new DecimalFormat("#.##");
        this.hourlyRate = Double.parseDouble(two.format(hourlyRate));
    }

    public void setWeeklyHoursWorked(double weeklyHoursWorked) {
        DecimalFormat two = new DecimalFormat("#.##");
        this.weeklyHoursWorked = Double.parseDouble(two.format(weeklyHoursWorked));
    }

    // Instance methods
    @Override
    public double calculatePay() {
        double weeklyPay = this.hourlyRate * this.weeklyHoursWorked;
        return weeklyPay;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[Employee Name]: " + this.getFullName() + '\n');
        description.append("[Identification Number]: " + this.getIdentificationNumber() + '\n');
        description.append("\t[Hourly Rate]: $" + this.getHourlyRate() + '\n');
        description.append("\t[Weekly Hours Worked]: " + this.getWeeklyHoursWorked() + " hrs\n");
        description.append(("\t[Weekly Salary]: $" + this.calculatePay()));
        return description.toString();
    }
}
